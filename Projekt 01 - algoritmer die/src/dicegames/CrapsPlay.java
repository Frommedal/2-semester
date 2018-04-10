package dicegames;

import java.util.Scanner;

public class CrapsPlay {

    private Die die1;
    private Die die2;
    private boolean win = false;
    private int rememberThisThrow;
    private boolean isFirstThrow = true;
    private int score;
    private Scanner scan = new Scanner(System.in);
    private int sum;
    private int counterLoss;
    private int counterWin;

    public CrapsPlay() {
        die1 = new Die();
        die2 = new Die();

    }

    public void welcomeToGame() {
        System.out.println("Velkommen til æ spil.");
        startGame();
    }

    public void gameOver() {
        if (win != true) {
            System.out.println("Du har tabt. bedre held næste gang");
            counterLoss++;
        } else {
            System.out.println("Tillykke, du har vundet!");
            counterWin++;
        }
        System.out.println("Vil du gentage spillet? JA/NEJ");
        if (scan.next().equalsIgnoreCase("ja")) {
            resetGame();
        } else {
            System.out.println("Tak for spillet!\nDu har vundet " + counterWin + " spil.");
            System.out.println("Du har tabt " + counterLoss + " spil.");
        }

    }

    private void takeTurn() {
        die1.roll();
        System.out.println("Din første terning blev en " + die1.getFaceValue() + "'er");
        die2.roll();
        System.out.println("Din første terning blev en " + die2.getFaceValue() + "'er");
        System.out.println("Din totale sum er " + (die1.getFaceValue() + die2.getFaceValue()));
        sum = die1.getFaceValue() + die2.getFaceValue();
        if (isFirstThrow == true) {
            if (die1.getFaceValue() + die2.getFaceValue() == 7 || die1.getFaceValue() + die2.getFaceValue() == 11) {
                win = true;
                gameOver();
            } else if (die1.getFaceValue() + die2.getFaceValue() == 2 || die1.getFaceValue() + die2.getFaceValue() == 3
                    || die1.getFaceValue() + die2.getFaceValue() == 12) {
                win = false;
                gameOver();
            } else {
                rememberThisThrow = sum;
                isFirstThrow = false;
                startGame();
            }
        } else {
            score = die1.getFaceValue() + die2.getFaceValue();
            System.out.println("Du skal slå " + rememberThisThrow);
            if (score == 7) {
                win = false;
                gameOver();
            } else if (score == rememberThisThrow) {
                win = true;
                gameOver();
            } else {
                startGame();
            }
        }
    }

    private void startGame() {
        System.out.println("Vil du kaste med terningerne? JA/NEJ");
        if (scan.next().equalsIgnoreCase("ja")) {
            System.out.println("Du kaster nu terningerne");
            takeTurn();

        } else {
            win = false;
            gameOver();
        }
    }

    private void resetGame() {
        isFirstThrow = true;
        startGame();
    }

}
