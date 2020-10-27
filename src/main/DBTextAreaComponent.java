package main;

import javax.swing.*;
import java.awt.*;


public class DBTextAreaComponent extends JTextArea {

    public DBTextAreaComponent(){
        super("",4,30);
        setLocation(0,0);
        setSize(100,50);
    }

    public DBTextAreaComponent(int width, int height){
        this();
        setSize(width, height);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
