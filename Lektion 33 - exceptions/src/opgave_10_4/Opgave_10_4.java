package opgave_10_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Opgave_10_4 {

    public static void main(String[] args) {
        File file = new File("numbers.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Ingen fil fundet.");
        }

        ArrayList<Double> en = new ArrayList<>();
        ArrayList<Double> to = new ArrayList<>();

        int i = 0;
        double enen = 0;
        double toto = 0;
        while (scan.hasNext()) {
            double j = scan.nextDouble();
            if (i % 2 == 0) {
                en.add(j);
                enen = enen + j;
            } else {
                to.add(j);
                toto = toto + j;
            }
            i++;
        }
        System.out.println("Average is: " + (enen / (i / 2)) + "\n" + en);
        System.out.println("Average is: " + (toto / (i / 2)) + "\n" + to);

    }
}
