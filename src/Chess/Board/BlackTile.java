package Chess.Board;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BlackTile extends aTile{


    BlackTile(int y, int x) {
        super(y, x);
        Rectangle background = new Rectangle();
        background.setFill(Color.BLACK);
        background.setHeight(30);
        background.setWidth(30);
        this.getChildren().add(background);
    }
}
