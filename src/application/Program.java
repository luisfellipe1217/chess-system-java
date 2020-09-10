package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author Luis Fellipe
 */
public class Program {
    
    public static void main(String[] args){
    
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
