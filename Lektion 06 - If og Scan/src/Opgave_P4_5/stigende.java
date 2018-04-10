package Opgave_P4_5;

import java.util.Scanner;

public class stigende {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // her laves scanner funktionen
        System.out.print("Skriv tal 1: "); // vores 3 forskellige tal der skal inputtes.
        int tal1 = scan.nextInt();
        System.out.print("Skriv tal 2: ");
        int tal2 = scan.nextInt();
        System.out.print("Skriv tal 3: ");
        int tal3 = scan.nextInt();

        if (tal3 > tal2 && tal2 > tal1) { // Formlen skal laves med && ellers virker det ikke. Her betyder det at 3 er
                                          // højere end 2 og 2 er højere end 1.
            System.out.println("Tallene: " + tal1 + " " + tal2 + " " + tal3 + " - er i stigende rækkefølge");
        } else if (tal1 > tal2 && tal2 > tal3) { // samme som over, bare omvendt.
            System.out.println("Tallene: " + tal1 + " " + tal2 + " " + tal3 + " - er i faldende rækkefølge");
        } else { // else er her alle andre tilfælde derfor ingen deffination
            System.out.println("Neither");
        }
        scan.close();
    }
}
