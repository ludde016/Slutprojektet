package Chess.Board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MenuController {

    @FXML
    BorderPane _root;

    Parent _gameView;
    Parent _menuView;

    {
        try {
            _gameView = FXMLLoader.load(getClass().getResource("Game.fxml"));
            _menuView = FXMLLoader.load(getClass().getResource("Start.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize() {

    }


    public void onStartGame(ActionEvent actionEvent) {
        _root.setCenter(_gameView);
    }

    public void onMainMenu(ActionEvent actionEvent) {
        _root.setCenter(_menuView);
    }
}
