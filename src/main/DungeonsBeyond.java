package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class DungeonsBeyond extends JFrame implements ActionListener, KeyListener, MouseListener, MouseMotionListener{

    static final int OPTION_PANEL_HEIGHT = 160;

    Dimension screenSize;
    Dimension windowSize;
    Dimension sheetSize;
    Dimension sheetSizeRatio = new Dimension(17, 22);

    ArrayList<CharacterSheet> allSheets;
    CharacterSheet tmpCharacter = null;
    OptionPanel options;
    SheetListPanel sheetListPanel;

    CharacterSheet currentSheet = null;
    int currentSheetIndex = -1;

    Timer ticks;

    public DungeonsBeyond(){
        super("Dungeons Beyond");

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        sheetSize = new Dimension((int)((screenSize.getHeight()-50)*(sheetSizeRatio.getWidth()/sheetSizeRatio.getHeight())), (int)screenSize.getHeight()-50);

        windowSize = new Dimension((int)sheetSize.getHeight(), (int)sheetSize.getHeight());

        allSheets = new ArrayList<CharacterSheet>();

        options = new OptionPanel(0,0,(int)(sheetSize.getHeight() - sheetSize.getWidth()), OPTION_PANEL_HEIGHT);
        add(options);

        sheetListPanel = new SheetListPanel(0, (int)options.getHeight(), (int)options.getWidth(), (int)(windowSize.getHeight() - options.getHeight()));
        add(sheetListPanel);



        ticks = new Timer(2, this);
        ticks.start();


        tmpCharacter = new CharacterSheet((int)options.getWidth(), 0);
        addSheet(tmpCharacter);

        addKeyListener(this);
        addMouseListener(this);

        setIconImage(getImage("src/graphics/db_logo.png"));
        setSize(windowSize);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        super.paintComponents(g);
        if (currentSheetIndex >= 0){
            displayCurrentSheet(g);
        }
    }

    public static void main(String[] args){
        DungeonsBeyond sheetManager = new DungeonsBeyond();

    }

    public void displayCurrentSheet(Graphics g){

    }

    public void createNewSheet(){
        CharacterSheet newCharacter = new CharacterSheet((int)options.getWidth(), 0);
        addSheet(newCharacter);
    }

    public void addSheet(CharacterSheet cs){
        allSheets.add(cs);
        sheetListPanel.addSheet();
        add(allSheets.get(allSheets.size()-1));
        selectSheet(allSheets.size()-1);
    }

    public void selectSheet(int index){
        //currentSheet = allSheets.get(index);
        if (currentSheetIndex != -1) allSheets.get(currentSheetIndex).setVisible(false);
        currentSheetIndex = index;
        sheetListPanel.selectSheet(index);
        allSheets.get(currentSheetIndex).setVisible(true);
    }

    //ActionListener function

    public void actionPerformed(ActionEvent evt){
        repaint();
        /*if (tmpCharacter != null){
            tmpCharacter.revalidate();
            tmpCharacter.repaint();
        }*/
    }

    //KeyListener functions

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    //MouseListener functions

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){

            if (sheetListPanel.newSheetButtonIsClicked(translateForList(e.getPoint()))) {
                createNewSheet();
            }
            int tmpIndex = sheetListPanel.selectSheet(translateForList(e.getPoint()));
            if (tmpIndex != -1){
                selectSheet(tmpIndex);
            }
        }
    }


    public Point translateForList(Point p){
        return new Point((int)p.getX(), (int)(p.getY()-options.getHeight()));
    }

    public Point translateForSheet(Point p){
        return new Point((int)(p.getX()-options.getWidth()),(int)p.getY());
    }

    //Mouse motion listener

    public void mouseDragged(MouseEvent e){

    }

    public void mouseMoved(MouseEvent e){

    }

    //fetches image of specified path
    public static BufferedImage getImage(String path){
        BufferedImage newImage = null;
        try {
            newImage = ImageIO.read(new File(path));
            System.out.println("Successfully fetched: " + path);
        }
        catch(Exception e){
            System.out.println("Could not get image: " + path);
        }
        return newImage;
    }
}
