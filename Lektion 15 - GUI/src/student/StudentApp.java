package student;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Student Administration");
        GridPane pane = new GridPane();
        initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private ArrayList<Student> students = new ArrayList<>();
    private TextField txfName;
    private TextField txfAge;
    private CheckBox chkActive;
    private TextArea txAInf;

    private Button btnAdd;
    private Button btnSave;
    private Button btnGet;
    private Button btnDelete;
    private Button btnIncreaseAge;

    private Controller controller = new Controller();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(25));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        txAInf = new TextArea();
        txAInf.setEditable(false);
        txAInf.setPrefWidth(230);
        txAInf.setPrefHeight(60);
        pane.add(txAInf, 0, 0, 5, 1);

        Label lblName = new Label("Navn");
        pane.add(lblName, 0, 1);
        Label lblAge = new Label("Alder");
        pane.add(lblAge, 0, 2);
        Label lblActive = new Label("Aktiv");
        pane.add(lblActive, 0, 3);

        txfName = new TextField();
        pane.add(txfName, 1, 1, 4, 1);

        txfAge = new TextField();
        pane.add(txfAge, 1, 2, 4, 1);

        chkActive = new CheckBox();
        pane.add(chkActive, 1, 3);

        // add a buttons to the pane
        btnAdd = new Button("Create");
        pane.add(btnAdd, 0, 5);
        btnSave = new Button("Save");

        pane.add(btnSave, 1, 5);
        btnGet = new Button("Load");

        pane.add(btnGet, 2, 5);
        btnDelete = new Button("Delete");
        pane.add(btnDelete, 3, 5);

        btnIncreaseAge = new Button("Increase Age");
        pane.add(btnIncreaseAge, 0, 6, 2, 1);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.controller.addAction());
        btnSave.setOnAction(event -> this.controller.saveAction());
        btnGet.setOnAction(event -> this.controller.getAction());
        btnDelete.setOnAction(event -> this.controller.deleteAction());
        btnIncreaseAge.setOnAction(event -> this.controller.increaseAgeAction());
    }

    /**
     * This class controls access to the model in this application. In this
     * case, the model is a single Student object.
     */
    private class Controller {
        private Student studerende = null;

        private void addAction() {

            try {
                studerende = new Student(txfName.getText().trim(),
                        Integer.parseInt(txfAge.getText()), chkActive.isSelected());
                clearFields();
                txAInf.setText(getDescription());

                students.add(studerende);

            } catch (NumberFormatException nfe) {
                System.out.println("Fejl!");
            }

        }

        private void saveAction() {
            if (studerende != null) {
                studerende.setName(txfName.getText().trim());
                studerende.setAge(Integer.parseInt(txfAge.getText()));
                studerende.setActive(chkActive.isSelected());
                clearFields();
                txAInf.setText(getDescription());

            }
        }

        private void getAction() {
            // if (studerende != null) {

            for (Student s : students) {
                // System.out.println("array " + s.getName());
                // System.out.println("textbox" + txfName.getText());
                if (s.getName().contentEquals(txfName.getText())) {

                    txfName.setText(s.getName());
                    txfAge.setText("" + s.getAge());
                    chkActive.setSelected(s.isActive());
                    txAInf.setText(s.toString());

                    // System.out.println("hit");
                    break;
                }

            }
            // }
        }

        private void deleteAction() {
            for (int i = 0; i < students.size(); i++) {

                if (students.get(i).getName().contentEquals(txfName.getText())) {
                    students.remove(i);
                    clearFields();
                    txAInf.clear();

                }
            }
        }

        private void increaseAgeAction() {
            if (studerende != null) {
                studerende.increaseAge();
            }
        }

        private void clearFields() {
            txfName.clear();
            txfAge.clear();
            chkActive.setSelected(false);
        }

        private String getDescription() {
            String result = "Ingen studerende gemt";
            if (studerende != null) {
                result = studerende.toString();
            }
            return result;
        }
    }
}
