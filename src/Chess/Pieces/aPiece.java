package Chess.Pieces;

public abstract class aPiece {

    protected int cord_x, cord_y;

    public void Piece(int x, int y) {
        cord_x = x;
        cord_y = y;
    }
}