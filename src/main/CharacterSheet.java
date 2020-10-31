package main;

import character.*;
import characterclass.CharacterClass;
import characterrace.CharacterRace;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.*;
import static utilities.PreloadedImages.*;

public class CharacterSheet extends JPanel implements MouseListener, KeyListener, MouseMotionListener{

    private CharacterInfo character;

    private boolean mainSheetDisplay;

    private ArrayList<JComponent> allComponents;

    public CharacterSheet(){
        character = new CharacterInfo();
        allComponents = new ArrayList<JComponent>();

        mainSheetDisplay = true;

        loadAllComponents();
        validate();

        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);

        setSize(sheetSize);
        setLocation((int)(sheetSize.getHeight() - sheetSize.getWidth()), 0);
        setLayout(null);
    }

    public CharacterSheet(int x, int y){
        this();
        setLocation(x, y);
    }

    public CharacterSheet(CharacterRace race, CharacterClass cclass){
        this();
        character.setRaceAndClass(race, cclass);
    }

    private void loadAllComponents(){
        DBTextAreaComponent tmp = new DBTextAreaComponent(getRelativeBounds(player_name_position));
        //tmp.setRows(1);
        tmp.setFont(player_name_font);
        allComponents.add(tmp);


        for (int i = 0; i < allComponents.size(); i++) add(allComponents.get(i));
    }

    public void switchScreens(){
        mainSheetDisplay = !mainSheetDisplay;
    }


    public void refresh(){

    }


    public ArrayList<JComponent> getAllComponents() {
        return allComponents;
    }

    /*
        Takes in an x and y from a sheet image and translates it to
        the point it will be on the window.
     */
    public static Point getRelativePos(int x, int y){
        return new Point(shiftInt(x), shiftInt(y));
    }

    public static Point getRelativePos(Point p){
        return new Point(shiftInt(p.getX()), shiftInt(p.getY()));
    }

    public static Rectangle getRelativeBounds(int x, int y, int wid, int hei){
        return new Rectangle(shiftInt(x), shiftInt(y), shiftInt(wid), shiftInt(hei));
    }

    public static Rectangle getRelativeBounds(Rectangle r){
        return new Rectangle(shiftInt(r.getX()), shiftInt(r.getY()), shiftInt(r.getWidth()), shiftInt(r.getHeight()));
    }

    private static int shiftInt(int s){
        return (int)(((double)s/layoutSheetUnit) * windowUnit);
    }

    private static int shiftInt(double s){
        return (int)((s/layoutSheetUnit) * windowUnit);
    }

    //KeyListener

    public void keyTyped(KeyEvent e) {
        int k = e.getKeyCode();

        switch(k) {
            case VK_ENTER:
                refresh();
                break;
            default:
                break;
        }
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    //MouseListener

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    //MouseMotionListener

    public void mouseDragged(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {}


    public void drawMainSheet(Graphics g){
        g.drawImage(layoutSheet, 0, 0, this);
        for (JComponent j:allComponents){
            DungeonsBeyond.drawUnderline(j, g);
        }
    }

    public void drawInfoSheet(Graphics g){

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(), getHeight());

        //g.setFont(new Font("Verdana", Font.PLAIN, FONT_SIZE));

        if (mainSheetDisplay){
            drawMainSheet(g);
        }
        else{
            drawInfoSheet(g);
        }
    }
}
