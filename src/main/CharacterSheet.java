package main;

import character.*;
import utilities.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class CharacterSheet extends JPanel{

    private static final int FONT_SIZE = 20;

    private CharacterInfo character;
    private Dimension screenSize;
    private Dimension sheetSize;
    private Dimension sheetSizeRatio = new Dimension(17, 22);

    private SheetComponentPanel headerPanel;
    private SheetComponentPanel abilityScorePanel;
    private SheetComponentPanel inspProfPanel;
    private SheetComponentPanel savingThrowPanel;
    private SheetComponentPanel skillPanel;
    private SheetComponentPanel healthPanel;
    private SheetComponentPanel combatPanel;
    private SheetComponentPanel personalInfoPanel;
    private SheetComponentPanel languagePanel;
    private SheetComponentPanel featureAndTraitPanel;
    private SheetComponentPanel attackAndSpellcastingPanel;
    private SheetComponentPanel equipmentPanel;

    private BufferedImage tmpSheet;

    // TODO: set base graphics things here
    public CharacterSheet(){
        character = new CharacterInfo();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        sheetSize = new Dimension((int)((screenSize.getHeight()-50)*(sheetSizeRatio.getWidth()/sheetSizeRatio.getHeight())), (int)screenSize.getHeight()-50);
        setSize(sheetSize);
        setLocation((int)(sheetSize.getHeight() - sheetSize.getWidth()), 0);

        //initialize all panels
        headerPanel = new SheetComponentPanel(0,0, (int)sheetSize.getWidth()-60, 200);
        add(headerPanel);

        abilityScorePanel = new SheetComponentPanel();
        add(abilityScorePanel);

        inspProfPanel = new SheetComponentPanel();
        add(inspProfPanel);

        savingThrowPanel = new SheetComponentPanel();
        add(savingThrowPanel);

        skillPanel = new SheetComponentPanel();
        add(skillPanel);

        healthPanel = new SheetComponentPanel();
        add(healthPanel);

        combatPanel = new SheetComponentPanel();
        add(combatPanel);

        personalInfoPanel = new SheetComponentPanel();
        add(personalInfoPanel);

        languagePanel = new SheetComponentPanel();
        add(languagePanel);

        featureAndTraitPanel = new SheetComponentPanel();
        add(featureAndTraitPanel);

        attackAndSpellcastingPanel = new SheetComponentPanel();
        add(attackAndSpellcastingPanel);

        equipmentPanel = new SheetComponentPanel();
        add(equipmentPanel);

        tmpSheet = DungeonsBeyond.getImage("src/graphics/basic_sheet.png");
    }

    public CharacterSheet(String characterName){
        this();
        character.setCharacterName(characterName);
    }

    @Override
    public void paintComponent(Graphics g){
        g.setFont(new Font("Courier Regular", Font.PLAIN, FONT_SIZE));
        g.drawImage(tmpSheet, 0, 0, this);

        headerPanel.paintComponent(g);
        abilityScorePanel.paintComponent(g);
        inspProfPanel.paintComponent(g);
        savingThrowPanel.paintComponent(g);
        skillPanel.paintComponent(g);
        healthPanel.paintComponent(g);
        combatPanel.paintComponent(g);
        personalInfoPanel.paintComponent(g);
        languagePanel.paintComponent(g);
        featureAndTraitPanel.paintComponent(g);
        attackAndSpellcastingPanel.paintComponent(g);
        equipmentPanel.paintComponent(g);
    }
}
