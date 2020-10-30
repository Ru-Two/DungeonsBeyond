package main;

import javax.swing.*;
import java.awt.*;


public class DBTextAreaComponent extends JTextArea {

    private Font font;

    public DBTextAreaComponent(){
        super("",4,30);
        setLocation(0,0);
        setSize(100,50);
        font = new Font("Courier Regular", Font.PLAIN, 20);
    }

    public DBTextAreaComponent(int x, int y, int width, int height){
        this();
        setSize(width, height);
        setLocation(x, y);
    }

    public void setFont(Font f){
        font = f;
        super.setFont(font);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(font);
    }
}
