package Chess.Pieces;

import Chess.Board.GameController;
import Chess.Board.Move;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.util.List;

public abstract class aPiece extends Group {

    protected int cord_x, cord_y;
    protected boolean _white;

    @FXML
    GridPane _board;

    public void Piece(int x, int y, boolean white) {
        cord_x = x;
        cord_y = y;
        _white = white;
        this.setOnMouseClicked(e->{
            calculateLegalMoves(_board);
                }

        );
    }

    public abstract List<Move> calculateLegalMoves(GridPane board);

    public abstract Icon image();

    public abstract boolean isWhite();
}