package Chess.Board;

import Chess.Pieces.Queen;
import Chess.Pieces.aPiece;

public class EmptyTile extends aTile {

    EmptyTile(int coordinate) {
        super(coordinate);
    }

    public boolean IsTileOccupied() {

        return false;
    }

    public aPiece GetPiece() {
        return new Queen();
    }
}
