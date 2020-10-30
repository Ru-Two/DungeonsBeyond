package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class DBImageComponent extends JComponent{
    private Image img;

    public DBImageComponent(){
        img = null;
        setLocation(0,0);
        setSize(100,100);
    }

    public DBImageComponent(BufferedImage img){
        this();
        this.img = img;
        setSize(img.getWidth(), img.getHeight());
    }

    public DBImageComponent(BufferedImage img, int x, int y, int width, int height){
        this();
        setSize(width, height);
        setLocation(x, y);
        this.img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public DBImageComponent(String path){
        this();
        img = DungeonsBeyond.getImage(path);
        setSize(img.getWidth(this), img.getHeight(this));
    }

    public DBImageComponent(String path, int x, int y, int width, int height){
        this();
        setSize(width, height);
        setLocation(x, y);
        img = DungeonsBeyond.getImage(path).getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public int getImageWidth(){
        return (int)getWidth();
    }

    public int getImageHeight(){
        return (int)getHeight();
    }

    public void setImageSize(int width, int height){
        setSize(width, height);
        img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    @Override
    public void paintComponent(Graphics g){
        if (img != null){
            g.drawImage(img, getX(), getY(), this);
        }
    }

}
