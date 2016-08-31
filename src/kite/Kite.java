package kite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Kite extends Application {

    @Override
    public void init() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("splash.fxml"));
        primaryStage.setTitle("Kite");
        primaryStage.getIcons().add(new Image("http://4vector.com/i/free-vector-kite-icon_101937_Kite_icon.png"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, Color.rgb(0,132,199)));

        final Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        double stageHeight = visualBounds.getHeight() * 0.38;
        double stageWidth = stageHeight * 1.44;
        primaryStage.setX(visualBounds.getWidth() / 2 - stageWidth / 2);
        primaryStage.setY(visualBounds.getHeight() * 0.48 - stageHeight / 2);
        primaryStage.setWidth(stageWidth);
        primaryStage.setHeight(stageHeight);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
