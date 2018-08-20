package opgave_10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave_10_2 {
    public static void main(String[] args) {
        File file = new File("mary.txt"); // importerer den nyeste fil
        Scanner scan = null; // opretter scanner
        PrintWriter output = null; // opretter printwritter (til at udskrive til ny fil)

        try {
            scan = new Scanner(file);
            output = new PrintWriter("denher.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ingen fil fundet, program lukker!");
            return;
        }

        int i = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine(); // god ide at lave en linie som man så bruger hele vejen igennem løkken.
                                           // Undgår at komme til at scanne flere gange
            System.out.println(line);
            output.write("/* " + i + " */ " + line + "\n");
            i++;
        }

        output.close();
        scan.close();

    }
}
