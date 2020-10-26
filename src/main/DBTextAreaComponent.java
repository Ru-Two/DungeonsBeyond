package main;

import javax.swing.*;


public class DBTextAreaComponent extends JTextArea {

    public DBTextAreaComponent(){
        super("",   1, 30);
        setLocation(0,0);
        setSize(100,50);
    }

    public DBTextAreaComponent(int width, int height){
        this();
        
    }
}
