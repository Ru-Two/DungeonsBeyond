package main;

import character.*;
import utilities.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class OptionPanel extends JPanel implements MouseListener {

    //ArrayList<JButton> buttons;

    public OptionPanel(){
        setLocation(0,0);
        setSize(100,100);
        //buttons = new ArrayList<JButton>();
        addMouseListener(this);
    }

    public OptionPanel(int x, int y, int wid, int hei){
        this();
        setLocation(x, y);
        setSize(wid, hei);
    }

    public void addButton(int x, int y, int wid, int hei){
        JButton newButton = new JButton();
        newButton.setBounds(x, y, wid, hei);
        add(newButton);
    }

    public void addButton(int x, int y, int wid, int hei, String name){
        JButton newButton = new JButton(name);
        newButton.setBounds(x, y, wid, hei);
        add(newButton);
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
