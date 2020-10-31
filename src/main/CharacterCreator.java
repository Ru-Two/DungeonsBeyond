package main;

import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.ArrayList;


public class CharacterCreator extends JFrame implements MouseListener, ActionListener {

    private static final String[] RACE_OPTIONS = {"Hill Dwarf", "Mountain Dwarf", "High Elf", "Wood Elf", "Dark Elf (Drow)",
                                                  "Lightfoot Halfling", "Stout Halfling", "Human", "Dragonborn",
                                                  "Forest Gnome", "Rock Gnome", "Half-Elf", "Half-Orc", "Tiefling"};

    private static final String[] CLASS_OPTIONS = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
                                                   "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    private static final String[] ABILITY_SCORE_METHOD_OPTIONS = {"Dice Roll", "Manual Input"};

    private static final Font TITLE_FONT = new Font("Verdana", Font.PLAIN, 30);
    private static final Font TEXT_FONT = new Font("Verdana", Font.PLAIN, 20);

    private Timer ticks_cc;

    private boolean running;
    private String player_name, character_name, race, cclass, ability_score_method;

    public CharacterCreator(){
        super("Character Creation");

        ticks_cc = new Timer(30, this);

        running = true;

        player_name = "";
        character_name = "";
        race = "";
        cclass = "";
        ability_score_method = "";

        initComponents();

        addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                finish();
            }
        });

        setSize(500,300);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void initComponents(){
        JTextField player_name_tf = new JTextField();
        player_name_tf.setSize(60, TEXT_FONT.getSize());

        JTextField character_name_tf = new JTextField();
        character_name_tf.setSize(60, TEXT_FONT.getSize());

        JComboBox race_selection = new JComboBox(RACE_OPTIONS);


        JComboBox class_selection = new JComboBox(CLASS_OPTIONS);

        JComboBox ability_score_method_selection = new JComboBox(ABILITY_SCORE_METHOD_OPTIONS);
    }

    private void finish(){

        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public String getInformation(){
        return player_name + "." + character_name + "." + race + "." + cclass + "." + ability_score_method;
    }

    //ActionListener function
    public void actionPerformed(ActionEvent evt){

    }

    //MouseListener functions

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {

    }
}
