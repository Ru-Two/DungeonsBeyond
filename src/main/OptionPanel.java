package main;

import character.*;
import utilities.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static utilities.PreloadedImages.*;

public class OptionPanel extends JPanel implements MouseListener {

    ArrayList<JButton> buttons;
    boolean saveFlag;

    public OptionPanel(){
        setLocation(0,0);
        setSize(100,100);
        buttons = new ArrayList<JButton>();
        addMouseListener(this);
        saveFlag = false;

        buttons.add(addButton(getX() + 30,getY() + 30,getWidth() - 60,getWidth() - 60, "Save as PNG"));
        //buttons.add(addButton(10,10,80,10, "Save as file"));
        //buttons.add(addButton(10,10,80,10, "Load file into new sheet"));

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
                - have a choice to what location to save the sheet.

               do we have to make a getter method for current sheet index in dungeonsBeyond class?

                DungeonsBeyond.allSheets.get(DungeonsBeyond.get(currentSheetIndex))
               */
                saveFlag = true;

            }
        });

        /*
        // save as text file
        buttons.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* Have to use ImageIOWrite
                what we need
               - saving characterinfo to txt file


                JFrame frame = new JFrame();
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Specify a file to load");
                int userSelection = fileChooser.showSaveDialog(frame);

                if (userSelection == JFileChooser.APPROVE_OPTION){
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Your Selected File: " + selectedFile.getAbsoluteFile());
                }

            }
        });

        // load a text file
        buttons.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*
                what we need
               -loading characterinfo into a new sheet


                JFrame frame = new JFrame();
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Specify a file to load");
                int userSelection = fileChooser.showOpenDialog(frame);

                try{
                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = fileChooser.getSelectedFile();
                        System.out.println("Your Selected File: " + selectedFile.getAbsoluteFile());

                        Scanner s = new Scanner(selectedFile);

                    }
                }catch (IOException ioException) {
                    ioException.printStackTrace();
                }



            }
        });
    */
        setLayout(null);
    }

    public OptionPanel(int x, int y, int wid, int hei){
        this();
        setLocation(x, y);
        setSize(wid, hei);
        buttons.get(0).setBounds(getX() + 30,getY() + 30,getWidth() - 60,getHeight() - 60);
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

    public boolean checkSaveFlag(){
        if (saveFlag){
            saveFlag = false;
            return true;
        }
        return false;
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
