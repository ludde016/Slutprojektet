package Chess.Board;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class WhiteTile extends aTile{


    WhiteTile(int y, int x) {
        super(y, x);
        Rectangle background = new Rectangle();
        background.setFill(Color.WHITE);
        background.setHeight(60);
        background.setWidth(60);
        this.getChildren().add(background);
    }
}
