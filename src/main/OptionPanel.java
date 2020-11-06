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

public class OptionPanel extends JPanel implements MouseListener {

    //ArrayList<JButton> buttons;

    public OptionPanel(){
        setLocation(0,0);
        setSize(100,100);
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        addMouseListener(this);

        buttons.add(addButton(10,10,80,10, "Save as PNG"));
        buttons.add(addButton(10,10,80,10, "Save as file"));
        buttons.add(addButton(10,10,80,10, "Load file into new sheet"));

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

                //Takes screen shot of sheet window
                //TODO fix cropping to only display the character sheet
                Container pic = getRootPane().getContentPane();
                BufferedImage image = new BufferedImage((pic.getWidth()), pic.getHeight(), BufferedImage.TYPE_INT_RGB);
                BufferedImage crop = image.getSubimage(0, 0 ,image.getWidth(),image.getHeight());
                Graphics2D g = crop.createGraphics();
                pic.paint(g);


                JFrame parentFrame = new JFrame();
                JFileChooser fileChooser = new JFileChooser();

                //information for the save directory window
                fileChooser.setDialogTitle("Specify a file to save");
                int userSelection = fileChooser.showSaveDialog(parentFrame);

                //If the user hits save
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    System.out.println("Save as file: " + fileToSave.getAbsolutePath());

                }

                //Saves to this director
                //fileChooser.getSelectedFile() = selected director and file name
                try {
                    ImageIO.write(crop,"png", fileChooser.getSelectedFile());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

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
                */

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
