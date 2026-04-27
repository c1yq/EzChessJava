package chess;

import chess.Figures.*;

public class Board {

    private Piece[][] grid;

    public Board () {
        grid = new Piece[8][8];


        //Rooks
        grid[0][0] = new Rook(Color.BLACK, new Position(0, 0));
        grid[0][7] = new Rook(Color.BLACK, new Position(0, 7));
        grid[7][0] = new Rook(Color.WHITE, new Position(7, 0));
        grid[7][7] = new Rook(Color.WHITE, new Position(7, 7));



        //Knights
        grid[0][1] = new Knight(Color.BLACK, new Position(0, 1));
        grid[0][6] = new Knight(Color.BLACK, new Position(0, 6));
        grid[7][1] = new Knight(Color.WHITE, new Position(7, 1));
        grid[7][6] = new Knight(Color.WHITE, new Position(7, 6));

        //Bishops
        grid[0][2] = new Bishop(Color.BLACK, new Position(0, 2));
        grid[0][5] = new Bishop(Color.BLACK, new Position(0, 4));
        grid[7][2] = new Bishop(Color.WHITE, new Position(7, 2));
        grid[7][5] = new Bishop(Color.WHITE, new Position(7, 4));

        //Queens
        grid[0][3] = new Queen(Color.BLACK, new Position(0, 3));
        grid[7][3] = new Queen(Color.WHITE, new Position(7, 3));

        //Kings
        grid[0][4] = new King(Color.BLACK, new Position(0, 4));
        grid[7][4] = new King(Color.WHITE, new Position(7, 4));

        //Pawns
        for (int i = 0; i < 8; i++) {
            //black
            grid[1][i] = new Pawn(Color.BLACK, new Position(1, i));

            //white
            grid[6][i] = new Pawn(Color.WHITE, new Position(6, i));
        }
    }

        Piece[][] getGrid() {
            return grid;
        }

}
