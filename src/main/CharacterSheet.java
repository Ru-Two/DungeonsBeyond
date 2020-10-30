package main;

import character.*;
import utilities.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class CharacterSheet extends JPanel implements MouseListener {

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
        headerPanel = new SheetComponentPanel(30,30, 730,100);

        abilityScorePanel = new SheetComponentPanel();

        inspProfPanel = new SheetComponentPanel();

        savingThrowPanel = new SheetComponentPanel();

        skillPanel = new SheetComponentPanel();

        healthPanel = new SheetComponentPanel();

        combatPanel = new SheetComponentPanel();

        personalInfoPanel = new SheetComponentPanel();

        languagePanel = new SheetComponentPanel();

        featureAndTraitPanel = new SheetComponentPanel();

        attackAndSpellcastingPanel = new SheetComponentPanel();

        equipmentPanel = new SheetComponentPanel();

        addMouseListener(this);
        tmpSheet = DungeonsBeyond.getImage("src/graphics/basic_sheet.png");
    }

    public CharacterSheet(String characterName){
        this();
        character.setCharacterName(characterName);
    }

    public CharacterSheet(int x, int y){
        this();
        setLocation(x, y);
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {
    }

    public void drawBox(JComponent j, Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(j.getX(), j.getY(), j.getWidth(), j.getHeight());
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(0,0, 0, getHeight());

        g.setFont(new Font("Courier Regular", Font.PLAIN, FONT_SIZE));

        //g.drawImage(tmpSheet, 0, 0, this);

        headerPanel.paintComponent(g);
        drawBox(headerPanel, g);

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
