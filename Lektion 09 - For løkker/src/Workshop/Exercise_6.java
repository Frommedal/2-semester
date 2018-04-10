package Workshop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_6 extends Application {
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

    private void drawShapes(GraphicsContext gc) {
        int y1 = 165; // start point: (x,y1)
        int y2 = 171; // end point: (x,y2)
        int i = 0;

        for (i = 0; i < 12; i++) {
            int x = 14 + i * 14;

            if (i % 5 == 0) {
                gc.strokeLine(x, y1 - 3, x, y2 + 3);
                gc.fillText(i + "", x, y1 + 20);
            } else {
                gc.strokeLine(x, y1, x, y2);
            }

        }

        gc.strokeLine(0, 168, 182, 168);
        gc.strokeLine(177, 163, 182, 168);
        gc.strokeLine(177, 173, 182, 168);
    }
}
