package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethods {

    /**
     * Sums the numbers in the list using a for loop each
     */
    public int sumListeForEach(ArrayList<Integer> list) {
        int resultat = 0;
        for (int tal : list) {
            resultat = resultat + tal;
        }
        return resultat;
    }

    /**
     * Sums the numbers in the list using a for loop
     */
    public int sumListeFor(ArrayList<Integer> list) {
        int resultat = 0;
        for (int i = 0; i < list.size(); i++) {
            resultat = resultat + list.get(i);
        }
        return resultat;
    }

    /**
     * Returns the index of the first even number
     */
    public int hasEvenAtIndex(ArrayList<Integer> list) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()) {
            if (list.get(i) % 2 == 0) {
                index = i;
            }
            i++;
        }
        return index;
    }

    /**
     * Opgave 2.A Returnerer det mindste tal i list
     */
    public int min(ArrayList<Integer> list) {
        int minValue = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < minValue) {
                minValue = i;

            }

        }
        return minValue;
    }

    /**
     * Opgave 2.B Returnerer gemmensnittet af tallene i list
     */
    public double gennemsnit(ArrayList<Integer> list) {
        double snit = 0.0;

        for (int i : list) {
            snit = snit + i;
        }

        return snit / list.size();
    }

    /**
     * Opgave 2.C Returnerer antallet af gange 0 er i list
     */
    public int antalNuller(ArrayList<Integer> list) {
        int nuller = 0;
        for (int i : list) {
            if (i == 0) {
                nuller++;
            }
        }
        return nuller;
    }

    /**
     * Opgave 2.D Opdater listen så alle lige tal erstattes med 0
     */
    public void erstatLigeMedNul(ArrayList<Integer> list) {

        // for (int i : list) {
        // if (i % 2 != 1) {
        //

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 1) {
                list.set(i, 0);
            }
        }

    }

    /**
     * Opgave 2.E Returnerer en ny liste indeholdende alle de lige tal fra list
     */
    public ArrayList<Integer> enLigeListe(ArrayList<Integer> list) {
        ArrayList<Integer> ligeListe = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 1) {
                ligeListe.add(list.get(i));
            }
        }
        return ligeListe;
    }

    // lav en ekstra variabel til at holde styr på at du skal op foran og så tilbage
    // til sidste "lige".
    // dvs. en variabel der kun bliver plusset hvis der bliver fundet en lige i din
    // if sætning.
    // husk att add og remove det lige tal i arraylisten i hver itteration.
}
