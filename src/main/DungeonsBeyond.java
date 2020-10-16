package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import utilities.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static utilities.Utilities.*;

public class DungeonsBeyond {
    JFrame mainWindow;
    Dimension screenSize;
    Dimension windowSize;
    Dimension sheetSize;
    Dimension sheetSizeRatio = new Dimension(17, 22);

    public DungeonsBeyond(){
        mainWindow = new JFrame("Dungeons Beyond");

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        sheetSize = new Dimension((int)((screenSize.getHeight()-50)*(sheetSizeRatio.getWidth()/sheetSizeRatio.getHeight())), (int)screenSize.getHeight()-50);

        mainWindow.setIconImage(getImage("src/graphics/db_logo.png"));
        mainWindow.setSize(sheetSize);
        mainWindow.setLayout(null);
        mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }

    public static void main(String[] args){
        new DungeonsBeyond();
    }

    public static BufferedImage getImage(String path){
        BufferedImage newImage = null;
        try {
            newImage = ImageIO.read(new File(path));
        }
        catch(Exception e){
            System.out.println("Could not get image: " + path);
        }
        return newImage;
    }
}
