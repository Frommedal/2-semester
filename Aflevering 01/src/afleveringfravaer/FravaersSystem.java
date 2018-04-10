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

        int totalFravær = 0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
                if (i == elevNr - 1) {
                    totalFravær = totalFravær + fravaer[i][j];
                }
            }
        }
        System.out.print("Det totale fravær for elev nummer " + elevNr + " er: " + totalFravær);
        System.out.println();
        System.out.println();
        return totalFravær;
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
        double totalFravær = 0.0;
        double gennemsnit = 0.0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
                if (i == elevNr - 1) {
                    totalFravær = totalFravær + fravaer[i][j];
                    // System.out.println(totalFravær); // test for at se om den regner rigtigt.
                }
            }
            gennemsnit = totalFravær / 12;
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
        int alleUdenFravær = 0;
        int totalFravær = 0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
                totalFravær = totalFravær + fravaer[i][j];
            }
            if (totalFravær == 0) {
                alleUdenFravær++;
            }
            totalFravær = 0;

        }
        System.out.print("Antallet af elever uden fravær er: " + alleUdenFravær);
        System.out.println();
        System.out.println();
        return alleUdenFravær;
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
        int højesteFravær = 0;
        int totalFravær = 0;
        int elevNr = 0;

        for (int i = 0; i < fravaer.length; i++) {
            for (int j = 0; j < fravaer[i].length; j++) {
                totalFravær = totalFravær + fravaer[i][j];
            }
            if (totalFravær > højesteFravær) {
                højesteFravær = totalFravær;
                elevNr = i + 1;
                totalFravær = 0;
            }
            totalFravær = 0;

        }
        System.out.print(
                "Eleven med det højeste fravær var elev nummer: " + elevNr + ". Hans fravær var på: " + højesteFravær);
        System.out.println();
        System.out.println();
        return højesteFravær;
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
