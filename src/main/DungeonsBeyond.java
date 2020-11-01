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

    public static final int OPTION_PANEL_HEIGHT = 160;

    private ArrayList<CharacterSheet> allSheets;
    private CharacterSheet tmpCharacter = null;
    private int currentSheetIndex = -1;

    private OptionPanel options;

    private SheetListPanel sheetListPanel;

    private Timer ticks;

    private CharacterCreator cc;

    public DungeonsBeyond(){
        super("Dungeons Beyond");
        cc = new CharacterCreator();
        add(cc);

        allSheets = new ArrayList<CharacterSheet>();

        options = new OptionPanel(0,0,(int)(sheetSize.getHeight() - sheetSize.getWidth()), OPTION_PANEL_HEIGHT);
        options.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(options);

        sheetListPanel = new SheetListPanel(0, options.getHeight(), options.getWidth(), (int)(windowSize.getHeight() - options.getHeight()));
        sheetListPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(sheetListPanel);

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

    public void startSheetSelector(){
        cc.start();
    }

    public void createNewSheet(String info){
        System.out.println(info);
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
        if (allSheets.size() > 0) {
            if (index < 0 || index >= allSheets.size()) return;
            if (currentSheetIndex >=0 ) allSheets.get(currentSheetIndex).setVisible(false);
            currentSheetIndex = index;
            sheetListPanel.selectSheet(index);
            allSheets.get(currentSheetIndex).setVisible(true);
        }
    }

    public void deleteSheet(int index){
        allSheets.get(currentSheetIndex).setVisible(false);
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
        if (!cc.isRunning()) {
            if (sheetListPanel.checkAddSheetFlag()) {
                startSheetSelector();
            }
            if (sheetListPanel.checkSheetDeleteFlag()) {
                deleteSheet(sheetListPanel.getDeleteBuffer());
            }
            if (sheetListPanel.checkSheetChangeFlag()) {
                selectSheet(sheetListPanel.getSelectedSheet());
            }
        }
        if (cc.isReady()){
            String info = cc.getInformation();
            cc.finish();
            createNewSheet(info);
        }
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
        drawBox(j.getBounds(), g);
    }

    public static void drawBox(Rectangle rect, Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect((int)rect.getX()-1, (int)rect.getY()-1, (int)rect.getWidth()+1, (int)rect.getHeight()+1);
    }

    public static void drawUnderline(JComponent j, Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(j.getX(), j.getY() + j.getHeight(), j.getX() + j.getWidth(), j.getY() + j.getHeight());
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
