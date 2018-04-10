// package opgave_4;
//
// import java.util.ArrayList;
//
// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.ListView;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;
//
// public class Boysandgirls extends Application {
// public static void main(String[] args) {
// Application.launch(args);
// }
//
// @Override
// public void start(Stage stage) {
// stage.setTitle("Personadminsystem");
// GridPane pane = new GridPane();
// initContent(pane);
//
// personvindue = new Lavpersonvindue("Lav person", stage);
//
// Scene scene = new Scene(pane);
// stage.setScene(scene);
// stage.show();
// }
//
// private ListView<Person> lvwPersoner;
// private Button btnAddPerson;
// private Lavpersonvindue personvindue;
// private ArrayList<Person> adperson = new ArrayList<>();
//
// private void initContent(GridPane pane) {
// // show or hide grid lines
// pane.setGridLinesVisible(false);
//
// // set padding of the pane
// pane.setPadding(new Insets(20));
// // set horizontal gap between components
// pane.setHgap(10);
// // set vertical gap between components
// pane.setVgap(10);
//
// Label lblPeople = new Label("People: ");
// pane.add(lblPeople, 0, 3);
//
// lvwPersoner = new ListView<>();
// pane.add(lvwPersoner, 1, 2, 1, 2);
//
// btnAddPerson = new Button("Add person");
// pane.add(btnAddPerson, 1, 1);
//
// btnAddPerson.setOnAction(event -> Lavpersonvindue());
//
// }
//
// public void Lavpersonvindue() {
// personvindue.showAndWait();
// if (Lavpersonvindue.getPerson() != null) {
// adperson.add(Lavpersonvindue.getPerson());
// lvwPersoner.getItems().setAll(adperson); // .getitems. setall(arraylist)
// }
//
// }
// }
