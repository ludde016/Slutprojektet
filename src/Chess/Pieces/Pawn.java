package Chess.Pieces;

import Chess.Board.Move;
import Chess.Board.aTile;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.util.List;

public class Pawn extends aPiece{
    @Override
    public List<Move> calculateLegalMoves(GridPane board) {
        return null;
    }

    @Override
    public Icon image() {
        return null;
    }

    @Override
    public boolean isWhite() {
        return false;
    }
}
