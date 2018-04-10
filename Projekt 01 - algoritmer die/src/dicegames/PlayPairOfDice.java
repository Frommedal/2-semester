package dicegames;

import java.util.Scanner;

public class PlayPairOfDice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        System.out.println("Gódav og velkommen til jysk kasino \nKast terningerne så længe du vil.");
        System.out.println("Hvor mange sider har dine terninger?");

        int sides = scan.nextInt();

        PairOfDices dices;

        if (sides < 4) {
            System.out.println("Du får terninger med 6 sider da en terning med " + sides + " sider er noget vås!");
            dices = new PairOfDices();
            sides = 6;
        } else {
            dices = new PairOfDices(sides);
            System.out.println("Dine terninger har nu " + sides + " sider!");
        }

        String spil = "";
        boolean playing = true;

        System.out.println("Dit spil starter nu!");

        while (playing == true) {
            System.out.println("Ønsker du at kaste dine terninger? JA/NEJ");
            spil = scan.next().toLowerCase();
            if (spil.equalsIgnoreCase("nej")) {

                System.out.println("Ønsker du at genstarte spillet? GENSTART / AFSLUT");
                spil = scan.next().toLowerCase();
                if (spil.equalsIgnoreCase("genstart")) {
                    dices.resetPairOfDies();

                    System.out.println("Dit spil er nu genstartet!");
                    continue;
                } else if (spil.equalsIgnoreCase("afslut")) {
                    System.out.println("Spillet er slut! tak for besøget.");
                    break;
                } else {
                    System.out.println("Spillet fortsættes");

                }
            }
            dices.rollBothDices();
            System.out.println("Terningerne kastes...");
            System.out.println("terningerne viser " + dices.sumOfDices());

        }
        System.out.println("Der er i dette spil slået " + dices.getCounterPairs() + " par");
        System.out.println("Det højeste kast har været: " + dices.getBiggestRoll());
        for (int i = 0; i < sides; i++) {
            System.out.println("Der er blevet kastet " + dices.getEyeCounter(i) + " stk. " + (i + 1) + "'ere");

        }
        scan.close();
        System.out.println("Spillet er slut. Sås!");

    }

}