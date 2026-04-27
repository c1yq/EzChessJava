package chess.Figures;

import chess.Color;
import chess.Piece;
import chess.Position;

public class Bishop extends Piece {
    public Bishop(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean isValidMove(Position target, Piece[][] board) {

        return true;
    }
}
