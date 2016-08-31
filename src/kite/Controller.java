package kite;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Text splashText;

    @FXML private GridPane splashPane;

    private void act() {
        splashPane.setVisible(false);
    }

}
