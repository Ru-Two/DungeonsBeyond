package main;

import character.*;
import characterclass.CharacterClass;
import characterrace.CharacterRace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static utilities.PreloadedImages.*;

public class CharacterSheet extends JPanel implements MouseListener, KeyListener, MouseMotionListener {

    private int FONT_SIZE = 20;

    private CharacterInfo character;

    private boolean mainSheetDisplay;

    private ArrayList<JComponent> allComponents;

    public CharacterSheet(){
        character = new CharacterInfo();
        allComponents = new ArrayList<JComponent>();

        mainSheetDisplay = true;

        FONT_SIZE = (int)(windowUnit/10);

        loadAllComponents();

        setSize(sheetSize);
        setLocation((int)(sheetSize.getHeight() - sheetSize.getWidth()), 0);

        addMouseListener(this);
    }

    public CharacterSheet(int x, int y){
        this();
        setLocation(x, y);
    }

    public CharacterSheet(CharacterRace race, CharacterClass cclass){
        this();

    }

    public void loadAllComponents(){

    }

    public void switchScreens(){
        mainSheetDisplay = !mainSheetDisplay;
    }

    /*
        Takes in an x and y from a sheet image and translates it to
        the point it will be on the window.
     */
    public Point getRelativePos(int x, int y){
        int newX = (int)(((double)x/layoutSheetUnit) * windowUnit);
        int newY = (int)(((double)y/layoutSheetUnit) * windowUnit);
        return new Point(newX, newY);
    }

    //KeyListener

    public void keyTyped(KeyEvent e) {}

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
    }

    public void drawInfoSheet(Graphics g){

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(), getHeight());

        g.setFont(new Font("Verdana", Font.PLAIN, FONT_SIZE));

        if (mainSheetDisplay){
            drawMainSheet(g);
        }
        else{
            drawInfoSheet(g);
        }
    }
}
