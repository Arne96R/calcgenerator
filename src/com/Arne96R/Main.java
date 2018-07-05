package com.Arne96R;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // size of the puzzle
        int size = 4;
        ArrayList<Character> possibleValues = new ArrayList<>(size);

        for(int i=0; i<size; i++) {
            possibleValues.add((char)('A'+i));
        }

        System.out.println(possibleValues.toString());


        // initialize the puzzle grid with an empty grid
        Grid baseGrid = new Grid(size, possibleValues);

        baseGrid.randomizeGrid();

        System.out.println(baseGrid.toString());
    }
}
