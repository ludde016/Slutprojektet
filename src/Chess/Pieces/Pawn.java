package Chess.Pieces;

import Chess.Board.GameController;
import Chess.Board.Move;
import Chess.Board.aTile;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Pawn extends aPiece{
    private int cord_x;
    private int cord_y;

    public Pawn(int row, int col) {
        cord_x = row;
        cord_y = col;
        this.getChildren().add(createPiece());
        this.setOnMouseClicked(e->{
            Move.calculateLegalMoves(getPiece(), cord_x, cord_y);
                });
    }

    @Override
    public void calculateLegalMoves(GridPane board) {
    }

    @Override
    public Rectangle createPiece() {
        Rectangle piece = new Rectangle();
        Image temp = pieceImage();
        piece.setFill(new ImagePattern(temp));
        piece.setHeight(50);
        piece.setWidth(40);
        return piece;
    }

    @Override
    public Image pieceImage() {
        Image PawnImage = new Image(getClass().getClassLoader().getResource("Chess/Images/PawnImageTest.png").toString(), 40, 40, false, false);
        return PawnImage;
    }

    @Override
    aPiece getPiece() {
        return this;
    }

    @Override
    public boolean isWhite() { //Används inte än
        return false;
    }
}
