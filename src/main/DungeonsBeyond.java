package main;

import characterclass.*;
import characterrace.*;

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
import static utilities.Utilities.*;

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
        String[] splitInfo = info.split(CharacterCreator.DELIMITER);
        int race_const = Integer.parseInt(splitInfo[2]);
        int class_const = Integer.parseInt(splitInfo[3]);
        int as_choice_const = Integer.parseInt(splitInfo[4]);

        CharacterRace r = null;
        CharacterClass c = null;

        switch (race_const){
            case HILL_DWARF:
                r = new DwarfHill();
                break;
            case MOUNTAIN_DWARF:
                r = new DwarfMountain();
                break;
            case HIGH_ELF:
                r = new ElfHigh();
                break;
            case WOOD_ELF:
                r = new ElfWood();
                break;
            case DARK_ELF:
                r = new ElfDark();
                break;
            case LIGHTFOOT_HALFING:
                r = new HalflingLightfoot();
                break;
            case STOUT_HALFLING:
                r = new HalflingStout();
                break;
            case HUMAN:
                r = new Human();
                break;
            case DRAGONBORN:
                r = new Dragonborn();
                break;
            case FOREST_GNOME:
                r = new GnomeForest();
                break;
            case ROCK_GNOME:
                r = new GnomeRock();
                break;
            case HALF_ELF:
                r = new HalfElf();
                break;
            case HALF_ORC:
                r = new HalfOrc();
                break;
            case TIEFLING:
                r = new Tiefling();
                break;
        }

        switch(class_const){
            case BARBARIAN:
                c = new Barbarian();
                break;
            case BARD:
                c = new Bard();
                break;
            case CLERIC:
                c = new Cleric();
                break;
            case DRUID:
                c = new Druid();
                break;
            case FIGHTER:
                c = new Fighter();
                break;
            case MONK:
                c = new Monk();
                break;
            case PALADIN:
                c = new Paladin();
                break;
            case RANGER:
                c = new Ranger();
                break;
            case ROGUE:
                c = new Rogue();
                break;
            case SORCERER:
                c = new Sorcerer();
                break;
            case WARLOCK:
                c = new Warlock();
                break;
            case WIZARD:
                c = new Wizard();
                break;
        }

        CharacterSheet newCharacter = new CharacterSheet(splitInfo[0], splitInfo[1], r, c, as_choice_const, options.getWidth(), 0);
        newCharacter.setBorder(BorderFactory. createLineBorder(Color.BLACK));
        addSheet(newCharacter);
    }

    public void addSheet(CharacterSheet cs){
        allSheets.add(cs);
        sheetListPanel.addSheet(cs.getCharactername());
        add(allSheets.get(allSheets.size()-1));
        allSheets.get(allSheets.size()-1).pullFromCharacter();
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

    //Takes the contents of the sheet and saves as png
    public void saveSheet(){
        Container pic;
        if(currentSheetIndex >= 0 && !allSheets.isEmpty()){
            pic = allSheets.get(currentSheetIndex);
        }

        else
            {
            pic = this;
        }

        BufferedImage image = new BufferedImage((pic.getWidth()), pic.getHeight(), BufferedImage.TYPE_INT_RGB);
        BufferedImage crop = image.getSubimage(0, 0 , image.getWidth(), image.getHeight());
        Graphics2D g = crop.createGraphics();
        pic.paint(g);

        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();

        //information for the save directory window
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);


        //If the user hits save
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());

        }

        //Saves to this director
        //fileChooser.getSelectedFile() = selected director and file name
        try {
            ImageIO.write(crop,"png", fileChooser.getSelectedFile());
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
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
            if(options.checkSaveFlag()){
                saveSheet();
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
