package Opgave_P4_1;

import java.util.Scanner;

public class posnulellernegativ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv et heltal: ");
        int tal = scan.nextInt();

        if (tal > 0) {
            System.out.print("Tallet " + tal + " er positivt!");
        } else if (tal == 0) {
            System.out.print("Tallet " + tal + " er neutralt");
        } else {
            System.out.print("Tallet " + tal + " er negativt");
        }
        scan.close();
    }
}