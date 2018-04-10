package Opgave_05;

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
        pane.setPrefSize(600, 600);
        drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Rectangle baggrund = new Rectangle(20, 20, 450, 350);

        baggrund.setArcHeight(20);
        baggrund.setArcWidth(20);
        baggrund.setFill(Color.GREEN);
        baggrund.setStroke(Color.BLACK);
        pane.getChildren().add(baggrund);

        Rectangle mainpil = new Rectangle(250, 115, 25, 200);
        pane.getChildren().add(mainpil);
        mainpil.setFill(Color.WHITE);

    }
}
