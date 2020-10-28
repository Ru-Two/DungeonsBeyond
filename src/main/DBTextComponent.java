package main;

import javax.swing.text.JTextComponent;
import javax.swing.*;
import java.awt.*;

public class DBTextComponent extends JComponent {

    private String text;
    public DBTextComponent(){
        super();
        setLocation(0,0);
        text = " ";
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

    @Override
    public void paintComponent(Graphics g){
        g.drawString(text, getX(), getY());
    }
}
