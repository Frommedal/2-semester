package Opgave_03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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
        Color Farve = new Color(1, 1, 0, 1); // Kan også deffineres med de allerede givede farver.

        Circle omkreds = new Circle(200, 200, 100);
        pane.getChildren().add(omkreds);
        omkreds.setFill(Farve);

        Circle højreøje = new Circle(175, 175, 12);
        pane.getChildren().add(højreøje);

        Circle venstreøje = new Circle(225, 175, 12);
        pane.getChildren().add(venstreøje);

        Line mund = new Line(150, 225, 250, 225);
        pane.getChildren().add(mund);
        mund.setStrokeWidth(7);

    }
}
