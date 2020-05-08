package Chess.Pieces;

import Chess.Board.Move;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Pawn extends aPiece{

    public Pawn() {
        Rectangle background = new Rectangle();
        Image temp = pieceImage();
        background.setFill(new ImagePattern(temp));
        background.setHeight(50);
        background.setWidth(40);
        this.getChildren().add(background);
    }

    @Override
    public List<Move> calculateLegalMoves(GridPane board) {
        
        return null;
    }

    @Override
    public Image pieceImage() {
        Image PawnImage = new Image(getClass().getClassLoader().getResource("Chess/Images/PawnImageTest.png").toString(), 40, 40, false, false);
        return PawnImage;
    }

    @Override
    public boolean isWhite() {
        return false;
    }
}
