package opgave_2;

import java.util.ArrayList;

public class Heltal {

    public static void main(String[] args) {

        int[] s1 = { 2, 4, 6, 8, 10, 12, 14 };
        int[] s2 = { 1, 2, 4, 5, 6, 9, 12, 17 };

        for (int i : commonNumbers(s1, s2)) {
            System.out.println(i);
        }
    }

    /**
     * Returnerer et sorteret array der indeholder alle elementer l1 og l2 har til
     * fælles Krav: l1 og l2 er sorterede, indeholder ikke dubletter og indeholder
     * ikke tomme pladser
     */
    public static int[] commonNumbers(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length];
        int i1 = 0;
        int i2 = 0;
        int r1 = 0;

        while (i1 < s1.length && i2 < s2.length) {
            if (s1[i1] < s2[i2]) {
                i1++;
            } else if (s1[i1] > s2[i2]) {
                i2++;
            } else {
                result[r1] = s1[i1];
                i1++;
                i2++;
                r1++;
            }
        }

        int[] finalResult = new int[r1];
        for (int i = 0; i < finalResult.length; i++) {
            if (result[i] != 0) {
                finalResult[i] = result[i];
            }
        }
        return finalResult;
    }
}