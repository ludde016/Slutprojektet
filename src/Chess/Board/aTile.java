package Chess.Board;

import Chess.Pieces.aPiece;
import javafx.scene.layout.StackPane;

public abstract class aTile extends StackPane {

    private aPiece occupant;
    private boolean occupancy;
    protected int cord_y, cord_x;

    aTile (int y, int x) {
        cord_x = x;
        cord_y = y;
    }

    public aPiece get_occupant(){
        return occupant;
    }

    public void set_occupant(aPiece piece) {
        if (!occupancy) {
            occupant = piece;
            occupancy = true;
        }
    }
    public boolean get_occupancy() {
        return occupancy;
    }
}