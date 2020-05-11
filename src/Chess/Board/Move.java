package Chess.Board;

import Chess.Pieces.Pawn;
import Chess.Pieces.aPiece;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Move {

    //Jag vill ha ett sätt för andra piece senare att ta fram alla möjliga tiles som den kan röra sig till,
    //sedan göra en For Each (moveable tile) GameController.BoardPos[cord_x + move][cord_y + move], add Circle moveable

    public static void calculateLegalMoves(aPiece piece, int cord_x, int cord_y) {
        Circle moveable = createMoveable(piece);
        if (piece.getClass().getSimpleName().equals("PAWN")){
            if (GameController.boardPos[cord_x][cord_y + 1].get_occupancy() == false) {
                GameController.boardPos[cord_x][cord_y + 1].getChildren().add(moveable);
                //Här behöver jag kalla på en Update() metod som uppdaterar _board med det nya boardet (boardPos).
            }
        }
    }

    private static Circle createMoveable(aPiece inputPiece) {
        Circle moveable = new Circle();
        moveable.setRadius(10);
        moveable.setFill(Color.GREEN);
        moveable.setOnMouseClicked(e->{
            //Jag vill göra här så att piecen flyttas till koordinaterna som moveable är på
            //För att göra detta måste jag kunna skicka koordinaterna från där moveable i boardPos[][] är till denna metod
        });
        return moveable;
    }

}
