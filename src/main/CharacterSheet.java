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
        
        DBTextAreaComponent constitution_save = new DBTextAreaComponent(getRelativeBounds(constitution_save_num_position));
        allComponents.add(constitution_save);
        
        DBTextAreaComponent intelligence_save = new DBTextAreaComponent(getRelativeBounds(intelligence_save_num_position));
        allComponents.add(intelligence_save);
        
        DBTextAreaComponent arcana = new DBTextAreaComponent(getRelativeBounds(arcana_num_position));
        allComponents.add(arcana);
        
        DBTextAreaComponent history = new DBTextAreaComponent(getRelativeBounds(history_num_position));
        allComponents.add(history);
        
        DBTextAreaComponent investigation = new DBTextAreaComponent(getRelativeBounds(investigation_num_position));
        allComponents.add(investigation);
        
        DBTextAreaComponent nature = new DBTextAreaComponent(getRelativeBounds(nature_num_position));
        allComponents.add(nature);
        
        DBTextAreaComponent religion = new DBTextAreaComponent(getRelativeBounds(religion_num_position));
        allComponents.add(religion);
          
        DBTextAreaComponent wisdom_save = new DBTextAreaComponent(getRelativeBounds(wisdom_save_num_position));
        allComponents.add(wisdom_save);
        
        DBTextAreaComponent animalhandling = new DBTextAreaComponent(getRelativeBounds(animalhandling_num));
        allComponents.add(animalhandling);
        
        DBTextAreaComponent insight = new DBTextAreaComponent(getRelativeBounds(insight_num_position));
        allComponents.add(insight);
        
        DBTextAreaComponent medicine = new DBTextAreaComponent(getRelativeBounds(medicine_num_position));
        allComponents.add(medicine);
        
        DBTextAreaComponent perception = new DBTextAreaComponent(getRelativeBounds(perception_num_position));
        allComponents.add(perception);
        
        DBTextAreaComponent survival = new DBTextAreaComponent(getRelativeBounds(survival_num_position));
        allComponents.add(survival);
        
        DBTextAreaComponent charisma_save = new DBTextAreaComponent(getRelativeBounds(charisma_save_num_position));
        allComponents.add(charisma_save);
        
        DBTextAreaComponent deception = new DBTextAreaComponent(getRelativeBounds(deception_num_position));
        allComponents.add(deception);
        
        DBTextAreaComponent intimidation = new DBTextAreaComponent(getRelativeBounds(intimidation_num_position));
        allComponents.add(intimidation);
        
        DBTextAreaComponent performance = new DBTextAreaComponent(getRelativeBounds(performance_num_position));
        allComponents.add(performance);
        
        DBTextAreaComponent persuasion = new DBTextAreaComponent(getRelativeBounds(persuasion_num_position));
        allComponents.add(persuasion);
         
        DBTextAreaComponent other_proficiencies = new DBTextAreaComponent(getRelativeBounds(other_proficiencies_languages_position));
        allComponents.add(other_proficiencies);
        
        DBTextAreaComponent attacks = new DBTextAreaComponent(getRelativeBounds(attacks_spellcasting_position));
        allComponents.add(attacks);
        
        DBTextAreaComponent features = new DBTextAreaComponent(getRelativeBounds(features_traits_position));
        allComponents.add(features);
        
        DBTextAreaComponent features = new DBTextAreaComponent(getRelativeBounds(features_traits_position));
        allComponents.add(features);
        
        DBTextAreaComponent equipment = new DBTextAreaComponent(getRelativeBounds(equipment_position));
        allComponents.add(equipment);
        
        DBTextAreaComponent armor = new DBTextAreaComponent(getRelativeBounds(armor_class_position));
        allComponents.add(armor);
        
        DBTextAreaComponent initiative = new DBTextAreaComponent(getRelativeBounds(initiative_position));
        allComponents.add(initiative);
        
        DBTextAreaComponent speed = new DBTextAreaComponent(getRelativeBounds(speed_num_position));
        allComponents.add(speed);
        
        DBTextAreaComponent current_hit = new DBTextAreaComponent(getRelativeBounds(current_hit_point_position));
        allComponents.add(current_hit);
        
        DBTextAreaComponent temp_hit = new DBTextAreaComponent(getRelativeBounds(temp_hit_point_position));
        allComponents.add(temp_hit);
        
        DBTextAreaComponent current_hit_max = new DBTextAreaComponent(getRelativeBounds(current_hit_point_max_position));
        allComponents.add(current_hit_max);
        
        DBTextAreaComponent total_hit = new DBTextAreaComponent(getRelativeBounds(total_hit_dice_position));
        allComponents.add(total_hit);
        
        DBTextAreaComponent hit_dice = new DBTextAreaComponent(getRelativeBounds(hit_dice_position));
        allComponents.add(hit_dice);
        
        DBTextAreaComponent death = new DBTextAreaComponent(getRelativeBounds(death_saves_position));
        allComponents.add(death);
        
        

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
