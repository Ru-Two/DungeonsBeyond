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
        need to correct dimensions for buttons
        
        buttons.add(addButton(10,10,80,10, "Save as file"));
        buttons.add(addButton((10,10,80,10, "Load file into new sheet"));
        
        
        */
        //save as PNG
        buttons.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* Have to use ImageIOWrite
                what we need
                - index of sheet to be made png
                - panel of that sheet
                - name generator method for file name of saved sheet maybe ex. output string "charactersheet1" 2, 3 and soforth.
                 or input file name
                
                 do we have to make a getter method for current sheet index in dungeonsBeyond class?
                
                DungeonsBeyond.allSheets.get(DungeonsBeyond.get(currentSheetIndex))
                
               Need to find filename  
               BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB); 
               Graphics2D graphics2D = image.createGraphics(); 
               frame.paint(graphics2D); 
               ImageIO.write(image,"png", new File("image.png"));
               
               write(RenderedImage im, String formatName, File output)
               
               
               
               
               */
            }
        });
        
        // save as text file 
        buttons.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* Have to use ImageIOWrite
                what we need
               - saving characterinfo to txt file
               
               */
            }
        });
        
        // load a text file
        buttons.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* 
                what we need
               -loading characterinfo into a new sheet
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
