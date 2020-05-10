package Chess.Board;

import Chess.Pieces.Pawn;
import Chess.Pieces.aPiece;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class Move {


    public static void calculateLegalMoves(aPiece piece, int cord_x, int cord_y) {
        if (piece.getClass().getSimpleName().equals("PAWN")){
            if (GameController.boardPos[cord_x][cord_y + 1].get_occupancy() == false) {
                GameController.boardPos[cord_x][cord_y + 1].changeColor();
            }


        }
    }

}
