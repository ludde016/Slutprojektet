package Chess.Board;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class GameController {

    @FXML
    GridPane _board;

    public void initialize() {
            createBoard();
            placePieces();
    }
    public void createBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((col + row) % 2 == 0){
                    _board.add(new WhiteTile(row,col),row,col);
                }
                else {
                    _board.add(new BlackTile(row,col),row,col);
                }
            }
        }
    }
    public void placePieces() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ( row == 1){

                }
                else if (row == 6) {

                }
            }
        }
    }
}
