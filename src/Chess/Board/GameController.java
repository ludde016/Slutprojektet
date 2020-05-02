package Chess.Board;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class GameController {

    @FXML
    GridPane _board;
    protected aTile temp;

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((j + i) % 2 == 0){
                    temp = new WhiteTile(i,j);
                }
                else {
                    System.out.println("what the fuck");
                    temp = new BlackTile(i,j);
                }
                _board.getChildren().add(temp);
            }
        }

    }
}
