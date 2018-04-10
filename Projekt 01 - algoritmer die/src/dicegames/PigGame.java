package dicegames;

import java.util.Scanner;

public class PigGame {

    private Scanner scan = new Scanner(System.in);
    private Player[] player;
    private int currentPlayer;
    private Die dice;
    private int currentScore;
    private int endGameScore;
    private boolean keepPlaying = true;

    public PigGame() {
        player = new Player[2];
        player[0] = new Player();
        player[1] = new Player();
        currentPlayer = 0;
        dice = new Die();
        endGameScore = 100;
    }

    public void startGame() {
        System.out.println("Velkommen til Jysk Kasinos techno og grisespil. Det er her vi virkelig hygger.");
        System.out.println("Spillet kræver 2 spillere som skal indtasest inden spillet går i gang.");
        System.out.print("Dog starter vi med at beslutte hvad vi spiller til! Skriv tallet her: ");
        int score = scan.nextInt();
        if (score < 10) {
            endGameScore = 100;
            System.out.println("Sårn funker det ikke her ved wos, Du kan æ spille med et max på under 10!");
            System.out.println("I får lov til at spille til 100 hvis det ska vær på den mååe.");
        } else {
            endGameScore = score;
            System.out.println("Dette spil spilles nu til " + endGameScore + ".");
        }
        System.out.print("Instast spiller 1's navn her: ");
        player[0].setName(scan.next());
        System.out.print("Indtast spiller 2's navn her: ");
        player[1].setName(scan.next());
        System.out.println("Ønsker " + player[0].getName() + " at starte spillet? JA/NEJ");
        if (scan.next().equalsIgnoreCase("ja")) {
            takeTurn();
        } else {
            System.out.println("Så stopper det her! SÅS");
        }
    }

    private void takeTurn() {
        System.out.println("Tryk \"KAST\" for at kaste med terningen.");
        if (scan.next().equalsIgnoreCase("kast")) {
            keepPlaying = true;

            while (keepPlaying == true) {
                dice.roll();
                System.out.println(player[currentPlayer].getName() + " har slået: " + dice.getFaceValue());

                if (player[currentPlayer].getScore() + currentScore + dice.getFaceValue() >= endGameScore
                        && dice.getFaceValue() != 1) {
                    // win
                    player[currentPlayer].addToScore(currentScore + dice.getFaceValue());
                    keepPlaying = false;

                } else if (dice.getFaceValue() > 1) {
                    currentScore = currentScore + dice.getFaceValue();
                    System.out.println("Ønsker du at fortsætte med at kaste? JA/NEJ");
                    System.out.println(
                            "Trykker du nej stopper din tur og din nuværende score bliver tilføjet til din totale score.");
                    if (scan.next().equalsIgnoreCase("nej")) {
                        player[currentPlayer].addToScore(currentScore);
                        keepPlaying = false;
                    } else {
                        keepPlaying = true;
                    }

                } else {
                    currentScore = 0;
                    keepPlaying = false;
                    System.out.println("Det ser ud til du har slåen 1, det betyder ingen point i denne runde.");

                }

            }

            currentScore = 0;
            System.out.println("Din totale score er nu " + (player[currentPlayer].getScore()) + " point");

            if (player[currentPlayer].getScore() < endGameScore) {
                System.out.println(player[0].getName() + " har en total score på " + player[0].getScore());
                System.out.println(player[1].getName() + " har en total score på " + player[1].getScore());
                System.out.println("Første til at ramme " + endGameScore + " har vundet spillet!");
                if (currentPlayer == 0) {
                    currentPlayer = 1;
                } else {
                    currentPlayer = 0;
                }
                keepPlaying = true;
                System.out.println("Turen skifter til " + player[currentPlayer].getName());
                takeTurn();
            } else if (player[currentPlayer].getScore() >= endGameScore) {
                winTheGame();
            }

        } else {
            System.out.println("Hvis du ikke vil så vil du ikke, gå over og spil noget andet din tosk..");
        }

    }

    public void winTheGame() { //
        System.out.println(player[currentPlayer].getName() + " Har vundet spillet! Tillykke :)");
        keepPlaying = false;
        scan.close();

    }
}
