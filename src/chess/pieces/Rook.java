
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author Luis Fellipe
 */
public class Rook extends ChessPiece {
    
    public Rook(Board board, Color color) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;         
    }
}
