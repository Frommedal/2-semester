package Opgave_06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
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

        int grasa = 3;

        Rectangle huset = new Rectangle(70, 200, 120, 120);
        pane.getChildren().add(huset);
        huset.setFill(Color.RED);

        Rectangle vindue = new Rectangle(100, 230, 30, 30);
        pane.getChildren().add(vindue);
        vindue.setFill(Color.BLUE);

        Polygon tag = new Polygon(60, 200, 200, 200, 130, 120);
        pane.getChildren().add(tag);
        tag.setFill(Color.PURPLE);

        Circle solen = new Circle(300, 100, 50);
        pane.getChildren().add(solen);
        solen.setFill(Color.YELLOW);

        Line bund = new Line(70, 320, 350, 320);
        pane.getChildren().add(bund);

        Rectangle dør = new Rectangle(140, 260, 30, 60);
        pane.getChildren().add(dør);

        Line gras1 = new Line(200, 320, 203, 310);
        pane.getChildren().add(gras1);

        Line gras2 = new Line(205, 320, 208, 310);
        pane.getChildren().add(gras2);

        Line gras3 = new Line(208, 320, 213, 310);
        pane.getChildren().add(gras3);

        Line gras4 = new Line(213, 320, 218, 310);
        pane.getChildren().add(gras4);

        Line gras5 = new Line(218, 320, 221, 310);
        pane.getChildren().add(gras5);

        Line gras6 = new Line(221, 320, 224, 310);
        pane.getChildren().add(gras6);

        Line gras7 = new Line(221 + (1 * grasa), 320, 224 + (1 * grasa), 310);
        pane.getChildren().add(gras7);

        Line gras8 = new Line(225, 320, 229, 310);
        pane.getChildren().add(gras8);

        Line gras9 = new Line(228, 320, 232, 310);
        pane.getChildren().add(gras9);

        Line gras10 = new Line(233, 320, 235, 310);
        pane.getChildren().add(gras10);

        Line gras11 = new Line(236, 320, 238, 310);
        pane.getChildren().add(gras11);

        Line gras12 = new Line(239, 320, 242, 310);
        pane.getChildren().add(gras12);

    }
}
