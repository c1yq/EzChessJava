package chess.Figures;

import chess.Color;
import chess.Piece;
import chess.Position;

public class Pawn extends Piece {
    public Pawn(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    @Override
    public boolean isValidMove(Position target, Piece[][] board) {
        int currentRow = this.getPosition().row();
        int currentCol = this.getPosition().col();
        int targetRow = target.row();
        int targetCol = target.col();

        //Direction and color
        int direction = (this.getColor() == Color.BLACK) ? 1 : -1;
        int startRow = (this.getColor() == Color.BLACK) ? 1 : 6;

        //1 Step
        if (targetCol == currentCol && targetRow == currentRow + direction) {

            if (board[targetRow][targetCol] == null) {
                return true;
            }
        }

        //(only first move) 2 steps
        if (targetCol == currentCol && targetRow == currentRow + (2 * direction) && currentRow == startRow) {

            if (board[currentRow + direction][currentCol] == null && board[targetRow][targetCol] == null) {
                return true;
            }
        }

        //Diagonal move (for taking)/ moves the column to left or right
        if (Math.abs(targetCol - currentCol) == 1 && targetRow == currentRow + direction) {
            //only when there is an opposing figure
            Piece targetPiece = board[targetRow][targetCol];
            if (targetPiece != null) {

                if (targetPiece.getColor() != this.getColor()) {
                    return true;
                }
            }
        }

        //when none of the rules apply (illegal move)
        return false;
    }
}
