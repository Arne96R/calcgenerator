package com.Arne96R;

import java.util.ArrayList;
import java.util.Random;

public class Grid {
    int size;
    ArrayList<Character> options;


    ArrayList<ArrayList<Cell>> grid;
    ArrayList<ArrayList<Cell>> groups;

    public Grid(int size, ArrayList<Character> options) {
        this.size = size;
        this.options = options;
        grid = new ArrayList<ArrayList<Cell>>(size);

        for(int i=0; i<size; i++) {
            grid.add(new ArrayList<Cell>(size));

            for(int j=0; j<size; j++) {
                grid.get(i).add(new Cell(options, i, j));
            }
        }
    }

    public void randomizeGrid() {
        int columnSwaps;
        int rowSwaps;
        int rotations;

        return;
    }

    public void groupGrid() {
        Random random = new Random();

        this.groups = new ArrayList<ArrayList<Cell>>();
        int groupNumber = 0;
        int groupsizeLower = 2;
        int groupsizeUpper = 3;
        int cellsLeft = this.size*this.size;

        while(this.size>0) {
            int groupsize = random.nextInt((groupsizeUpper-groupsizeLower)+1)+groupsizeLower;



            groupNumber++;
        }

        int rowIndex = 0;
        int columnIndex = 0;


    }

    public int getSize() {
        return size;
    }

    public ArrayList<Character> getOptions() {
        return options;
    }

    public ArrayList<ArrayList<Cell>> getGrid() {
        return grid;
    }

    public ArrayList<ArrayList<Cell>> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        ArrayList<String> stringGrid = new ArrayList<>();
        for(ArrayList<Cell> row : this.grid) {
            stringGrid.add(row.toString());
        }
        return stringGrid.toString();
    }
}
