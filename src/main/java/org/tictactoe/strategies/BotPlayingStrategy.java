package org.tictactoe.strategies;

import org.tictactoe.models.Board;
import org.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
