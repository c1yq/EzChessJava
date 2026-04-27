package chess.Figures;

import chess.Color;
import chess.Piece;
import chess.Position;

public class King extends Piece {
    public King(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean isValidMove(Position target, Piece[][] board) {
        return true;
    }
}
