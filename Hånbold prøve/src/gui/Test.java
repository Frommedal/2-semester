package gui;

import java.time.LocalTime;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Kamp;
import service.Service;

public class Test extends Application {

    private ListView<Kamp> lvwKampe;
    private Button btnOpret, btnUpdate, btnLavFil, btnUpdateList;
    private TextField txfSted, txfDato, txfTid;
    private DatePicker dpiDato;
    private Alert alarm;

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
        lvwKampe.setPrefWidth(200);
        lvwKampe.getItems().setAll(Service.getKampe());

        ChangeListener<Kamp> listener = (ov, oldKamp, newKamp) -> getTextFields();
        lvwKampe.getSelectionModel().selectedItemProperty().addListener(listener);

        btnOpret = new Button("Opret ");

        btnLavFil = new Button("Lav fil");
        pane.add(btnLavFil, 1, 1);
        // btnLavFil.setOnAction(event -> Kamp.spillerHonorar("output.txt"));

        btnUpdateList = new Button("Opdater kamp liste"); // giver somehow null pointer - find ud af hvorfor.
        pane.add(btnUpdateList, 1, 0);
        btnUpdateList.setOnAction(event -> updateKampe());

        btnUpdate = new Button("Opdater kamp");
        pane.add(btnUpdate, 2, 1);
        btnUpdate.setPrefWidth(100);
        btnUpdate.setOnAction(event -> updateTextFields());

        btnOpret = new Button("Opret kamp");
        pane.add(btnOpret, 3, 1);
        btnOpret.setPrefWidth(100);
        btnOpret.setOnAction(event -> createNewKamp());

        Label lblSted = new Label("Spillested:");
        pane.add(lblSted, 0, 2);

        txfSted = new TextField();
        pane.add(txfSted, 1, 2);

        Label lblDato = new Label("Spilledato");
        pane.add(lblDato, 0, 3);

        dpiDato = new DatePicker();
        pane.add(dpiDato, 1, 3);

        Label lblTid = new Label("Spilletid");
        pane.add(lblTid, 0, 4);

        txfTid = new TextField();
        pane.add(txfTid, 1, 4);

    }

    private void getTextFields() {
        Kamp kamp = lvwKampe.getSelectionModel().getSelectedItem();
        if (kamp != null) {
            this.txfSted.setText(kamp.getSted());
            dpiDato.setValue((kamp.getDato()));
            this.txfTid.setText(kamp.getTid().toString());
        } else { // når du prøver at opdatere et object i en liste og så smider en ny liste så
                 // listeneren ikke kan finde den ting den plejede at finde i listen og giver
                 // null pointer exception.
            txfSted.clear();
            txfTid.clear();
        }
    }

    private void updateTextFields() {
        if (txfSted != null) {
            LocalTime tid = LocalTime.parse(txfTid.getText());
            Kamp kamp = lvwKampe.getSelectionModel().getSelectedItem();
            kamp.setSted(txfSted.getText());
            kamp.setDato(dpiDato.getValue());
            kamp.setTid(tid);
        } else {
            alarm = new Alert(AlertType.ERROR);

            alarm.setTitle("Dumhed");
            alarm.setHeaderText("Intet valgt");
            alarm.setContentText("For at opdatere en kamp skal du først vælge en kamp og derefter ændre i værdierne.");
            alarm.showAndWait();
        }
    }

    private void createNewKamp() {
        LocalTime tid = LocalTime.parse(txfTid.getText());
        Service.createKamp(txfSted.getText(), dpiDato.getValue(), tid);
    }

    private void updateKampe() {
        lvwKampe.getItems().setAll(Service.getKampe());
    }
}
