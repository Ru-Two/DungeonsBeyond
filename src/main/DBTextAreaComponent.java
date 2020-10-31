package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DBTextAreaComponent extends JTextArea implements MouseListener, FocusListener {

    public DBTextAreaComponent(){
        super();

        setBounds(0,0,50,50);

        addMouseListener(this);
        addFocusListener(this);
    }

    public DBTextAreaComponent(int x, int y, int width, int height){
        this();
        setBounds(x, y, width, height);
        setRows((int)(getHeight()/getFont().getSize()));
        setColumns((int)(getWidth()/getFont().getSize()));
    }

    public DBTextAreaComponent(Rectangle bounds){
        this();
        setBounds(bounds);
        setRows((int)(getHeight()/getFont().getSize()));
        setColumns((int)(getWidth()/getFont().getSize()));
    }

    /*
    public void actionPerformed(ActionEvent e){

    }
    */
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {
        //requestFocusInWindow();
    }

    public void focusGained(FocusEvent f) {

    }

    public void focusLost(FocusEvent f) {

    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
