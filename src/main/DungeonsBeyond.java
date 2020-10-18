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
import utilities.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static utilities.Utilities.*;

public class DungeonsBeyond extends JFrame implements ActionListener, KeyListener, MouseListener{
    //JFrame mainWindow;
    Dimension screenSize;
    Dimension windowSize;
    Dimension sheetSize;
    Dimension sheetSizeRatio = new Dimension(17, 22);

    CharacterSheet tmpCharacter = null;

    Timer ticks;

    public DungeonsBeyond(){
        super("Dungeons Beyond");

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        sheetSize = new Dimension((int)((screenSize.getHeight()-50)*(sheetSizeRatio.getWidth()/sheetSizeRatio.getHeight())), (int)screenSize.getHeight()-50);

        ticks = new Timer(10, this);
        ticks.start();

        tmpCharacter = new CharacterSheet();
        add(tmpCharacter);

        addKeyListener(this);
        addMouseListener(this);

        setIconImage(getImage("src/graphics/db_logo.png"));
        setSize(sheetSize);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        tmpCharacter.paintComponent(g);
    }

    public static void main(String[] args){
        DungeonsBeyond sheetManager = new DungeonsBeyond();

    }

    //ActionListener function
    public void actionPerformed(ActionEvent evt){
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

    public void mouseClicked(MouseEvent e) {}

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
