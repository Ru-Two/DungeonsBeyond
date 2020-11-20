package main;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class SheetListPanelTest {

    //Testing of method by Ruturaj Darji
    @Test
    void getNextButtonBounds() {
        SheetListPanel test = new SheetListPanel();
        Rectangle first_bounds = test.getNextButtonBounds();
        Rectangle test_bounds = test.getNextButtonBounds(first_bounds);

        //print both bounds to make sure they are not overlapping. these buttons should be the same size, but different positions
        System.out.println(first_bounds + "\n" + test_bounds);
    }
}