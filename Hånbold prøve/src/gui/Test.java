package gui;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Kamp;
import model.Spiller;
import service.Service;

public class Test extends Application {

    private ListView<Kamp> lvwKampe;
    private Button btnOpret;
    private Button btnUpdate;
    private Button btnLavFil;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Håndboldkampe");
        GridPane pane = new GridPane();
        initContent(pane, stage);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private void initContent(GridPane pane, Stage stage) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        Service.createSomeObjects();

        Label kampListLabel = new Label("Kampe");
        pane.add(kampListLabel, 0, 0);

        lvwKampe = new ListView<>();
        pane.add(lvwKampe, 0, 1);
        lvwKampe.setPrefHeight(200);
        lvwKampe.getItems().setAll(Service.getKampe());

        ChangeListener<Kamp> listener = new (ov, oldKamp, newFieldTrip) -> selectedFieldTrip(); // listener skal laves for at button nedenunder virker


        btnOpret = new Button("Opret ");

        btnLavFil = new Button("Lav fil");
        pane.add(btnLavFil, 1, 0);
        btnLavFil.setOnAction(event -> Kamp.spillerHonorar()); // den her!
    }

    private Object selectedFieldTrip() { // den her skal laves til listeneren ovenover!
        // TODO Auto-generated method stub
        return null;
    }

}
