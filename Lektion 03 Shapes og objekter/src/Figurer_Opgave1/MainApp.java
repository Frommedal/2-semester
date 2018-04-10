package Figurer_Opgave1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
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
        Circle Cirkel = new Circle(50, 50, 40);
        pane.getChildren().add(Cirkel);
        Cirkel.setFill(Color.PALEVIOLETRED);
        Cirkel.setStroke(Color.BLUEVIOLET);
        Cirkel.setStrokeWidth(8);

        // Rectangle from (100,50) width 80 and height 40
        Rectangle Rektangel = new Rectangle(100, 50, 80, 40);
        pane.getChildren().add(Rektangel);
        Rektangel.setFill(Color.DEEPSKYBLUE);
        Rektangel.setStroke(Color.DARKGREEN);
        Rektangel.setStrokeWidth(5);

        Line linie = new Line(190, 50, 250, 70); // Line from (190,50) to (250,70)
        pane.getChildren().add(linie);
        linie.setFill(Color.DODGERBLUE);
    }
}
