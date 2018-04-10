package yatzy;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // The Yatzy game object
    private Yatzy yatzy = new Yatzy();
    // Shows the face values of the 5 dice.
    private TextField[] txfValues;
    // Shows the hold status of the 5 dice.
    private CheckBox[] chbHolds;
    private TextField[] txfResults;
    private TextField[] txfscores;
    private TextField txfSumNum, txfBonus, txfSumOther, txfTotal;
    private Label lblRolled;
    private Button btnRoll;
    private Alert alarm;
    private boolean[] disableResults;
    private boolean newGame = false;

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        txfValues = new TextField[yatzy.getValues().length];
        for (int i = 0; i <= yatzy.getValues().length - 1; i++) {
            TextField txf = new TextField();
            txfValues[i] = txf;
            txf.setPrefWidth(50);
            txf.setPrefHeight(50);
            txf.setEditable(false);
            txfValues[i].setText("" + yatzy.getValues()[i]);
            txf.setFont(Font.font(24));
            txf.setAlignment(Pos.CENTER);
            dicePane.add(txf, i + 1, 0);
        }

        chbHolds = new CheckBox[yatzy.getValues().length];
        for (int i = 0; i <= yatzy.getValues().length - 1; i++) {
            CheckBox chb = new CheckBox("Hold");
            chb.setDisable(true);
            chbHolds[i] = chb;
            chb.setAlignment(Pos.CENTER);
            dicePane.add(chb, i + 1, 1);
        }

        btnRoll = new Button("Roll");
        dicePane.add(btnRoll, 4, 3);
        btnRoll.setPrefHeight(30);
        btnRoll.setPrefWidth(50);
        btnRoll.setFont(Font.font(null, FontWeight.BOLD, 12));
        btnRoll.setOnAction(event -> rollButton());

        lblRolled = new Label("Rolled: " + yatzy.getThrowCount());
        dicePane.add(lblRolled, 5, 3);

        // TODO: initialize txfValues, chbHolds, btnRoll and lblRolled

        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");

        Label lblOnes = new Label("1-s: ");
        scorePane.add(lblOnes, 0, 0);
        Label lblTwos = new Label("2-s: ");
        scorePane.add(lblTwos, 0, 1);
        Label lblThrees = new Label("3-s: ");
        scorePane.add(lblThrees, 0, 2);
        Label lblFours = new Label("4-s: ");
        scorePane.add(lblFours, 0, 3);
        Label lblFives = new Label("5-s: ");
        scorePane.add(lblFives, 0, 4);
        Label lblSixes = new Label("6-s: ");
        scorePane.add(lblSixes, 0, 5);
        Label lblSumNum = new Label("Sum: ");
        scorePane.add(lblSumNum, 2, 5);
        Label lblNumBonus = new Label("Bonus: ");
        scorePane.add(lblNumBonus, 4, 5);
        Label lblOnePair = new Label("One pair: ");
        scorePane.add(lblOnePair, 0, 6);
        Label lblTwoPair = new Label("Two pair: ");
        scorePane.add(lblTwoPair, 0, 7);
        Label lblThreeSame = new Label("Three same: ");
        scorePane.add(lblThreeSame, 0, 8);
        Label lblFourSame = new Label("Four same: ");
        scorePane.add(lblFourSame, 0, 9);
        Label lblFullHouse = new Label("Full house: ");
        scorePane.add(lblFullHouse, 0, 10);
        Label lblSmallStraight = new Label("Small Straight: ");
        scorePane.add(lblSmallStraight, 0, 11);
        Label lblLargeStraight = new Label("Large Straight: ");
        scorePane.add(lblLargeStraight, 0, 12);
        Label lblChance = new Label("Chance: ");
        scorePane.add(lblChance, 0, 13);
        Label lblYatzy = new Label("Yatzy: ");
        scorePane.add(lblYatzy, 0, 14);
        Label lblSumOther = new Label("Sum: ");
        scorePane.add(lblSumOther, 2, 14);
        Label lblTotal = new Label("Total: ");
        scorePane.add(lblTotal, 4, 14);

        txfscores = new TextField[15];
        for (int i = 0; i <= 14; i++) {
            int index = i;
            txfscores[i] = new TextField();
            txfscores[i].setOnMouseClicked(event -> resultClicked(index));
            txfscores[i].setPrefWidth(50);
            txfscores[i].setEditable(false);
            txfscores[i].setFont(Font.font(12));
            txfscores[i].setAlignment(Pos.CENTER);
            scorePane.add(txfscores[i], 1, (i - 1) + 1);
        }

        disableResults = new boolean[15];
        for (int i = 0; i < disableResults.length; i++) {
            disableResults[i] = false;
        }

        txfSumNum = new TextField();
        scorePane.add(txfSumNum, 3, 5, 1, 1);
        txfSumNum.setPrefWidth(50);
        txfSumNum.setEditable(false);

        txfBonus = new TextField();
        scorePane.add(txfBonus, 5, 5, 1, 1);
        txfBonus.setPrefWidth(50);
        txfBonus.setEditable(false);

        txfSumOther = new TextField();
        scorePane.add(txfSumOther, 3, 14, 1, 1);
        txfSumOther.setPrefWidth(50);
        txfSumOther.setEditable(false);

        txfTotal = new TextField();
        scorePane.add(txfTotal, 5, 14, 1, 1);
        txfTotal.setPrefWidth(50);
        txfTotal.setEditable(false);

        // TODO: Initialize labels for results, txfResults,
        // labels and text fields for sums, bonus and total.

    }

    // -------------------------------------------------------------------------

    // TODO: Create a method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.

    // -------------------------------------------------------------------------

    private void setNumbers() {
        boolean[] checkHold = new boolean[5];
        for (int i = 0; i <= yatzy.getValues().length - 1; i++) {
            if (chbHolds[i].isSelected()) {
                checkHold[i] = true;
            } else {
                checkHold[i] = false;
            }
        }
        yatzy.throwDice(checkHold);
        lblRolled.setText("Rolled: " + yatzy.getThrowCount());
    }

    public void possibleResult() {

        for (int i = 0; i < txfscores.length; i++) {
            if (!txfscores[i].isDisable()) {
                txfscores[i].setText("" + yatzy.getPossibleResults()[i]);
            }
        }
    }

    private void rollButton() {
        newGame = false;

        for (int i = 0; i <= yatzy.getValues().length - 1; i++) {
            chbHolds[i].setDisable(false);
        }
        if (yatzy.getThrowCount() < 3) {
            setNumbers();

            for (int i = 0; i <= yatzy.getValues().length - 1; i++) {
                txfValues[i].setText("" + yatzy.getValues()[i]);
                possibleResult();
            }
        } else {
            alarm = new Alert(AlertType.WARNING);

            alarm.setTitle("Dur ikke");
            alarm.setHeaderText("For mange slag");
            alarm.setContentText("HovHov kammerat bladfjeder! Kun 3 slag.");

            alarm.showAndWait();
            possibleResult();

        }
    }

    private void resultClicked(int index) {
        txfscores[index].setDisable(true);
        yatzy.resetThrowCount();
        for (int i = 0; i < chbHolds.length; i++) {
            chbHolds[i].setSelected(false);
        }
        endGame();
        createSum();
        createSum2();
        setTotal();
        if (newGame == false) {

            alarm = new Alert(AlertType.INFORMATION);

            alarm.setTitle("Score valgt");
            alarm.setHeaderText("Dit valg er registreret");
            alarm.setContentText("Dit valg er registreret og der bliver nu slået igen.");

            alarm.showAndWait();
            rollButton();
        }
    }

    public void createSum() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (txfscores[i].isDisable()) {
                sum += Integer.parseInt(txfscores[i].getText());
            }

            txfSumNum.setText("" + sum);
            setBonus();
        }

    }

    public void setBonus() {
        int bonus = 0;
        int minSum = 63;
        int sum = Integer.parseInt(txfSumNum.getText());
        if (sum > minSum) {
            bonus = 50;
        }
        txfBonus.setText("" + bonus);
    }

    public void createSum2() {
        int sum = 0;
        for (int i = 5; i < txfscores.length; i++) {
            if (txfscores[i].isDisable()) {
                sum += Integer.parseInt(txfscores[i].getText());
            }

            txfSumOther.setText("" + sum);
            // setTotal();
        }

    }

    public void setTotal() {
        int sum1 = Integer.parseInt(txfSumNum.getText());
        int sum2 = Integer.parseInt(txfSumOther.getText());
        int bonus = Integer.parseInt(txfBonus.getText());

        int total = sum1 + sum2 + bonus;

        txfTotal.setText("" + total);
    }

    public void endGame() {
        int j = 0;
        for (int i = 0; i < txfscores.length; i++) {
            if (txfscores[i].isDisable()) {
                j++;

            }
            if (j == 15) {
                alarm = new Alert(AlertType.INFORMATION);

                alarm.setTitle("Spillet er slut du!");
                alarm.setHeaderText("Spillet er slut.");
                alarm.setContentText("Spillet er slut for dig, din totale score blev = " + txfTotal.getText());
                alarm.showAndWait();

                Alert alarm2 = new Alert(AlertType.CONFIRMATION);

                alarm2.setTitle("Spille igen?");
                alarm2.setHeaderText("Vil du starte spillet forfra?");
                alarm2.setContentText("Klik ok for at starte spillet igen. Cancel for at lukke.");

                alarm2.showAndWait();

                if (alarm2.getResult() == ButtonType.OK) {
                    resetGame();
                    newGame = true;
                } else {
                    System.exit(1);
                }
            }

        }
    }

    public void resetGame() {
        for (int i = 0; i < txfscores.length; i++) {
            txfscores[i].clear();
            txfscores[i].setDisable(false);
        }
        for (int j = 0; j < txfValues.length; j++) {
            txfValues[j].clear();
            txfValues[j].clear();

        }
        txfSumNum.clear();
        txfSumOther.clear();
        txfBonus.clear();
        txfTotal.clear();
        lblRolled.setText("Rolled: " + yatzy.getThrowCount());
    }

}

// TODO: Create a method for mouse click on one of the text fields in
// txfResults.
// Hint: Create small helper methods to be used in the mouse click
// method.
