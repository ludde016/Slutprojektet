package Chess.Board;

import Chess.Pieces.aPiece;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import Chess.Pieces.Pawn;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class GameController {

    @FXML
    GridPane _board;

    public static aTile[][] boardPos = new aTile[8][8];

    public void initialize() {
            createBoard();
            placePieces();
    }
    public void createBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((col + row) % 2 == 0){
                    boardPos[row][col] = new WhiteTile(row,col);
                    _board.add(boardPos[row][col],row,col);
                }
                else {
                    boardPos[row][col] = new BlackTile(row,col);
                    _board.add(boardPos[row][col],row,col);
                }
            }
        }
    }
    public void placePieces() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ( col == 1){
                    aPiece temp = new Pawn(row, col);
                    boardPos[row][col].addPiece(temp);
                }
                else if (col == 6) {

                }
            }
        }
    }

}
