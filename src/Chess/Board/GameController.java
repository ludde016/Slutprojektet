package Chess.Board;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class GameController {

    @FXML
    GridPane _board;

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((j + i) % 2 == 0){
                    _board.add(new WhiteTile(i,j),i,j);
                }
                else {
                    _board.add(new BlackTile(i,j),i,j);
                }
            }
        }

    }
}
