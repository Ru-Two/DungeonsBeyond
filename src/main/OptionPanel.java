package main;

import character.*;
import utilities.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.ArrayList;

public class OptionPanel extends JPanel implements MouseListener {

    //ArrayList<JButton> buttons;

    public OptionPanel(){
        setLocation(0,0);
        setSize(100,100);
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        addMouseListener(this);
        buttons.add(addButton(10,10,80,10, "Save as PNG"));
        /*---
        buttons.add(addButton(10,10,80,10, "Save as PNG"));
        
        
        */
        buttons.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* Have to use ImageIOWrite
                
               Need to find filename  
               BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB); 
               Graphics2D graphics2D = image.createGraphics(); 
               frame.paint(graphics2D); 
               ImageIO.write(image,"png", new File("image.png"));
               
               write(RenderedImage im, String formatName, File output)
               
               
               
               
               */
            }
        });
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

    public JButton addButton(int x, int y, int wid, int hei, String name){
        JButton newButton = new JButton(name);
        newButton.setBounds(x, y, wid, hei);
        add(newButton);
        return newButton;
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
