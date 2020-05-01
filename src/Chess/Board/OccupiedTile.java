package Chess.Board;

import Chess.Pieces.Queen;
import Chess.Pieces.aPiece;

public class OccupiedTile extends aTile{
    OccupiedTile(int coordinate) {
        super(coordinate);
    }

    public boolean IsTileOccupied() {

        return true;
    }

    public aPiece GetPiece() {
        return new Queen();
    }
}
