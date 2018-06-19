package Opgave_7_billede;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Polygon;
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
        pane.setPrefSize(500, 500);
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

        Rectangle mainpil = new Rectangle(260, 115, 25, 200);
        mainpil.setFill(Color.WHITE);
        pane.getChildren().add(mainpil);

        Polygon mainpiltop = new Polygon(235, 115, 310, 115, 272.50, 80);
        mainpiltop.setFill(Color.WHITE);
        pane.getChildren().add(mainpiltop);

        Text textOnTheRight = new Text(350, 140, "E45");
        textOnTheRight.setFill(Color.WHITE);
        textOnTheRight.setStyle("-fx-font: 52 arial;");
        pane.getChildren().add(textOnTheRight);

        CubicCurve kurvepil = new CubicCurve(180, 150, 235, 170, 272.50, 195, 272.50, 250);
        kurvepil.setStroke(Color.WHITE);
        kurvepil.setStrokeWidth(25);
        kurvepil.setFill(null);
        pane.getChildren().add(kurvepil);

        Polygon venstrepil = new Polygon(160, 180, 185, 120, 145, 135);
        venstrepil.setFill(Color.WHITE);
        pane.getChildren().add(venstrepil);

        Text texttilvenstre = new Text(30, 100, "BØRKOP");
        texttilvenstre.setFill(Color.WHITE);
        texttilvenstre.setStyle("-fx-font: 44 arial;");
        pane.getChildren().add(texttilvenstre);

        Rectangle ben1 = new Rectangle(100, 370, 25, 100);
        ben1.setFill(Color.rgb(145, 159, 151));
        pane.getChildren().add(ben1);

        Rectangle ben2 = new Rectangle(370, 370, 25, 100);
        ben2.setFill(Color.rgb(145, 159, 151));
        pane.getChildren().add(ben2);

    }
}