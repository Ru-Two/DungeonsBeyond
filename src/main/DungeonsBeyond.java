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
import static utilities.PreloadedImages.*;

public class DungeonsBeyond extends JFrame implements ActionListener, KeyListener, MouseListener, MouseMotionListener{

    static final int OPTION_PANEL_HEIGHT = 160;

    ArrayList<CharacterSheet> allSheets;
    CharacterSheet tmpCharacter = null;
    int currentSheetIndex = -1;

    OptionPanel options;

    SheetListPanel sheetListPanel;

    Timer ticks;

    public DungeonsBeyond(){
        super("Dungeons Beyond");

        allSheets = new ArrayList<CharacterSheet>();

        options = new OptionPanel(0,0,(int)(sheetSize.getHeight() - sheetSize.getWidth()), OPTION_PANEL_HEIGHT);
        options.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(options);

        sheetListPanel = new SheetListPanel(0, options.getHeight(), options.getWidth(), (int)(windowSize.getHeight() - options.getHeight()));
        sheetListPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(sheetListPanel);

        tmpCharacter = new CharacterSheet((int)options.getWidth(), 0);
        tmpCharacter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //addSheet(tmpCharacter);

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        ticks = new Timer(30, this);
        ticks.start();

        setIconImage(getImage("src/graphics/db_logo.png"));
        setSize(windowSize);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
    }

    public static void main(String[] args){
        DungeonsBeyond sheetManager = new DungeonsBeyond();

    }

    public void createNewSheet(){
        CharacterSheet newCharacter = new CharacterSheet(options.getWidth(), 0);
        newCharacter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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
        if (allSheets.size() > 0) {
            if (index < 0 || index >= allSheets.size()) return;
            if (currentSheetIndex >=0 ) allSheets.get(currentSheetIndex).setVisible(false);
            currentSheetIndex = index;
            sheetListPanel.selectSheet(index);
            allSheets.get(currentSheetIndex).setVisible(true);
        }
    }

    public void deleteSheet(int index){
        if (currentSheetIndex == index) {
            currentSheetIndex = -1;
        }
        currentSheetIndex--;
        allSheets.remove(index);
        sheetListPanel.deleteSheet(index);
        selectSheet(0);
    }

    //ActionListener function

    public void actionPerformed(ActionEvent evt){
        if (sheetListPanel.checkAddSheetFlag()){ createNewSheet(); }
        if (sheetListPanel.checkSheetDeleteFlag()){ deleteSheet(sheetListPanel.getDeleteBuffer()); }
        selectSheet(sheetListPanel.getSelectedSheet());

        repaint();
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

    }

    //Mouse motion listener

    public void mouseDragged(MouseEvent e){

    }

    public void mouseMoved(MouseEvent e){

    }

    //draws black rectangle around jcomponent
    public static void drawBox(JComponent j, Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(j.getX(), j.getY(), j.getWidth(), j.getHeight());
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
