package main;

import org.w3c.dom.css.Rect;

import java.awt.*;
import java.awt.image.ImageObserver;
import static utilities.PreloadedImages.*;

public class DBButton {

    private Rectangle bounds;

    private Image img;
    private Color selectColor;
    private Color col;
    private Font font;
    private String txt;

    private boolean selected;

    public DBButton(){
        bounds = new Rectangle(0,0,100,100);
        img = null;
        selectColor = new Color(255,255,255, 20);
        col = Color.WHITE;
        selected = false;
        txt = "";
        font = larger_sized_font;
    }

    public DBButton(int x, int y, int wid, int hei){
        this();
        bounds = new Rectangle(x, y, wid, hei);
    }

    public DBButton(Rectangle r){
        this();
        bounds = new Rectangle(r);
    }

    public DBButton(DBButton b){
        this();
        bounds = b.getBounds();
        img = b.getImage();
        selectColor = b.getSelectColor();
        col = b.getColor();
        selected = b.isSelected();
    }

    public boolean contains(int x, int y){
        return bounds.contains(x, y);
    }

    public boolean contains(Point p){
        return bounds.contains(p);
    }

    public void select(){
        selected = true;
    }

    public void unSelect(){
        selected = false;
    }

    public void drawButton(Graphics g, ImageObserver imgObs){
        if (img != null) {
            g.drawImage(img, getX(), getY(), imgObs);
        }
        else {
            g.setColor(col);
            g.fillRect(getX(), getY(), getWidth(), getHeight());
            g.setColor(Color.BLACK);
            g.setFont(font);
            int w = g.getFontMetrics().stringWidth(txt);
            //int h = g.getFontMetrics().stringHeight(txt);
            g.drawString(txt, getX() + getWidth()/2 - w/2,getY()+getHeight()/2 + 10);
        }
        if (selected){
            g.setColor(selectColor);
            g.fillRect(getX(), getY(), getWidth(), getHeight());
        }
        if (img == null) {
            g.setColor(Color.BLACK);
            g.drawRect(getX(), getY(), getWidth(), getHeight());
        }
    }

    public void setFont(Font f){
        font = f;
    }

    public void setText(String s){
        txt = s;
    }

    /*
    public void drawButtonSelected(Graphics g, ImageObserver imgObs){
        g.setColor(Color.WHITE);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(selectColor);
        g.fillRect(getX(), getY(), getWidth(), getHeight());

        if (img != null) g.drawImage(img, getX(), getY(), imgObs);

        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }
    */

    public void setBounds(int x, int y, int wid, int hei){
        bounds.setRect(x, y, wid, hei);
    }

    public void setBounds(Rectangle b){
        bounds.setRect(b);
    }

    public void setImage(Image img){
        this.img = img;
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

    public boolean isSelected() {
        return selected;
    }

    public Color getColor(){
        return col;
    }

    public Color getSelectColor() {
        return selectColor;
    }
}
