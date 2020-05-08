package Chess.Pieces;

import Chess.Board.Move;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

import java.util.List;

public class Queen extends aPiece {

    @Override
    public List<Move> calculateLegalMoves(GridPane board) {
        return null;
    }

    @Override
    public Image pieceImage() {
        return null;
    }

    @Override
    public boolean isWhite() {
        return false;
    }
}