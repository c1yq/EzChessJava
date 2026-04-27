package chess;

public class Main {
    public static void main(String[] args) {
        Board chessBoard = new Board();

        Piece[][] Figur = chessBoard.getGrid();


        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {

                if (Figur[i][j] == null) {
                    System.out.print(". ");
                }

                else {
                    System.out.print(Figur[i][j].getSymbol() + " ");
                }
            }
            System.out.println("  " + (8 - i));
        }
        System.out.println();
        System.out.println("A B C D E F G H");

    }
}