package chess.Figures;

import chess.Color;
import chess.Piece;
import chess.Position;

public class Knight extends Piece {
    public Knight(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String getSymbol() {
        return "N";
    }

    @Override
    public boolean isValidMove(Position target, Piece[][] board) {
        return true;
    }
}
