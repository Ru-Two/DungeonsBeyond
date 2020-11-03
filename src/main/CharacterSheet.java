package main;

import character.*;
import characterclass.CharacterClass;
import characterrace.CharacterRace;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.*;
import static utilities.PreloadedImages.*;

public class CharacterSheet extends JPanel implements MouseListener, KeyListener, MouseMotionListener{

    private CharacterInfo character;

    private boolean mainSheetDisplay;

    private DBTextAreaComponent character_name;
    private DBTextAreaComponent class_level;
    private DBTextAreaComponent background;
    private DBTextAreaComponent player_name;
    private DBTextAreaComponent race_name;
    private DBTextAreaComponent alignment;
    private DBTextAreaComponent exp_points;
    private DBTextAreaComponent proficiency_bonus;

    private DBTextAreaComponent strength_as;
    private DBTextAreaComponent dexterity_as;
    private DBTextAreaComponent constitution_as;
    private DBTextAreaComponent intelligence_as;
    private DBTextAreaComponent wisdom_as;
    private DBTextAreaComponent charisma_as;

    private DBTextAreaComponent strength_as_bonus;
    private DBTextAreaComponent dexterity_as_bonus;
    private DBTextAreaComponent constitution_as_bonus;
    private DBTextAreaComponent intelligence_as_bonus;
    private DBTextAreaComponent wisdom_as_bonus;
    private DBTextAreaComponent charisma_as_bonus;

    private JCheckBox strength_save_checkbox;
    private JCheckBox dexterity_save_checkbox;
    private JCheckBox constitution_save_checkbox;
    private JCheckBox intelligence_save_checkbox;
    private JCheckBox wisdom_save_checkbox;
    private JCheckBox charisma_save_checkbox;

    private DBTextAreaComponent strength_save_num;
    private DBTextAreaComponent dexterity_save_num;
    private DBTextAreaComponent constitution_save_num;
    private DBTextAreaComponent intelligence_save_num;
    private DBTextAreaComponent wisdom_save_num;
    private DBTextAreaComponent charisma_save_num;

    private JCheckBox athletics_checkbox;
    private JCheckBox acrobatics_checkbox;
    private JCheckBox sleightofhand_checkbox;
    private JCheckBox stealth_checkbox;
    private JCheckBox arcana_checkbox;
    private JCheckBox history_checkbox;
    private JCheckBox investigation_checkbox;
    private JCheckBox nature_checkbox;
    private JCheckBox religion_checkbox;
    private JCheckBox animalhandling_checkbox;
    private JCheckBox insight_checkbox;
    private JCheckBox medicine_checkbox;
    private JCheckBox perception_checkbox;
    private JCheckBox survival_checkbox;
    private JCheckBox deception_checkbox;
    private JCheckBox intimidation_checkbox;
    private JCheckBox performance_checkbox;
    private JCheckBox persuasion_checkbox;

    private DBTextAreaComponent athletics_num;
    private DBTextAreaComponent acrobatics_num;
    private DBTextAreaComponent sleightofhand_num;
    private DBTextAreaComponent stealth_num;
    private DBTextAreaComponent arcana_num;
    private DBTextAreaComponent history_num;
    private DBTextAreaComponent investigation_num;
    private DBTextAreaComponent nature_num;
    private DBTextAreaComponent religion_num;
    private DBTextAreaComponent animalhandling_num;
    private DBTextAreaComponent insight_num;
    private DBTextAreaComponent medicine_num;
    private DBTextAreaComponent perception_num;
    private DBTextAreaComponent survival_num;
    private DBTextAreaComponent deception_num;
    private DBTextAreaComponent intimidation_num;
    private DBTextAreaComponent performance_num;
    private DBTextAreaComponent persuasion_num;

    private DBTextAreaComponent other_proficiencies_languages;
    private DBTextAreaComponent attacks_spellcasting;
    private DBTextAreaComponent features_traits;
    private DBTextAreaComponent equipment;

    private DBTextAreaComponent armor_class;
    private DBTextAreaComponent initiative;
    private DBTextAreaComponent speed;
    private DBTextAreaComponent current_hit_points;
    private DBTextAreaComponent temp_hit_points;
    private DBTextAreaComponent current_hit_point_max;
    private DBTextAreaComponent total_hit_dice;
    private DBTextAreaComponent hit_dice;
    private DBTextAreaComponent death_saves;


    public CharacterSheet(){
        character = new CharacterInfo();

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
        character_name = buildTextArea(getRelativeBounds(character_name_position), player_name_font);
        add(character_name);
        class_level = buildTextArea(getRelativeBounds(class_level_position), header_font);
        add(class_level);
        background = buildTextArea(getRelativeBounds(background_position), header_font);
        add(background);
        player_name = buildTextArea(getRelativeBounds(player_name_position), header_font);
        add(player_name);
        race_name = buildTextArea(getRelativeBounds(race_position), header_font);
        add(race_name);
        alignment = buildTextArea(getRelativeBounds(alignment_position), header_font);
        add(alignment);
        exp_points = buildTextArea(getRelativeBounds(exp_points_position), header_font);
        add(exp_points);
        proficiency_bonus = buildTextArea(getRelativeBounds(proficiency_bonus_position), null);
        proficiency_bonus.setEditable(false);
        add(proficiency_bonus);

        //Ability Scores

        strength_as = buildTextArea(getRelativeBounds(strength_as_position), null);
        add(strength_as);
        dexterity_as = buildTextArea(getRelativeBounds(dexterity_as_position), null);
        add(dexterity_as);
        constitution_as = buildTextArea(getRelativeBounds(constitution_as_position), null);
        add(constitution_as);
        intelligence_as = buildTextArea(getRelativeBounds(intelligence_as_position), null);
        add(intelligence_as);
        wisdom_as = buildTextArea(getRelativeBounds(wisdom_as_position), null);
        add(wisdom_as);
        charisma_as = buildTextArea(getRelativeBounds(charisma_as_position), null);
        add(charisma_as);

        //Ability Score Bonuses

        strength_as_bonus = buildTextArea(getRelativeBounds(strength_as_bonus_position), null);
        add(strength_as_bonus);
        dexterity_as_bonus = buildTextArea(getRelativeBounds(dexterity_as_bonus_position), null);
        add(dexterity_as_bonus);
        constitution_as_bonus = buildTextArea(getRelativeBounds(constitution_as_bonus_position), null);
        add(constitution_as_bonus);
        intelligence_as_bonus = buildTextArea(getRelativeBounds(intelligence_as_bonus_position), null);
        add(intelligence_as_bonus);
        wisdom_as_bonus = buildTextArea(getRelativeBounds(wisdom_as_bonus_position), null);
        add(wisdom_as_bonus);
        charisma_as_bonus = buildTextArea(getRelativeBounds(charisma_as_bonus_position), null);
        add(charisma_as_bonus);

        //Saves

        strength_save_num = buildTextArea(getRelativeBounds(strength_save_num_position), null);
        add(strength_save_num);
        dexterity_save_num = buildTextArea(getRelativeBounds(dexterity_save_num_position), null);
        add(dexterity_save_num);
        constitution_save_num = buildTextArea(getRelativeBounds(constitution_save_num_position), null);
        add(constitution_save_num);
        intelligence_save_num = buildTextArea(getRelativeBounds(intelligence_save_num_position), null);
        add(intelligence_save_num);
        wisdom_save_num = buildTextArea(getRelativeBounds(wisdom_save_num_position), null);
        add(wisdom_save_num);
        charisma_save_num = buildTextArea(getRelativeBounds(charisma_save_num_position), null);
        add(charisma_save_num);

        strength_save_checkbox = buildCheckBox(getRelativePos(strength_save_checkbox_position));
        add(strength_save_checkbox);
        dexterity_save_checkbox = buildCheckBox(getRelativePos(dexterity_save_checkbox_position));
        add(dexterity_save_checkbox);
        constitution_save_checkbox = buildCheckBox(getRelativePos(constitution_save_checkbox_position));
        add(constitution_save_checkbox);
        intelligence_save_checkbox = buildCheckBox(getRelativePos(intelligence_save_checkbox_position));
        add(intelligence_save_checkbox);
        wisdom_save_checkbox = buildCheckBox(getRelativePos(wisdom_save_checkbox_position));
        add(wisdom_save_checkbox);
        charisma_save_checkbox = buildCheckBox(getRelativePos(charisma_save_checkbox_position));
        add(charisma_save_checkbox);

        //Skills

        athletics_num = buildTextArea(getRelativeBounds(athletics_num_position), null);
        add(athletics_num);
        acrobatics_num = buildTextArea(getRelativeBounds(acrobatics_num_position), null);
        add(acrobatics_num);
        sleightofhand_num = buildTextArea(getRelativeBounds(sleightofhand_num_position), null);
        add(sleightofhand_num);
        stealth_num = buildTextArea(getRelativeBounds(stealth_num_position), null);
        add(stealth_num);
        arcana_num = buildTextArea(getRelativeBounds(arcana_num_position), null);
        add(arcana_num);
        history_num = buildTextArea(getRelativeBounds(history_num_position), null);
        add(history_num);
        investigation_num = buildTextArea(getRelativeBounds(investigation_num_position), null);
        add(investigation_num);
        nature_num = buildTextArea(getRelativeBounds(nature_num_position), null);
        add(nature_num);
        religion_num = buildTextArea(getRelativeBounds(religion_num_position), null);
        add(religion_num);
        animalhandling_num = buildTextArea(getRelativeBounds(animalhandling_num_position), null);
        add(animalhandling_num);
        insight_num = buildTextArea(getRelativeBounds(insight_num_position), null);
        add(insight_num);
        medicine_num = buildTextArea(getRelativeBounds(medicine_num_position), null);
        add(medicine_num);
        perception_num = buildTextArea(getRelativeBounds(perception_num_position), null);
        add(perception_num);
        survival_num = buildTextArea(getRelativeBounds(survival_num_position), null);
        add(survival_num);
        deception_num = buildTextArea(getRelativeBounds(deception_num_position), null);
        add(deception_num);
        intimidation_num = buildTextArea(getRelativeBounds(intimidation_num_position), null);
        add(intimidation_num);
        performance_num = buildTextArea(getRelativeBounds(performance_num_position), null);
        add(performance_num);
        persuasion_num = buildTextArea(getRelativeBounds(persuasion_num_position), null);
        add(persuasion_num);

        //Text Boxes

        other_proficiencies_languages = buildTextArea(getRelativeBounds(other_proficiencies_languages_position), null);
        add(other_proficiencies_languages);
        attacks_spellcasting = buildTextArea(getRelativeBounds(attacks_spellcasting_position), null);
        add(attacks_spellcasting);
        features_traits = buildTextArea(getRelativeBounds(features_traits_position), null);
        add(features_traits);
        equipment = buildTextArea(getRelativeBounds(equipment_position), null);
        add(equipment);

        //Character Information

        armor_class = buildTextArea(getRelativeBounds(armor_class_position), null);
        add(armor_class);
        initiative = buildTextArea(getRelativeBounds(initiative_position), null);
        add(initiative);
        speed = buildTextArea(getRelativeBounds(speed_position), null);
        add(speed);
        current_hit_points = buildTextArea(getRelativeBounds(current_hit_points_position), null);
        add(current_hit_points);
        temp_hit_points = buildTextArea(getRelativeBounds(temp_hit_points_position), null);
        add(temp_hit_points);
        current_hit_point_max = buildTextArea(getRelativeBounds(current_hit_point_max_position), null);
        add(current_hit_point_max);
        total_hit_dice = buildTextArea(getRelativeBounds(total_hit_dice_position), null);
        add(total_hit_dice);
        hit_dice = buildTextArea(getRelativeBounds(hit_dice_position), null);
        add(hit_dice);
        death_saves = buildTextArea(getRelativeBounds(death_saves_position), null);
        add(death_saves);

        //ADD INSPIRATION POINT AND OTHER POINTS

    }

    public void switchScreens(){
        mainSheetDisplay = !mainSheetDisplay;
    }


    public void pullFromCharacter(){
        player_name.setText(character.getPlayerName());
        character_name.setText(character.getCharacterName());
    }

    public void pushToCharacter(){

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

    private static DBTextAreaComponent buildTextArea(Rectangle rect, Font font){
        DBTextAreaComponent ret = new DBTextAreaComponent(rect);
        if (font != null) ret.setFont(font);
        ret.setLineWrap(true);
        ret.setWrapStyleWord(true);
        return ret;
    }

    private static JCheckBox buildCheckBox(Point pos){
        JCheckBox ret = new JCheckBox();
        ret.setLocation((int)pos.getX(), (int)pos.getY());
        ret.setSize(17,13);

        return ret;
    }

    //KeyListener

    public void keyTyped(KeyEvent e) {
        int k = e.getKeyCode();

        switch(k) {
            case VK_ENTER:
                pushToCharacter();
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
