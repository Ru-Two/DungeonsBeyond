package main;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.image.*;
import java.util.*;

public class SheetComponentPanel extends JPanel {

    ArrayList<DBImageComponent> images;
    ArrayList<DBTextComponent> texts;
    ArrayList<DBTextAreaComponent> textAreas;

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
        DBImageComponent newImg = new DBImageComponent(img, width, height);
        newImg.setLocation(x, y);
        images.add(newImg);
    }

    public void addText(String text, int x, int y){
        DBTextComponent newTxt = new DBTextComponent(text);
        newTxt.setLocation(x,y);
        texts.add(newTxt);
    }

    public void addTextField(){

    }

    @Override
    public void paintComponent(Graphics g){
        for (DBImageComponent img:images){
            img.paintComponent(g);
        }
        for(DBTextComponent txt:texts){
            txt.paintComponent(g);
        }
        for (DBTextAreaComponent txtArea:textAreas){
            txtArea.paintComponents(g);
        }
    }

}
