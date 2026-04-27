package chess.Figures;

import chess.Color;
import chess.Piece;
import chess.Position;

public class Rook extends Piece {
    public Rook(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean isValidMove(Position target, Piece[][] board) {
        // 1. Hole die aktuellen Koordinaten des Turms
        int currentRow = this.getPosition().row();
        int currentCol = this.getPosition().col();

        // 2. Hole die Ziel-Koordinaten
        int targetRow = target.row();
        int targetCol = target.col();

        // 3. Prüfe die Turm-Regel (Gerade Linien)
        // Wenn die Zeile gleich bleibt ODER die Spalte gleich bleibt, ist die Bewegung gültig.
        return (currentRow == targetRow) || (currentCol == targetCol);
    }
}
