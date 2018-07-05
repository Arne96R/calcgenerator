package com.Arne96R;

import java.util.ArrayList;

public class Cell {
    private ArrayList<Character> options;
    private int rowIndex;
    private int columnIndex;
    private int groupNumber;
    private char value;

    public Cell(ArrayList<Character> options, int rowIndex, int columnIndex) {
        this.options = options;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;

        this.value = options.get((columnIndex+rowIndex)%options.size());
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        String ret = Character.toString(this.value);
        return ret;
    }
}
