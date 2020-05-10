package Chess.Board;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class WhiteTile extends aTile{

    private Rectangle background = new Rectangle();

    WhiteTile(int y, int x) {
        super(y, x);
        this.getChildren().add(createBackground());
    }

    @Override
    public Rectangle createBackground() {
        background = new Rectangle();
        background.setFill(Color.WHITE);
        background.setHeight(60);
        background.setWidth(60);
        return background;

    }

    @Override
    public void changeColor() { //PROBLEM HÄR: behöver ett sätt att uppdatera de tiles som redan finns i _board
        background.setFill(Color.GREEN);
    }
}
