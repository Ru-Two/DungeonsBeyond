package main;

import character.*;
import characterclass.CharacterClass;
import characterrace.CharacterRace;
import items.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.awt.event.KeyEvent.*;
import static utilities.PreloadedImages.*;
import static utilities.Utilities.*;

public class CharacterSheet extends JPanel implements MouseListener, KeyListener, MouseMotionListener{

    private CharacterInfo character;
    private CharacterClass characterClass;

    private boolean mainSheetDisplay;

    private ArrayList<JCheckBox> checkboxes = new ArrayList<>();
    private ArrayList<DBTextAreaComponent> savesAndSkills = new ArrayList<>();

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
        character.setProfSavingThrows(c);
    }

    public CharacterSheet(CharacterRace race, CharacterClass cclass){
        this();
        character.setRaceAndClass(race, cclass);
    }

    private void loadAllComponents(){

        character_name = buildTextArea(getRelativeBounds(character_name_position), player_name_font);
        class_level = buildTextArea(getRelativeBounds(class_level_position), header_font);
        background = buildTextArea(getRelativeBounds(background_position), header_font);
        player_name = buildTextArea(getRelativeBounds(player_name_position), header_font);
        race_name = buildTextArea(getRelativeBounds(race_position), header_font);
        alignment = buildTextArea(getRelativeBounds(alignment_position), header_font);
        exp_points = buildTextArea(getRelativeBounds(exp_points_position), header_font);
        proficiency_bonus = buildTextArea(getRelativeBounds(proficiency_bonus_position), null);

        add(character_name);
        add(class_level);
        add(background);
        add(player_name);
        add(race_name);
        add(alignment);
        add(exp_points);
        add(proficiency_bonus);

        proficiency_bonus.setEditable(false);

        //Ability Scores
        strength_as = buildTextArea(getRelativeBounds(strength_as_position), null);
        dexterity_as = buildTextArea(getRelativeBounds(dexterity_as_position), null);
        constitution_as = buildTextArea(getRelativeBounds(constitution_as_position), null);
        intelligence_as = buildTextArea(getRelativeBounds(intelligence_as_position), null);
        wisdom_as = buildTextArea(getRelativeBounds(wisdom_as_position), null);
        charisma_as = buildTextArea(getRelativeBounds(charisma_as_position), null);

        add(strength_as);
        add(dexterity_as);
        add(constitution_as);
        add(intelligence_as);
        add(wisdom_as);
        add(charisma_as);

        //Ability Score Bonuses

        strength_as_bonus = buildTextArea(getRelativeBounds(strength_as_bonus_position), null);
        dexterity_as_bonus = buildTextArea(getRelativeBounds(dexterity_as_bonus_position), null);
        constitution_as_bonus = buildTextArea(getRelativeBounds(constitution_as_bonus_position), null);
        intelligence_as_bonus = buildTextArea(getRelativeBounds(intelligence_as_bonus_position), null);
        wisdom_as_bonus = buildTextArea(getRelativeBounds(wisdom_as_bonus_position), null);
        charisma_as_bonus = buildTextArea(getRelativeBounds(charisma_as_bonus_position), null);

        strength_as_bonus.setEditable(false);
        dexterity_as_bonus.setEditable(false);
        constitution_as_bonus.setEditable(false);
        intelligence_as_bonus.setEditable(false);
        wisdom_as_bonus.setEditable(false);
        charisma_as_bonus.setEditable(false);

        add(strength_as_bonus);
        add(dexterity_as_bonus);
        add(constitution_as_bonus);
        add(intelligence_as_bonus);
        add(wisdom_as_bonus);
        add(charisma_as_bonus);

        //SAVES
        //Saves numbers
        strength_save_num = buildTextArea(getRelativeBounds(strength_save_num_position), saves_and_skills_font);
        dexterity_save_num = buildTextArea(getRelativeBounds(dexterity_save_num_position), saves_and_skills_font);
        constitution_save_num = buildTextArea(getRelativeBounds(constitution_save_num_position), saves_and_skills_font);
        intelligence_save_num = buildTextArea(getRelativeBounds(intelligence_save_num_position), saves_and_skills_font);
        wisdom_save_num = buildTextArea(getRelativeBounds(wisdom_save_num_position), saves_and_skills_font);
        charisma_save_num = buildTextArea(getRelativeBounds(charisma_save_num_position), saves_and_skills_font);

        strength_save_num.setEditable(false);
        dexterity_save_num.setEditable(false);
        constitution_save_num.setEditable(false);
        intelligence_save_num.setEditable(false);
        wisdom_save_num.setEditable(false);
        charisma_save_num.setEditable(false);

        add(strength_save_num);
        add(dexterity_save_num);
        add(constitution_save_num);
        add(intelligence_save_num);
        add(wisdom_save_num);
        add(charisma_save_num);

        savesAndSkills.add(strength_save_num);
        savesAndSkills.add(dexterity_save_num);
        savesAndSkills.add(constitution_save_num);
        savesAndSkills.add(intelligence_save_num);
        savesAndSkills.add(wisdom_save_num);
        savesAndSkills.add(charisma_save_num);


        //Save checkboxes
        strength_save_checkbox = buildCheckBox(getRelativePos(strength_save_checkbox_position));
        dexterity_save_checkbox = buildCheckBox(getRelativePos(dexterity_save_checkbox_position));
        constitution_save_checkbox = buildCheckBox(getRelativePos(constitution_save_checkbox_position));
        intelligence_save_checkbox = buildCheckBox(getRelativePos(intelligence_save_checkbox_position));
        wisdom_save_checkbox = buildCheckBox(getRelativePos(wisdom_save_checkbox_position));
        charisma_save_checkbox = buildCheckBox(getRelativePos(charisma_save_checkbox_position));

        add(strength_save_checkbox);
        add(dexterity_save_checkbox);
        add(constitution_save_checkbox);
        add(intelligence_save_checkbox);
        add(wisdom_save_checkbox);
        add(charisma_save_checkbox);

        checkboxes.add(strength_save_checkbox);
        checkboxes.add(dexterity_save_checkbox);
        checkboxes.add(constitution_save_checkbox);
        checkboxes.add(intelligence_save_checkbox);
        checkboxes.add(wisdom_save_checkbox);
        checkboxes.add(charisma_save_checkbox);

        //Skills
        //Skills numbers
        athletics_num = buildTextArea(getRelativeBounds(athletics_num_position), saves_and_skills_font);
        acrobatics_num = buildTextArea(getRelativeBounds(acrobatics_num_position), saves_and_skills_font);
        sleightofhand_num = buildTextArea(getRelativeBounds(sleightofhand_num_position), saves_and_skills_font);
        stealth_num = buildTextArea(getRelativeBounds(stealth_num_position), saves_and_skills_font);
        arcana_num = buildTextArea(getRelativeBounds(arcana_num_position), saves_and_skills_font);
        history_num = buildTextArea(getRelativeBounds(history_num_position), saves_and_skills_font);
        investigation_num = buildTextArea(getRelativeBounds(investigation_num_position), saves_and_skills_font);
        nature_num = buildTextArea(getRelativeBounds(nature_num_position), saves_and_skills_font);
        religion_num = buildTextArea(getRelativeBounds(religion_num_position), saves_and_skills_font);
        animalhandling_num = buildTextArea(getRelativeBounds(animalhandling_num_position), saves_and_skills_font);
        insight_num = buildTextArea(getRelativeBounds(insight_num_position), saves_and_skills_font);
        medicine_num = buildTextArea(getRelativeBounds(medicine_num_position), saves_and_skills_font);
        perception_num = buildTextArea(getRelativeBounds(perception_num_position), saves_and_skills_font);
        survival_num = buildTextArea(getRelativeBounds(survival_num_position), saves_and_skills_font);
        deception_num = buildTextArea(getRelativeBounds(deception_num_position), saves_and_skills_font);
        intimidation_num = buildTextArea(getRelativeBounds(intimidation_num_position), saves_and_skills_font);
        performance_num = buildTextArea(getRelativeBounds(performance_num_position), saves_and_skills_font);
        persuasion_num = buildTextArea(getRelativeBounds(persuasion_num_position), saves_and_skills_font);

        athletics_num.setEditable(false);
        acrobatics_num.setEditable(false);
        sleightofhand_num.setEditable(false);
        stealth_num.setEditable(false);
        arcana_num.setEditable(false);
        history_num.setEditable(false);
        investigation_num.setEditable(false);
        nature_num.setEditable(false);
        religion_num.setEditable(false);
        animalhandling_num.setEditable(false);
        insight_num.setEditable(false);
        medicine_num.setEditable(false);
        perception_num.setEditable(false);
        survival_num.setEditable(false);
        deception_num.setEditable(false);
        intimidation_num.setEditable(false);
        performance_num.setEditable(false);
        persuasion_num.setEditable(false);

        add(athletics_num);
        add(acrobatics_num);
        add(sleightofhand_num);
        add(stealth_num);
        add(arcana_num);
        add(history_num);
        add(investigation_num);
        add(nature_num);
        add(religion_num);
        add(animalhandling_num);
        add(insight_num);
        add(medicine_num);
        add(perception_num);
        add(survival_num);
        add(deception_num);
        add(intimidation_num);
        add(performance_num);
        add(persuasion_num);

        savesAndSkills.add(athletics_num);
        savesAndSkills.add(acrobatics_num);
        savesAndSkills.add(sleightofhand_num);
        savesAndSkills.add(stealth_num);
        savesAndSkills.add(arcana_num);
        savesAndSkills.add(history_num);
        savesAndSkills.add(investigation_num);
        savesAndSkills.add(nature_num);
        savesAndSkills.add(religion_num);
        savesAndSkills.add(animalhandling_num);
        savesAndSkills.add(insight_num);
        savesAndSkills.add(medicine_num);
        savesAndSkills.add(perception_num);
        savesAndSkills.add(survival_num);
        savesAndSkills.add(deception_num);
        savesAndSkills.add(intimidation_num);
        savesAndSkills.add(performance_num);
        savesAndSkills.add(persuasion_num);

        //Skill checkboxes
        athletics_checkbox = buildCheckBox(getRelativePos(athletics_checkbox_position));
        acrobatics_checkbox = buildCheckBox(getRelativePos(acrobatics_checkbox_position));
        sleightofhand_checkbox = buildCheckBox(getRelativePos(sleightofhands_checkbox_position));
        stealth_checkbox = buildCheckBox(getRelativePos(stealth_checkbox_position));
        arcana_checkbox = buildCheckBox(getRelativePos(arcana_checkbox_position));
        history_checkbox = buildCheckBox(getRelativePos(history_checkbox_position));
        investigation_checkbox = buildCheckBox(getRelativePos(investigation_checkbox_position));
        nature_checkbox = buildCheckBox(getRelativePos(nature_checkbox_position));
        religion_checkbox = buildCheckBox(getRelativePos(religion_checkbox_position));
        animalhandling_checkbox = buildCheckBox(getRelativePos(animalhandling_checkbox_position));
        insight_checkbox = buildCheckBox(getRelativePos(insight_checkbox_position));
        medicine_checkbox= buildCheckBox(getRelativePos(medicine_checkbox_position));
        perception_checkbox = buildCheckBox(getRelativePos(perception_checkbox_position));
        survival_checkbox = buildCheckBox(getRelativePos(survival_checkbox_position));
        deception_checkbox = buildCheckBox(getRelativePos(deception_checkbox_position));
        intimidation_checkbox = buildCheckBox(getRelativePos(intimidation_checkbox_position));
        performance_checkbox = buildCheckBox(getRelativePos(performance_checkbox_position));
        persuasion_checkbox = buildCheckBox(getRelativePos(persuasion_checkbox_position));

        add(athletics_checkbox);
        add(acrobatics_checkbox);
        add(sleightofhand_checkbox);
        add(stealth_checkbox);
        add(arcana_checkbox);
        add(history_checkbox);
        add(investigation_checkbox);
        add(nature_checkbox);
        add(religion_checkbox);
        add(animalhandling_checkbox);
        add(insight_checkbox);
        add(medicine_checkbox);
        add(perception_checkbox);
        add(survival_checkbox);
        add(deception_checkbox);
        add(intimidation_checkbox);
        add(performance_checkbox);
        add(persuasion_checkbox);

        checkboxes.add(athletics_checkbox);
        checkboxes.add(acrobatics_checkbox);
        checkboxes.add(sleightofhand_checkbox);
        checkboxes.add(stealth_checkbox);
        checkboxes.add(arcana_checkbox);
        checkboxes.add(history_checkbox);
        checkboxes.add(investigation_checkbox);
        checkboxes.add(nature_checkbox);
        checkboxes.add(religion_checkbox);
        checkboxes.add(animalhandling_checkbox);
        checkboxes.add(insight_checkbox);
        checkboxes.add(medicine_checkbox);
        checkboxes.add(perception_checkbox);
        checkboxes.add(survival_checkbox);
        checkboxes.add(deception_checkbox);
        checkboxes.add(intimidation_checkbox);
        checkboxes.add(performance_checkbox);
        checkboxes.add(persuasion_checkbox);


        //Text Boxes

        other_proficiencies_languages = buildTextArea(getRelativeBounds(other_proficiencies_languages_position), null);
        attacks_spellcasting = buildTextArea(getRelativeBounds(attacks_spellcasting_position), null);
        features_traits = buildTextArea(getRelativeBounds(features_traits_position), null);
        equipment = buildTextArea(getRelativeBounds(equipment_position), null);

        add(other_proficiencies_languages);
        add(attacks_spellcasting);
        add(features_traits);
        add(equipment);

        features_traits.setEditable(false);

        //Character Information
        armor_class = buildTextArea(getRelativeBounds(armor_class_position), null);
        initiative = buildTextArea(getRelativeBounds(initiative_position), null);
        speed = buildTextArea(getRelativeBounds(speed_position), null);
        current_hit_points = buildTextArea(getRelativeBounds(current_hit_points_position), null);
        temp_hit_points = buildTextArea(getRelativeBounds(temp_hit_points_position), null);
        current_hit_point_max = buildTextArea(getRelativeBounds(current_hit_point_max_position), saves_and_skills_font);
        total_hit_dice = buildTextArea(getRelativeBounds(total_hit_dice_position), saves_and_skills_font);
        hit_dice = buildTextArea(getRelativeBounds(hit_dice_position), null);
        hit_dice.setEditable(false);
        death_saves = buildTextArea(getRelativeBounds(death_saves_position), null);

        add(armor_class);
        add(initiative);
        add(speed);
        add(current_hit_points);
        add(temp_hit_points);
        add(current_hit_point_max);
        add(total_hit_dice);
        add(hit_dice);
        add(death_saves);

        current_hit_point_max.setEditable(false);

        //ADD INSPIRATION POINT AND OTHER POINTS

    }

    public void switchScreens(){
        mainSheetDisplay = !mainSheetDisplay;
    }


    public void pullFromCharacter(){
        player_name.setText(character.getPlayerName());
        character_name.setText(character.getCharacterName());
        class_level.setText(character.getClassName() + " " + character.getLevel());
        race_name.setText(character.getRaceName());
        proficiency_bonus.setText("" + character.getProficiencyBonus());
        armor_class.setText("" + character.getArmourClass());
        speed.setText("" + character.getSpeed());
        current_hit_point_max.setText("" + character.getMaxHp());
        current_hit_points.setText("" + character.getCurrHp());
        temp_hit_points.setText("" + character.getTmpMaxHp());
        total_hit_dice.setText("" + character.getLevel());
        hit_dice.setText("" + character.getHitDice());

        strength_as.setText("" + character.getAbilityScores()[STR].getScore());
        dexterity_as.setText("" + character.getAbilityScores()[DEX].getScore());
        constitution_as.setText("" + character.getAbilityScores()[CON].getScore());
        intelligence_as.setText("" + character.getAbilityScores()[INT].getScore());
        wisdom_as.setText("" + character.getAbilityScores()[WIS].getScore());
        charisma_as.setText("" + character.getAbilityScores()[CHA].getScore());

        adjustModifiers();
        adjustSavesandSkills();
        adjustFeatsandTraits();

        initiative.setText("" + character.getMod(DEX));


        //proficiencies

        for(int i = 0; i < checkboxes.size(); i++){
            JCheckBox tempCheckbox = checkboxes.get(i);
            DBTextAreaComponent tempTextarea = savesAndSkills.get(i);

            tempCheckbox.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent e){
                    if(e.getStateChange() == ItemEvent.SELECTED){

                        int tempNum = Integer.parseInt(tempTextarea.getText()) + Integer.parseInt(proficiency_bonus.getText());
                        tempTextarea.setText("" + tempNum);
                    }
                    else{
                        int tempNum = Integer.parseInt(tempTextarea.getText()) - Integer.parseInt(proficiency_bonus.getText());
                        tempTextarea.setText("" + tempNum);
                    }
                }
            });
        }
        boolean[] temp = character.getProfSavingThrows();
        for(int i = 0; i < temp.length; i++){
            if(temp[i])
                checkboxes.get(i).setSelected(true);
        }


    }

    public void pushToCharacter(){
        updateAbilityScores();
        adjustModifiers();
        adjustSavesandSkills();
        levelUp();
        adjustFeatsandTraits();

        character.setInitiative(Integer.parseInt(initiative.getText()));
        total_hit_dice.setText("" + character.getLevel());

    }

    private void updateAbilityScores(){
        character.getAbilityScores()[STR].setScore(Integer.parseInt(strength_as.getText()));
        character.getAbilityScores()[DEX].setScore(Integer.parseInt(dexterity_as.getText()));
        character.getAbilityScores()[CON].setScore(Integer.parseInt(constitution_as.getText()));
        character.getAbilityScores()[INT].setScore(Integer.parseInt(intelligence_as.getText()));
        character.getAbilityScores()[WIS].setScore(Integer.parseInt(wisdom_as.getText()));
        character.getAbilityScores()[CHA].setScore(Integer.parseInt(charisma_as.getText()));
    }
    private void adjustModifiers(){
        strength_as_bonus.setText("" + character.getAbilityScores()[STR].getModifier());
        dexterity_as_bonus.setText("" + character.getAbilityScores()[DEX].getModifier());
        constitution_as_bonus.setText("" + character.getAbilityScores()[CON].getModifier());
        intelligence_as_bonus.setText("" + character.getAbilityScores()[INT].getModifier());
        wisdom_as_bonus.setText("" + character.getAbilityScores()[WIS].getModifier());
        charisma_as_bonus.setText("" + character.getAbilityScores()[CHA].getModifier());
    }
    private void adjustSavesandSkills(){
        strength_save_num.setText("" + character.getMod(STR));
        dexterity_save_num.setText("" + character.getMod(DEX));
        constitution_save_num.setText("" + character.getMod(CON));
        intelligence_save_num.setText("" + character.getMod(INT));
        wisdom_save_num.setText("" + character.getMod(WIS));
        charisma_save_num.setText("" + character.getMod(CHA));

        acrobatics_num.setText("" + character.getAbilityScores()[character.getSkills()[ACROBATICS].getModifier()].getModifier());
        animalhandling_num.setText("" + character.getAbilityScores()[character.getSkills()[ANIMAL_HANDLING].getModifier()].getModifier());
        arcana_num.setText("" + character.getAbilityScores()[character.getSkills()[ARCANA].getModifier()].getModifier());
        athletics_num.setText("" + character.getAbilityScores()[character.getSkills()[ATHLETICS].getModifier()].getModifier());
        deception_num.setText("" + character.getAbilityScores()[character.getSkills()[DECEPTION].getModifier()].getModifier());
        history_num.setText("" + character.getAbilityScores()[character.getSkills()[HISTORY].getModifier()].getModifier());
        insight_num.setText("" + character.getAbilityScores()[character.getSkills()[INSIGHT].getModifier()].getModifier());
        intimidation_num.setText("" + character.getAbilityScores()[character.getSkills()[INTIMIDATION].getModifier()].getModifier());
        investigation_num.setText("" + character.getAbilityScores()[character.getSkills()[INVESTIGATION].getModifier()].getModifier());
        medicine_num.setText("" + character.getAbilityScores()[character.getSkills()[MEDICINE].getModifier()].getModifier());
        nature_num.setText("" + character.getAbilityScores()[character.getSkills()[NATURE].getModifier()].getModifier());
        perception_num.setText("" + character.getAbilityScores()[character.getSkills()[PERCEPTION].getModifier()].getModifier());
        performance_num.setText("" + character.getAbilityScores()[character.getSkills()[PERFORMANCE].getModifier()].getModifier());
        persuasion_num.setText("" + character.getAbilityScores()[character.getSkills()[PERSUASION].getModifier()].getModifier());
        religion_num.setText("" + character.getAbilityScores()[character.getSkills()[RELIGION].getModifier()].getModifier());
        sleightofhand_num.setText("" + character.getAbilityScores()[character.getSkills()[SLEIGHT_OF_HAND].getModifier()].getModifier());
        stealth_num.setText("" + character.getAbilityScores()[character.getSkills()[STEALTH].getModifier()].getModifier());
        survival_num.setText("" + character.getAbilityScores()[character.getSkills()[SURVIVAL].getModifier()].getModifier());
    }
    private void levelUp(){
        String string = class_level.getText();
        character.levelUpTo(Integer.parseInt(string.substring(string.indexOf(" ") + 1)));
    }
    private void adjustFeatsandTraits(){
        StringBuilder tempFeatTrait = new StringBuilder();
        tempFeatTrait.append("TRAITS: \n");
        for(int i = 0; i < character.getTraits().size(); i++){
            tempFeatTrait.append(character.getTraits().get(i).getName());
            tempFeatTrait.append("\n");
        }

        tempFeatTrait.append("\nFEATURES: \n");
        for(int i = 0; i < character.getCurrentFeatures().size(); i++){
            tempFeatTrait.append(character.getCurrentFeatures().get(i).getName());
            tempFeatTrait.append("\n");
        }
        features_traits.setText(tempFeatTrait.toString());
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

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    //MouseListener

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {
        pushToCharacter();
    }

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
