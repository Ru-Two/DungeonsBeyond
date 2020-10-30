package main;

import javax.swing.text.JTextComponent;
import javax.swing.*;
import java.awt.*;

public class DBTextComponent extends JComponent {

    private String text;
    private Color col;
    private Font font;
    private int fontSize;

    public DBTextComponent(){
        super();
        setLocation(0,0);
        text = " ";
        col = Color.BLACK;
        fontSize = 20;
        font = new Font("Verdana", Font.PLAIN, fontSize);
    }

    public DBTextComponent(String text){
        this();
        this.text = text;
    }

    public DBTextComponent(String text, int x, int y){
        this();
        this.text = text;
        setLocation(x,y);
    }

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFont(Font f){
        font = f;
    }

    public void setColor(Color col) {
        this.col = col;
    }

    @Override
    public void paintComponent(Graphics g){
        g.setFont(font);
        g.setColor(col);
        g.drawString(text, getX(), getY());
    }
}
