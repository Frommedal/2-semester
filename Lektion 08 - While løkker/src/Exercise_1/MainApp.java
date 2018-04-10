package Exercise_1;

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

    private void drawShapes(GraphicsContext gc) {
        // draw an arrowhead at (50,30)
        int x = 100;
        int y = 75;
        int z = 2; // bruges til at gange koordinaterne op med så de bliver dobbelt så lange.
        gc.strokeLine(x, y, x + (10 * z), y - (4 * z));
        gc.strokeLine(x, y, x + (10 * z), y + (4 * z));

        // draw an arrowhead at (25,140)
        x = 100;
        y = 125;
        gc.strokeLine(x, y, x + (10 * z), y - (4 * z));
        gc.strokeLine(x, y, x + (10 * z), y + (4 * z));

        x = 20;
        y = 50;
        gc.strokeLine(x, y, x + (10 * z), y - (4 * z));
        gc.strokeLine(x, y, x + (10 * z), y + (4 * z));
    }

}
