package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;

public class SheetComponentPanel extends JPanel {

    private ArrayList<DBImageComponent> images;
    private ArrayList<DBTextComponent> texts;
    private ArrayList<DBTextAreaComponent> textAreas;

    public SheetComponentPanel(){
        setLocation(0,0);
        setSize(100,100);

        images = new ArrayList<DBImageComponent>();
        texts = new ArrayList<DBTextComponent>();
        textAreas = new ArrayList<DBTextAreaComponent>();
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
        DBImageComponent newImg = new DBImageComponent(img, x, y, width, height);
        images.add(newImg);
    }

    public void addText(String text){
        addText(text, 0, 0);
    }

    public void addText(String text, int x, int y){
        DBTextComponent newTxt = new DBTextComponent(text, x, y);
        texts.add(newTxt);
    }

    public void addTextField(int x, int y, int wid, int hei){
        DBTextAreaComponent newTextArea = new DBTextAreaComponent(x, y, wid, hei);
        textAreas.add(newTextArea);
    }

    @Override
    public void paintComponent(Graphics g){
        //super.paintComponent(g);

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
