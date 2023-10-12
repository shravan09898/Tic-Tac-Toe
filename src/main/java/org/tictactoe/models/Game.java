package org.tictactoe.models;

import org.tictactoe.exceptions.InvalidBotCountException;
import org.tictactoe.exceptions.InvalidDimensionException;
import org.tictactoe.exceptions.InvalidateDuplicatePlayerExcepion;
import org.tictactoe.exceptions.InvalidateNoOfPlayersException;
import org.tictactoe.strategies.WinningStrategy;

import java.util.*;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;

    private Game(List<Player> players, Board board, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.board = board;
        this.moves = new ArrayList<Move>();
        this.winner = winner;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public static class Builder{

        public static Builder builder(){
            return new Builder();
        }
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;

        private Builder() {
            this.players = new ArrayList<Player>();
            this.winningStrategies = new ArrayList<WinningStrategy>();
            this.dimension = 0;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
        }

        public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
        }

        public void setDimensions(int dimension) {
            this.dimension = dimension;
        }

        public void addPlayer(Player player){
            players.add(player);
        }

        public void addWinningStrategy(WinningStrategy winningStrategy){
            winningStrategies.add(winningStrategy);
        }

        private void validateBotsCount(){
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT))
                    botCount++;

                if(botCount>1){
                    //throw an exception
                    throw new InvalidBotCountException("Bot count cant be more than 1");
                }
            }
        }

        private void validateDmimensions(){
            if(dimension<3 || dimension>10){
                throw new InvalidDimensionException("board should be above 3 or less than 11");
            }
        }

        private void validateNumOfPlayers(){
            if(players.size()!=dimension-1){
                throw new InvalidateNoOfPlayersException("Player count should be 1 less than board size");
            }
        }

        private void validateUniqueSymbols(){
            HashSet<Character> set = new HashSet<>();
            for(Player player : players){
                if(set.contains(player.getSymbol().getPlayerSymbol()))
                    throw new InvalidateDuplicatePlayerExcepion("Player symbol can't be duplicate");
                else{
                    set.add(player.getSymbol().getPlayerSymbol());
                }
            }
        }

        private void validate(){
            validateBotsCount();
            validateDmimensions();
            validateNumOfPlayers();
            validateUniqueSymbols();
        }

        private Game build(){
            validate();
            return new Game(players, new Board(dimension), winningStrategies);
        }
    }
}
