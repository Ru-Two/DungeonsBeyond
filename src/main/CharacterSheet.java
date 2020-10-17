package main;

import character.*;
import utilities.*;
import javax.swing.*;
import java.awt.*;

public class CharacterSheet {
    private CharacterInfo character;
    private Dimension screenSize;
    private Dimension sheetSize;
    private Dimension sheetSizeRatio = new Dimension(17, 22);

    private JPanel headerPanel;
    private JPanel abilityScorePanel;
    private JPanel inspProfPanel;
    private JPanel savingThrowPanel;
    private JPanel skillPanel;
    private JPanel healthPanel;
    private JPanel combatPanel;
    private JPanel personalInfoPanel;
    private JPanel languagePanel;
    private JPanel featureAndTraitPanel;
    private JPanel attackAndSpellcastingPanel;
    private JPanel equipmentPanel;

    // TODO: set base graphics things here
    public CharacterSheet(){
        character = new CharacterInfo();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        sheetSize = new Dimension((int)((screenSize.getHeight()-50)*(sheetSizeRatio.getWidth()/sheetSizeRatio.getHeight())), (int)screenSize.getHeight()-50);
    }

    public CharacterSheet(String characterName){
        this();
        character.setCharacterName(characterName);
    }
}
