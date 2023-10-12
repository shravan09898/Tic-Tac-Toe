package org.tictactoe.models;

import java.util.Scanner;

public class Player {
    private Long id;
    private Symbol symbol;
    private String name;
    private PlayerType playerType;
    private Scanner sc;

    public Player(Long id, Symbol symbol, String name, PlayerType playerType) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
        this.sc = new Scanner(System.in);
    }

    public Move makeMove(Board board){
        System.out.println("Please enter row and col for move");
        int row = sc.nextInt();
        int col = sc.nextInt();
        // validate the move and throw a message or exception

        return new Move(new Cell(row, col, this), this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
