package org.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> boardCells;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoardCells() {
        return boardCells;
    }

    public void setBoardCells(List<List<Cell>> boardCells) {
        this.boardCells = boardCells;
    }

    public Board(int size) {
        this.size = size;
        this.boardCells = new ArrayList<>(); // creates outer arraylist where we want to place

        for(int i=0;i<size;i++){
            this.getBoardCells().add(new ArrayList<>());
            for(int j=0;j<size;j++){
                this.getBoardCells().get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            List<Cell> row = boardCells.get(i);
            for(int j=0;j<size;j++){
                row.get(j).display();
            }
            System.out.println();
        }
    }

}
