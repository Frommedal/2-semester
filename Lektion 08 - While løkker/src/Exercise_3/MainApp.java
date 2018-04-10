package Exercise_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        GridPane root = initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    // private void drawShapes(GraphicsContext gc) { // figur 1
    // int x1 = 10; // start point: (x1,y1)
    // int y1 = 190;
    // int x2 = 10; // end point: (x2,y2)
    // int y2 = 10;
    // while (x2 <= 180) {
    // gc.strokeLine(x1, y1, x2, y2);
    // x2 = x2 + 40;
    // x1 = x1 + 40;
    // }
    //
    // }

    // private void drawShapes(GraphicsContext gc) { // figur 1
    // int x = 10; // start point: (x1,y1)
    // int y1 = 190;
    // int y2 = 10;
    // while (x <= 180) {
    // gc.strokeLine(x, y1, x, y2);
    // x = x + 40;
    // }
    //
    // }
    // private void drawShapes(GraphicsContext gc) { // figur 2
    // int x1 = 10; // start point: (x1,y1)
    // int y1 = 190;
    // int x2 = 10; // end point: (x2,y2)
    // int y2 = 10;
    // while (x2 <= 180) {
    // gc.strokeLine(y1, x1, y2, x2);
    // x2 = x2 + 40;
    // x1 = x1 + 40;
    // }
    //
    // }

    private void drawShapes(GraphicsContext gc) { // figur 3
        int x1 = 10; // start point: (x1,y1)
        int y1 = 90;
        int x2 = 10; // end point: (x2,y2)
        int y2 = 110;
        while (x2 <= 200) {
            gc.strokeLine(y1, x1, y2, x2);
            y2 = y2 + 20;
            y1 = y1 - 20;
            x2 = x2 + 40;
            x1 = x1 + 40;
        }

    }

}
