package Chess.Board;

import Chess.Pieces.aPiece;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public abstract class aTile extends StackPane {

    private aPiece occupant;
    private boolean occupancy;
    protected int cord_y, cord_x;

    aTile (int y, int x) {
        cord_x = x;
        cord_y = y;
    }

    // Drar inte nytta av occupant metoderna än...

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

    public abstract Rectangle createBackground();

    public void addPiece (aPiece piece) {
        this.getChildren().add(piece);
        set_occupant(piece);
    }

    public abstract void changeColor();
}