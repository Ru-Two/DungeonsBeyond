package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class DBImageComponent extends JComponent{
    Image img;
    Dimension imgDimension;

    public DBImageComponent(){
        img = null;
        setLocation(0,0);
        imgDimension = new Dimension(100,100);
    }

    public DBImageComponent(BufferedImage img){
        this();
        this.img = img;
        imgDimension.setSize(img.getWidth(), img.getHeight());
    }

    public DBImageComponent(BufferedImage img, int width, int height){
        this();
        imgDimension.setSize(width, height);
        this.img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public DBImageComponent(String path){
        this();
        img = DungeonsBeyond.getImage(path);
        imgDimension.setSize(img.getWidth(this), img.getHeight(this));
    }

    public DBImageComponent(String path, int width, int height){
        this();
        imgDimension.setSize(width, height);
        img = DungeonsBeyond.getImage(path).getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public int getImageWidth(){
        return (int)imgDimension.getWidth();
    }

    public int getImageHeight(){
        return (int)imgDimension.getWidth();
    }

    public void setImageSize(int width, int height){
        imgDimension.setSize(width, height);
        img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    @Override
    public void paintComponent(Graphics g){
        if (img != null){
            g.drawImage(img, getX(), getY(), this);
        }
    }

}
