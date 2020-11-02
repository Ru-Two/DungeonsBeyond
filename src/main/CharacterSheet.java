package main;

import character.*;
import characterclass.CharacterClass;
import characterrace.CharacterRace;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.*;
import static utilities.PreloadedImages.*;

public class CharacterSheet extends JPanel implements MouseListener, KeyListener, MouseMotionListener{

    private CharacterInfo character;

    private boolean mainSheetDisplay;

    private ArrayList<JComponent> allComponents;

    public CharacterSheet(){
        character = new CharacterInfo();
        allComponents = new ArrayList<JComponent>();

        mainSheetDisplay = true;

        loadAllComponents();
        validate();

        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);

        setSize(sheetSize);
        setLocation((int)(sheetSize.getHeight() - sheetSize.getWidth()), 0);
        setLayout(null);
    }

    public CharacterSheet(String playerName, String characterName, CharacterRace r, CharacterClass c, int as_choice, int x, int y){
        this();
        setLocation(x, y);

        character.setPlayerName(playerName);
        character.setCharacterName(characterName);

        if (as_choice == 0){
            int[] scores = CharacterInfo.rollAbilityScores();
            character.setBaseAbilityScores(scores);
        }

        character.setRaceAndClass(r, c);
    }

    public CharacterSheet(CharacterRace race, CharacterClass cclass){
        this();
        character.setRaceAndClass(race, cclass);
    }

    private void loadAllComponents(){
        DBTextAreaComponent character_name = new DBTextAreaComponent(getRelativeBounds(character_name_position));
        character_name.setFont(player_name_font);
        allComponents.add(character_name);

        DBTextAreaComponent class_level = new DBTextAreaComponent(getRelativeBounds(class_level_position));
        allComponents.add(class_level);

        DBTextAreaComponent background = new DBTextAreaComponent(getRelativeBounds(background_position));
        allComponents.add(background);

        DBTextAreaComponent player_name = new DBTextAreaComponent(getRelativeBounds(player_name_position));
        allComponents.add(player_name);

        DBTextAreaComponent race_name = new DBTextAreaComponent(getRelativeBounds(race_position));
        allComponents.add(race_name);

        DBTextAreaComponent alignment = new DBTextAreaComponent(getRelativeBounds(alignment_position));
        allComponents.add(alignment);

        DBTextAreaComponent exp_point = new DBTextAreaComponent(getRelativeBounds(exp_points_position));
        allComponents.add(exp_point);

        DBTextAreaComponent proficiency_bonus = new DBTextAreaComponent(getRelativeBounds(proficiency_bonus_position));
        allComponents.add(proficiency_bonus);

        DBTextAreaComponent strength = new DBTextAreaComponent(getRelativeBounds(strength_as_position));
        allComponents.add(strength);
        
        // ------------------------------------
        DBTextAreaComponent dexterity = new DBTextAreaComponent(getRelativeBounds(dexterity_as_position));
        allComponents.add(dexterity);
        
         DBTextAreaComponent constitution = new DBTextAreaComponent(getRelativeBounds(constitution_as_position));
        allComponents.add(constitution);
        
         DBTextAreaComponent intelligence = new DBTextAreaComponent(getRelativeBounds(intelligence_as_position));
        allComponents.add(intelligence);
        
         DBTextAreaComponent wisdom = new DBTextAreaComponent(getRelativeBounds(wisdom_as_position));
        allComponents.add(wisdom);
        
        DBTextAreaComponent charisma = new DBTextAreaComponent(getRelativeBounds(charisma_as_position));
        allComponents.add(charisma);
        
        DBTextAreaComponent strength_bonus = new DBTextAreaComponent(getRelativeBounds(strength_as_position_bonus_position));
        allComponents.add(strength_bonus);
        
        DBTextAreaComponent dexterity_bonus = new DBTextAreaComponent(getRelativeBounds(dexterity_as_position_bonus_position));
        allComponents.add(dexterity_bonus);
        
        DBTextAreaComponent constitution_bonus = new DBTextAreaComponent(getRelativeBounds(constitution_as_position_bonus_position));
        allComponents.add(constitution_bonus);
        
        DBTextAreaComponent intelligence_bonus = new DBTextAreaComponent(getRelativeBounds(intelligence_as_position_bonus_position));
        allComponents.add(intelligence_bonus);
        
        DBTextAreaComponent wisdom_bonus = new DBTextAreaComponent(getRelativeBounds(wisdom_as_position_bonus_position));
        allComponents.add(wisdom_bonus);
        
        DBTextAreaComponent charisma_bonus = new DBTextAreaComponent(getRelativeBounds(charisma_as_position_bonus_position));
        allComponents.add(charisma_bonus);
        
        DBTextAreaComponent strength_save = new DBTextAreaComponent(getRelativeBounds(strength_save_num_position));
        allComponents.add(strength_save);
        
        DBTextAreaComponent strength_athletics = new DBTextAreaComponent(getRelativeBounds(strength_athletics_position));
        allComponents.add(strength_athletics);
        
        DBTextAreaComponent dexterity_save = new DBTextAreaComponent(getRelativeBounds(dexterity_save_num_position));
        allComponents.add(dexterity_save);
        
        DBTextAreaComponent acrobatics = new DBTextAreaComponent(getRelativeBounds(acrobatics_num_position));
        allComponents.add(acrobatics);
        
        DBTextAreaComponent sleightofhand = new DBTextAreaComponent(getRelativeBounds(sleightofhand_num_position));
        allComponents.add(sleightofhand);
        
        DBTextAreaComponent stealth = new DBTextAreaComponent(getRelativeBounds(stealth_num_position));
        allComponents.add(stealth);
        
        
        

        //ADD INSPIRATION POINT AND OTHER POINTS



        
        for (int i = 0; i < allComponents.size(); i++) add(allComponents.get(i));
    }

    public void switchScreens(){
        mainSheetDisplay = !mainSheetDisplay;
    }


    public void pullFromSheet(){

    }

    public void pushToSheet(){

    }


    public ArrayList<JComponent> getAllComponents() {
        return allComponents;
    }

    /*
        Takes in an x and y from a sheet image and translates it to
        the point it will be on the window.
     */
    public static Point getRelativePos(int x, int y){
        return new Point(shiftInt(x), shiftInt(y));
    }

    public static Point getRelativePos(Point p){
        return new Point(shiftInt(p.getX()), shiftInt(p.getY()));
    }

    public static Rectangle getRelativeBounds(int x, int y, int wid, int hei){
        return new Rectangle(shiftInt(x), shiftInt(y), shiftInt(wid), shiftInt(hei));
    }

    public static Rectangle getRelativeBounds(Rectangle r){
        return new Rectangle(shiftInt(r.getX()), shiftInt(r.getY()), shiftInt(r.getWidth()), shiftInt(r.getHeight()));
    }

    private static int shiftInt(int s){
        return (int)(((double)s/layoutSheetUnit) * windowUnit);
    }

    private static int shiftInt(double s){
        return (int)((s/layoutSheetUnit) * windowUnit);
    }

    //KeyListener

    public void keyTyped(KeyEvent e) {
        int k = e.getKeyCode();

        switch(k) {
            case VK_ENTER:
                pushToSheet();
                break;
            default:
                break;
        }
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    //MouseListener

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    //MouseMotionListener

    public void mouseDragged(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {}


    public void drawMainSheet(Graphics g){
        g.drawImage(layoutSheet, 0, 0, this);
        for (JComponent j:allComponents){
            DungeonsBeyond.drawUnderline(j, g);
        }
    }

    public void drawInfoSheet(Graphics g){

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(), getHeight());

        //g.setFont(new Font("Verdana", Font.PLAIN, FONT_SIZE));

        if (mainSheetDisplay){
            drawMainSheet(g);
        }
        else{
            drawInfoSheet(g);
        }
    }
}
