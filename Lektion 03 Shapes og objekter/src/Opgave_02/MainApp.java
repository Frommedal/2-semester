package Opgave_02;

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
        Color Farve = new Color(0, 0, 1, 0.5); // Kan også deffineres med de allerede givede farver.

        Rectangle Rektangel = new Rectangle(100, 50, 120, 50);
        pane.getChildren().add(Rektangel);
        Rektangel.setFill(Farve);

        // Text Morten placeret Ovenpå rektanglen
        Text text = new Text(125, 80, "Matti er Sød");
        text.setFill(Color.BLACK);
        pane.getChildren().add(text);

    }
}
