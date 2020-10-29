package main;

import character.*;
import utilities.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.ArrayList;

public class SheetListPanel extends JPanel {

    private static final int BUTTON_SPACE = 20;
    private static final Color SELECT_COLOR = new Color(0,100,255, 50);

    private Dimension BUTTON_SIZE;

    private ArrayList<DBButton> sheetButtons;
    private DBButton newSheetButton;
    private int selectedSheet;


    public SheetListPanel(){
        sheetButtons = new ArrayList<DBButton>();
        selectedSheet = 0;
        setLocation(0,0);
        setSize(100,100);
        BUTTON_SIZE = new Dimension(50,50);
        newSheetButton = new DBButton(getNextButtonBounds());
        //newSheetButton.setImage(DungeonsBeyond.getImage("src/graphics/add_sheet.png"));
        newSheetButton.setColor(new Color(5,250,20,60));
    }

    public SheetListPanel(int x, int y, int wid, int hei){
        this();
        setLocation(x, y);
        setSize(wid, hei);
        BUTTON_SIZE.setSize((int)getWidth()-(BUTTON_SPACE*2), ((int)getWidth()-(BUTTON_SPACE*2))/2);
    }

    public void addSheet(){
        DBButton newBtn = new DBButton();
        newBtn.setSelectColor(SELECT_COLOR);
        newBtn.setBounds(getNextButtonBounds());
        sheetButtons.add(newBtn);
        newSheetButton.setBounds(getNextButtonBounds());
    }

    public int selectSheet(int index){
        selectedSheet = index;
        return index;
    }

    public int selectSheet(int x, int y){
        for (int i = 0; i < sheetButtons.size(); i++){
            if (sheetButtons.get(i).contains(x, y)){
                selectedSheet = i;
                return selectedSheet;
            }
        }
        return -1;
    }

    public int selectSheet(Point p){
        return selectSheet((int)p.getX(), (int)p.getY());
    }

    public boolean newSheetButtonIsClicked(int x, int y){
        return newSheetButton.contains(x, y);
    }

    public boolean newSheetButtonIsClicked(Point p){
        return newSheetButton.contains(p);
    }

    public Rectangle getNextButtonBounds(){
        if (sheetButtons.isEmpty()){
            return new Rectangle(BUTTON_SPACE, BUTTON_SPACE, (int)BUTTON_SIZE.getWidth(), (int)BUTTON_SIZE.getHeight());
        }
        Rectangle rect = new Rectangle();
        rect.setSize(BUTTON_SIZE);
        int tmpy = (BUTTON_SPACE*(sheetButtons.size()+1)) + (int)(BUTTON_SIZE.getHeight() * sheetButtons.size());
        rect.setLocation(BUTTON_SPACE, tmpy);
        return rect;
    }

    @Override
    public void paintComponent(Graphics g){
        //allSheets.get(selectedSheet).paintComponent(g);
        for (int i = 0; i < sheetButtons.size(); i++){
            sheetButtons.get(i).drawButton(g, this);
            if (i == selectedSheet){
                sheetButtons.get(i).drawButtonSelected(g, this);
            }
        }
        newSheetButton.drawButton(g, this);
    }

}
