package main;

import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.ArrayList;

import static utilities.Utilities.RACE_OPTIONS;
import static utilities.Utilities.CLASS_OPTIONS;
import static utilities.PreloadedImages.*;

public class CharacterCreator extends JPanel implements MouseListener, ActionListener {

    private static final String[] ABILITY_SCORE_METHOD_OPTIONS = {"Roll Ability Scores for me", "Manually Input Ability Scores"};

    public static final String DELIMITER = "`";

    private static final Font TITLE_FONT = new Font("Verdana", Font.PLAIN, 30);
    private static final Font TEXT_FONT = new Font("Verdana", Font.PLAIN, 20);

    JTextArea player_name_tf, character_name_tf;
    JComboBox race_selection, class_selection, ability_score_method_selection;
    JButton done;

    private boolean running;
    private String player_name, character_name, race, cclass, ability_score_method;
    private boolean ready;

    public CharacterCreator(){
        running = false;
        ready = false;

        player_name = "";
        character_name = "";
        race = "";
        cclass = "";
        ability_score_method = "";



        addMouseListener(this);

        setSize(270, 520);
        setLocation((int)((windowSize.getWidth() + sheetSize.getHeight() - sheetSize.getWidth() - getWidth())/2), (int)((windowSize.getHeight() - getHeight())/2));

        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents(){
        int len = 180;

        player_name_tf = new JTextArea();
        player_name_tf.setBounds((int)((getWidth()-len)/2), 90, len, 30);
        player_name_tf.setFont(new Font("Verdana", Font.PLAIN, 20));

        character_name_tf = new JTextArea();
        character_name_tf.setBounds((int)((getWidth()-len)/2), 160, len, 30);
        character_name_tf.setFont(new Font("Verdana", Font.PLAIN, 20));

        race_selection = new JComboBox(RACE_OPTIONS);
        race_selection.setSelectedIndex(0);
        race_selection.setBounds((int)((getWidth()-len)/2), 230, len, 30);
        race_selection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox tmp = (JComboBox)actionEvent.getSource();
                race = "" + tmp.getSelectedIndex();
            }
        });

        class_selection = new JComboBox(CLASS_OPTIONS);
        class_selection.setSelectedIndex(0);
        class_selection.setBounds((int)((getWidth()-len)/2), 300, len, 30);
        class_selection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox tmp = (JComboBox)actionEvent.getSource();
                cclass = "" + tmp.getSelectedIndex();
            }
        });

        ability_score_method_selection = new JComboBox(ABILITY_SCORE_METHOD_OPTIONS);
        ability_score_method_selection.setSelectedIndex(0);
        ability_score_method_selection.setBounds((int)((getWidth()-len)/2), 370, len, 30);
        ability_score_method_selection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox tmp = (JComboBox)actionEvent.getSource();
                ability_score_method = "" + tmp.getSelectedIndex();
            }
        });

        done = new JButton("Create");
        done.setBounds((int)((getWidth()-100)/2), 430, 100, 30);
        done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                pullInfo();
                ready = true;
            }
        });

        add(done);
        add(player_name_tf);
        add(character_name_tf);
        add(race_selection);
        add(class_selection);
        add(ability_score_method_selection);
    }

    public void start(){
        setVisible(true);
        running = false;
        ready = false;
    }

    public void finish(){
        setVisible(false);
        running = false;
        ready = false;
    }

    public void pullInfo(){
        player_name = player_name_tf.getText();
        character_name = character_name_tf.getText();
        race = "" + race_selection.getSelectedIndex();
        cclass = "" + class_selection.getSelectedIndex();
        ability_score_method = "" + ability_score_method_selection.getSelectedIndex();
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isReady(){
        return ready;
    }

    public String getInformation(){
        return player_name + DELIMITER + character_name + DELIMITER + race + DELIMITER + cclass + DELIMITER + ability_score_method;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawRect(0,0,getWidth()-1, getHeight()-1);

        DungeonsBeyond.drawBox(player_name_tf, g);
        DungeonsBeyond.drawBox(character_name_tf, g);

        g.setFont(new Font("Verdana", Font.PLAIN, 20));
        g.drawString("Player Name", 70, 85);
        g.drawString("Character Name", 52, 155);
        g.drawString("Race", 110, 225);
        g.drawString("Class", 105, 295);
    }

    //ActionListener function
    public void actionPerformed(ActionEvent evt){

    }

    //MouseListener functions

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

}
