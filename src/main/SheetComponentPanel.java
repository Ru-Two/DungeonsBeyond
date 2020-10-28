package main;

import javax.swing.*;
import javax.swing.text.JTextComponent;
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
        DBImageComponent newImg = new DBImageComponent(img, width, height);
        newImg.setLocation(x, y);
        images.add(newImg);
    }

    public void addText(String text){
        addText(text, 0, 0);
    }

    public void addText(String text, int x, int y){
        DBTextComponent newTxt = new DBTextComponent(text);
        newTxt.setLocation(x, y);
        texts.add(newTxt);
    }

    public void addTextField(int x, int y){
        DBTextAreaComponent newTextArea = new DBTextAreaComponent();
        newTextArea.setLocation(x, y);
        textAreas.add(newTextArea);
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
