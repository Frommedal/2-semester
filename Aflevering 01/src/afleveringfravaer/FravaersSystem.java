package afleveringfravaer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FravaersSystem {
    /**
     * Frafaldstallene udskrives på skærmen
     *
     *
     * @param fravaer
     */
    Scanner scan = new Scanner(System.in);
    String input = scan.toString();

    public void udskrivFravaer(int[][] fravaer) {
        // TODO
        for (int i = 0; i < fravaer.length; i++) {
            System.out.print("Student nr. " + (i + 1) + "'s fravær er: \n");
            for (int j = 0; j < fravaer[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(fravaer[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Returnerer det samlede antal fraværsdage over 12 måneder for eleven med
     * elevnr.
     *
     * @param fravaer
     * @param elevNr
     * @return
     */
    public int samletFravaer(int[][] fravaer, int elevNr) {

        int totalAbsent = 0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
                if (i == elevNr - 1) {
                	totalAbsent = totalAbsent + fravaer[i][j];
                }
            }
        }
        System.out.print("Det totale fravær for elev nummer " + elevNr + " er: " + totalAbsent);
        System.out.println();
        System.out.println();
        return totalAbsent;
    }

    /**
     * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
     * elevNr.
     *
     * @param fravaer
     * @param elevNr
     * @return
     */
    DecimalFormat df = new DecimalFormat("####0.00");

    public double gennemsnit(int[][] fravaer, int elevNr) {
        double totalAbsent = 0.0;
        double gennemsnit = 0.0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
                if (i == elevNr - 1) {
                	totalAbsent = totalAbsent + fravaer[i][j];
                    // System.out.println(totalFravær); // test for at se om den regner rigtigt.
                }
            }
            gennemsnit = totalAbsent / 12;
        }
        System.out.print("Det gennemsnitlige fravær for elev nummer " + elevNr + " er: " + df.format(gennemsnit));
        System.out.println();
        System.out.println();
        return gennemsnit;
    }

    /**
     * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
     *
     * @param fravaer
     * @return
     */
    public int antalUdenFravaer(int[][] fravaer) {
        int allWithoutAbsent = 0;
        int totalAbsent = 0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
            	totalAbsent = totalAbsent + fravaer[i][j];
            }
            if (totalAbsent == 0) {
            	allWithoutAbsent++;
            }
            totalAbsent = 0;

        }
        System.out.print("Antallet af elever uden fravær er: " + allWithoutAbsent);
        System.out.println();
        System.out.println();
        return allWithoutAbsent;
    }

    /**
     * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
     * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer for
     * en af disse.
     *
     * @param fravaer
     * @return
     */
    public int mestFravaer(int[][] fravaer) {
        int highestAbsent = 0;
        int totalAbsent = 0;
        int elevNr = 0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
            	totalAbsent = totalAbsent + fravaer[i][j];
            }
            if (totalAbsent > highestAbsent) {
            	highestAbsent = totalAbsent;
                elevNr = i + 1;
                totalAbsent = 0;
            }
            totalAbsent = 0;

        }
        System.out.print(
                "Eleven med det højeste fravær var elev nummer: " + elevNr + ". Hans fravær var på: " + highestAbsent);
        System.out.println();
        System.out.println();
        return highestAbsent;
    }

    /**
     * Registrerer at eleven med elevNr ikke har haft fravær i nogen af de 12
     * måneder.
     *
     * @param fravaer
     * @param elevNr
     */
    public void nulstil(int[][] fravaer, int elevNr) {

        System.out
                .println("Er du sikker på at du vil nulstille fraværet for elev nummer " + elevNr + " ? angiv Ja/Nej");
        if (scan.next().equalsIgnoreCase("ja")) {
            for (int i = 0; i < fravaer.length; i++) {
                for (int j = 0; j < fravaer[i].length; j++) {
                    if (i == elevNr - 1) {
                        fravaer[i][j] = 0;
                    }
                }

            }
            System.out.println("Elevens fravær er blevet nulstillet.");

        } else {
            System.out.println("Elevens fravær er ikke blevet nulstillet.");
        }

    }
}
