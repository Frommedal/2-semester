package opgave4barchart;

import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {
    private ArrayList<Integer> list = new ArrayList<>();
	private Scanner ind;

    public ArrayList<Integer> readValues() {
        System.out.println("Indtast nogle positive tal.  " + "Indtast et negativt tal for at afslutte: ");

        ind = new Scanner(System.in);

        int n = ind.nextInt();
        while (n >= 0) {
            list.add(n);
            n = ind.nextInt();
        }
        return list;
    }

    /**
     * Finds and returns the max value in the list.
     *
     * @param list
     *            the list with values.
     * @return the max value found.
     */
    public int findMax(ArrayList<Integer> list) {
        // TODO: find max in list
        return 0;
    }

    /**
     * Prints out a BarChart of the values using the System.out.println method.
     */
    public void printBarChart() {
        //int max = findMax(this.list);   // opgaven er ikke lavet s� derfor er den udkommenteret
        // TODO: print out bar chart
    }
}
