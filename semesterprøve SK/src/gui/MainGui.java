package gui;

import java.time.LocalTime;

import javax.xml.bind.Marshaller.Listener;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Guest;
import model.OrderLine;
import service.Service;

public class MainGui extends Application {

    private ListView<Guest> lvwGuests;
    private ListView<OrderLine> lvwOrderLines;
    private TextField txfName, txfRoomNumber;
    private Button btnCreate, btnUpdate;
    private Alert alarm;
    private Listener listener;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hotel bestillinger");
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

        Label guestListLabel = new Label("Gæster");
        pane.add(guestListLabel, 0, 0);

        lvwGuests = new ListView<>();
        pane.add(lvwGuests, 0, 1, 1, 4); // tal 3 gør den det antal bredere, 4 gør den det antal længere.
        lvwGuests.setPrefHeight(200);
        lvwGuests.setPrefWidth(200);
        lvwGuests.getItems().setAll(Service.getGuests());

        ChangeListener<Guest> listener = (ov, oldGuest, newGuest) -> showTextFields();
        lvwGuests.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblName = new Label("Navn:");
        pane.add(lblName, 1, 1);

        txfName = new TextField();
        pane.add(txfName, 2, 1);

        Label lblRoomNumber = new Label("Værelses NR.:");
        pane.add(lblRoomNumber, 1, 2);

        txfRoomNumber = new TextField();
        pane.add(txfRoomNumber, 2, 2);

        btnCreate = new Button("Opret Gæst");
        pane.add(btnCreate, 1, 3);
        btnCreate.setPrefWidth(125);
        btnCreate.setOnAction(event -> createNewGuest());

        btnUpdate = new Button("Opdater Gæst");
        pane.add(btnUpdate, 2, 3);
        btnUpdate.setPrefWidth(125);
        btnUpdate.setOnAction(event -> updateGuest());

        // btnOpret = new Button("Opret kamp");
        // pane.add(btnOpret, 3, 1);
        // btnOpret.setPrefWidth(100);
        // btnOpret.setOnAction(event -> createNewKamp());
        //
        // Label lblSted = new Label("Spillested:");
        // pane.add(lblSted, 0, 2);
        //
        // txfSted = new TextField();
        // pane.add(txfSted, 1, 2);
    }

    // -------------------------------------------------------------------------

    private void showTextFields() {
        try {
            Guest guest = lvwGuests.getSelectionModel().getSelectedItem();
            this.txfName.setText(guest.getName());
            this.txfRoomNumber.setText("" + guest.getRoomNumber());
        } catch (NullPointerException e) {
            System.out.println("Torbens fejl" + e.getMessage());
        }

    }

    private void createNewGuest() {
        Service.createGuest(txfName.getText(), Integer.parseInt(txfRoomNumber.getText()));
        // her skal den resette listeneren da vi fanger en ny liste herunder og så ved
        // listeneren ikke hvor den skal kigge.
        // lvwGuests.removeListener(listener);
        lvwGuests.getItems().setAll(Service.getGuests());
    }

    private void updateGuest() {
        Service.updateGuest(lvwGuests.getSelectionModel().getSelectedItem(), txfName.getText(),
                Integer.parseInt(txfRoomNumber.getText()));
        lvwGuests.getItems().setAll(Service.getGuests());
    }
}
