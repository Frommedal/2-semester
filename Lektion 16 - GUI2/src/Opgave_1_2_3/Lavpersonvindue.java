package Opgave_1_2_3;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Lavpersonvindue extends Stage {
    public Lavpersonvindue(String title, Stage owner) {
        initOwner(owner);
        initStyle(StageStyle.UTILITY);
        initModality(Modality.APPLICATION_MODAL);
        setMinHeight(100);
        setMinWidth(200);
        setResizable(false);

        setTitle(title);
        GridPane pane = new GridPane();
        initContent(pane);

        Scene scene = new Scene(pane);
        setScene(scene);

    }

    private TextField txfName;
    private TextField txfTitle;
    private CheckBox chkSenior;
    private Button btnAdd;
    private Button btnCancel;
    private static Person person;
    private Alert alarm;

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name: ");
        pane.add(lblName, 0, 0);
        Label lblTitle = new Label("Title: ");
        pane.add(lblTitle, 0, 1);
        txfName = new TextField();
        pane.add(txfName, 1, 0, 4, 1);
        txfTitle = new TextField();
        pane.add(txfTitle, 1, 1, 4, 1);
        chkSenior = new CheckBox("Senior");
        pane.add(chkSenior, 0, 2);

        btnAdd = new Button("Tilføj");
        pane.add(btnAdd, 1, 3);

        btnAdd.setOnAction(event -> addPerson());

        btnCancel = new Button("Afbryd");
        pane.add(btnCancel, 2, 3);

        btnCancel.setOnAction(event -> closeWindow());
    }

    public void closeWindow() {
        close();
    }

    public void addPerson() {
        if (txfName.getText().length() > 0 && txfTitle.getText().length() > 0) {
            person = new Person(txfName.getText(), txfTitle.getText(), chkSenior.isSelected());
            close();
            txfTitle.clear();
            txfName.clear();

        } else {
            alarm = new Alert(AlertType.WARNING);

            alarm.setTitle("Dur ikke");
            alarm.setHeaderText("INFO MANGLER");
            alarm.setContentText("Du mangler entent titel eller navn i dit input");

            alarm.showAndWait();
        }

    }

    public static Person getPerson() {
        return person;
    }
}
