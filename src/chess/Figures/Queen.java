package chess.Figures;

import chess.Color;
import chess.Piece;
import chess.Position;

public class Queen extends Piece {
    public Queen(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    @Override
    public boolean isValidMove(Position target, Piece[][] board) {
        return true;
    }
}
