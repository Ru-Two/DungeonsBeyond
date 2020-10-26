package main;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.image.*;
import java.util.*;

public class SheetComponentPanel extends JPanel {

    ArrayList<DBImageComponent> images;
    ArrayList<JTextComponent> texts;
    ArrayList<JTextField> textFields;

    public SheetComponentPanel(){
        setLocation(0,0);
        setSize(100,100);
    }

    public SheetComponentPanel(int x, int y){
        this();
        setLocation(x,y);
    }

    public SheetComponentPanel(int x, int y, int width, int height){
        this();
        setLocation(x,y);
        setSize(width, height);
    }

    public void addImage(BufferedImage img){
        addImage(img, 0, 0, getWidth(), getHeight());
    }

    public void addImage(BufferedImage img, int x, int y, int width, int height){
        images.add(new DBImageComponent());
    }



}
