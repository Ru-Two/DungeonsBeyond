package main;

import org.w3c.dom.css.Rect;

import java.awt.*;
import java.awt.image.ImageObserver;

public class DBButton {

    private Rectangle bounds;

    private Image img;
    private Color selectColor;
    private Color col;

    public DBButton(){
        bounds = new Rectangle(0,0,100,100);
        img = null;
        selectColor = new Color(255,255,255, 20);
        col = Color.WHITE;
    }

    public DBButton(int x, int y, int wid, int hei){
        this();
        bounds = new Rectangle(x, y, wid, hei);
    }

    public DBButton(Rectangle r){
        this();
        bounds = new Rectangle(r);
    }

    public boolean contains(int x, int y){
        return bounds.contains(x, y);
    }

    public boolean contains(Point p){
        return bounds.contains(p);
    }

    public void drawButton(Graphics g, ImageObserver imgObs){
        g.setColor(col);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());

        if (img != null) g.drawImage(img, getX(), getY(), imgObs);
    }

    public void drawButtonSelected(Graphics g, ImageObserver imgObs){
        g.setColor(Color.WHITE);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(selectColor);
        g.fillRect(getX(), getY(), getWidth(), getHeight());

        if (img != null) g.drawImage(img, getX(), getY(), imgObs);

        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }

    public void setBounds(int x, int y, int wid, int hei){
        bounds.setRect(x, y, wid, hei);
    }

    public void setBounds(Rectangle b){
        bounds.setRect(b);
    }

    public void setImage(Image img){
        this.img = img.getScaledInstance((int)bounds.getWidth(), (int)bounds.getHeight(), Image.SCALE_SMOOTH);
    }

    public void setSelectColor(Color col){
        selectColor = col;
    }

    public void setColor(Color col){
        this.col = col;
    }

    public int getX(){
        return (int)bounds.getX();
    }

    public int getY(){
        return (int)bounds.getY();
    }

    public int getWidth(){
        return (int)bounds.getWidth();
    }

    public int getHeight(){
        return (int)bounds.getHeight();
    }

    public Rectangle getBounds(){
        return bounds;
    }

    public Image getImage() {
        return img;
    }

    public Color getColor(){
        return selectColor;
    }

}
