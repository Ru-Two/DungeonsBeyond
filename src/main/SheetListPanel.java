package main;

import sun.security.pkcs11.Secmod;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static utilities.PreloadedImages.*;

public class SheetListPanel extends JPanel implements MouseListener {

    private static final int BUTTON_SPACE = 20;
    private static final Color SELECT_COLOR = new Color(0,100,255, 50);

    private Dimension BUTTON_SIZE;

    private ArrayList<DBButton> sheetButtons;
    private ArrayList<DBButton> deleteButtons;
    private DBButton newSheetButton;
    private int selectedSheet;

    private boolean addSheetFlag;
    private boolean sheetDeleteFlag;
    private int deleteBuffer;

    private boolean mPress = false;

    public SheetListPanel(){
        setLocation(0,0);
        setSize(100,100);

        sheetButtons = new ArrayList<DBButton>();
        deleteButtons = new ArrayList<DBButton>();
        selectedSheet = -1;
        BUTTON_SIZE = new Dimension(50,50);

        newSheetButton = new DBButton(getNextButtonBounds());
        newSheetButton.setColor(new Color(5,250,20,60));

        addSheetFlag = false;
        sheetDeleteFlag = false;
        deleteBuffer = -1;

        addMouseListener(this);
    }

    public SheetListPanel(int x, int y, int wid, int hei){
        this();
        setLocation(x, y);
        setSize(wid, hei);
        BUTTON_SIZE.setSize((int)getWidth()-(BUTTON_SPACE*2), ((int)getWidth()-(BUTTON_SPACE*2))/2);
        newSheetButton.setBounds(getNextButtonBounds());
    }

    public void addSheet(){


        DBButton newBtn = new DBButton(getNextButtonBounds());
        newBtn.setSelectColor(SELECT_COLOR);
        sheetButtons.add(newBtn);

        DBButton newDelBtn = new DBButton(getNextDelButtonBounds());
        newDelBtn.setImage(deleteImg);
        deleteButtons.add(newDelBtn);

        newSheetButton.setBounds(getNextButtonBounds());

        if (newSheetButton.getY() + newSheetButton.getHeight() > getHeight()) newSheetButton = null;
    }

    public int selectSheet(int index){
        if (sheetButtons.size() > 0 && index >=0 && index<sheetButtons.size()) {
            if (selectedSheet >= 0 && selectedSheet < sheetButtons.size()) sheetButtons.get(selectedSheet).unSelect();
            selectedSheet = index;
            sheetButtons.get(selectedSheet).select();
            return index;
        }
        return -1;
    }

    public int selectSheet(int x, int y){
        for (int i = 0; i < sheetButtons.size(); i++){
            if (sheetButtons.get(i).contains(x, y)){
                return selectSheet(i);
            }
        }
        return -1;
    }

    public int selectSheet(Point p){
        return selectSheet((int)p.getX(), (int)p.getY());
    }

    public int deleteSheetCheck(Point p){
        for (int i = 0; i < deleteButtons.size(); i++){
            if (deleteButtons.get(i).contains((int)p.getX(), (int)p.getY())){
                deleteBuffer = i;
                sheetDeleteFlag = true;
                return i;
            }
        }
        return -1;
    }

    public void deleteSheet(int index){
        if (selectedSheet == index) selectedSheet = -1;
        selectedSheet--;
        deleteButtons.remove(index);
        sheetButtons.remove(index);
        refresh();
    }

    public void refresh(){
        ArrayList<DBButton> refreshedSheetButtons = new ArrayList<DBButton>();
        refreshedSheetButtons.addAll(sheetButtons);
        ArrayList<DBButton> refreshedDeleteButtons = new ArrayList<DBButton>();
        refreshedDeleteButtons.addAll(deleteButtons);

        deleteButtons.clear();
        sheetButtons.clear();

        DBButton tmpSheetBtn, tmpDelBtn;

        for (int i = 0; i < refreshedSheetButtons.size(); i++){
            tmpDelBtn = new DBButton(refreshedDeleteButtons.get(i));
            tmpDelBtn.setBounds(getNextDelButtonBounds());
            tmpSheetBtn = new DBButton(refreshedSheetButtons.get(i));
            tmpSheetBtn.setBounds(getNextButtonBounds());

            deleteButtons.add(tmpDelBtn);
            sheetButtons.add(tmpSheetBtn);
        }

        if (newSheetButton != null) newSheetButton.setBounds(getNextButtonBounds());
    }

    public boolean newSheetButtonIsClicked(int x, int y){
        return newSheetButton.contains(x, y);
    }

    public boolean newSheetButtonIsClicked(Point p){
        if (newSheetButton == null) return false;
        return newSheetButton.contains(p);
    }

    public Rectangle getNextButtonBounds(){
        Rectangle rect = new Rectangle();

        rect.setSize((int)BUTTON_SIZE.getWidth() - BUTTON_SPACE, (int)BUTTON_SIZE.getHeight());
        int tmpy = (BUTTON_SPACE*(sheetButtons.size()+1)) + (int)(BUTTON_SIZE.getHeight() * sheetButtons.size());
        rect.setLocation(BUTTON_SPACE/2, tmpy);

        return rect;
    }

    public Rectangle getNextButtonBounds(Rectangle curr){
        Rectangle rect = new Rectangle(curr);
        rect.translate(0, (int)curr.getHeight() + BUTTON_SPACE);
        return rect;
    }

    public Rectangle getNextDelButtonBounds(){
        Rectangle rect = new Rectangle(getNextButtonBounds());

        if (!deleteButtons.isEmpty()){
           return getNextDelButtonBounds(deleteButtons.get(deleteButtons.size()-1).getBounds());
        }

        return new Rectangle((int)(rect.getWidth() + 15), (int)(rect.getHeight()/2), deleteImg.getWidth(this), deleteImg.getHeight(this));
    }

    public Rectangle getNextDelButtonBounds(Rectangle curr){
        Rectangle rect = new Rectangle(curr);

        rect.translate(0, (int)getNextButtonBounds().getHeight() + BUTTON_SPACE);

        return rect;
    }

    public int getDeleteBuffer(){
        int ret = deleteBuffer;
        deleteBuffer = -1;
        return ret;
    }

    public int getSelectedSheet(){
        return selectedSheet;
    }

    public boolean checkAddSheetFlag(){
        if (addSheetFlag){
            addSheetFlag = false;
            return true;
        }
        return false;
    }

    public boolean checkSheetDeleteFlag(){
        if (sheetDeleteFlag){
            sheetDeleteFlag = false;
            return true;
        }
        return false;
    }

    //MouseListener

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){

            if (newSheetButtonIsClicked(e.getPoint())) {
                addSheetFlag = true;
            }

            int tmpIndex = selectSheet(e.getPoint());
            if (tmpIndex != -1){
                selectSheet(tmpIndex);
            }

            deleteSheetCheck(e.getPoint());
            /*if (tmpIndex != -1){
                deleteSheet(tmpIndex);
            }*/
        }
    }

    @Override
    public void paintComponent(Graphics g){
        //allSheets.get(selectedSheet).paintComponent(g);
        for (int i = 0; i < sheetButtons.size(); i++){
            sheetButtons.get(i).drawButton(g, this);
            deleteButtons.get(i).drawButton(g, this);
        }
        if (newSheetButton != null) newSheetButton.drawButton(g, this);
    }

}
