package Opgave_04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane root = initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Circle inderste = new Circle(200, 200, 15);
        pane.getChildren().add(inderste);

        Circle imidten = new Circle(200, 200, 50);
        pane.getChildren().add(imidten);
        imidten.setFill(null);
        imidten.setStroke(Color.BLACK);
        imidten.setStrokeWidth(25);

        Circle yderste = new Circle(200, 200, 100);
        pane.getChildren().add(yderste);
        yderste.setFill(null);
        yderste.setStroke(Color.BLACK);
        yderste.setStrokeWidth(25);

    }
}
