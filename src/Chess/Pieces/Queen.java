package Chess.Pieces;

import Chess.Board.Move;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Queen extends aPiece {

    @Override
    public void calculateLegalMoves(GridPane board) {

    }

    @Override
    public Rectangle createPiece() {
        return null;
    }

    @Override
    public Image pieceImage() {
        return null;
    }

    @Override
    aPiece getPiece() {
        return this;
    }

    @Override
    public boolean isWhite() {
        return false;
    }
}