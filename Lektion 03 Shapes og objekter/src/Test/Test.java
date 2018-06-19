package Test;

import javafx.application.Application;
import javafx.scene.shape.Polygon;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

public class Test extends Application {

    private static final String tanklogoURL = "file:tanklogo.png";

    Image tanklogo = new Image(tanklogoURL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Polygon p = new Polygon();

        p.setLayoutX(10);
        p.setLayoutY(10);
        p.getPoints().add(50.0);
        p.getPoints().add(0.0);
        p.getPoints().add(100.0);
        p.getPoints().add(100.0);
        p.getPoints().add(0.0);
        p.getPoints().add(100.0);

        p.setFill(new ImagePattern(tanklogo, 0, 0, 1, 1, true));

    }
}
