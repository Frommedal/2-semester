package opgave_4;

import java.util.*;

public class SpillerApp {

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 203, 89, 60));
        spillerListe.add(new Spiller("Mathilde", 154, 45, 61));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));
        spillerListe.add(new Spiller("Tonni", 167, 103, 113));

        ArrayList<Spiller> spillerListe2 = new ArrayList<>();
        spillerListe2.add(new Spiller("Bo", 203, 89, 60));
        spillerListe2.add(new Spiller("Hans", 196, 99, 45));
        spillerListe2.add(new Spiller("Mads", 200, 103, 37));
        spillerListe2.add(new Spiller("Lars", 192, 86, 35));
        spillerListe2.add(new Spiller("Jens", 188, 109, 32));
        spillerListe2.add(new Spiller("Finn", 194, 102, 12));

        // Opgave 4.1..
        System.out.println("Opgave 4.1");
        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinier(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinier(spillerListe, 30));
        System.out.println("");

        // Opgave 4.2..
        System.out.println("Opgave 4.2");
        System.out.println("Hvem har scoret måske 32 mål?: \n" + metoder.findScoreLinier(spillerListe, 32));
        System.out.println("Hvem har scoret måske 60 mål?: \n" + metoder.findScoreBinaer(spillerListe2, 60));
        System.out.println("");

        // Opgave 4.Tomas og Morten laver magi og sorteringsmetoder.
        System.out.println("Sorteret Descending rækkefølge: (Y)");
        ArrayList<Spiller> sorteretDescending = new ArrayList<>();
        sorteretDescending = metoder.sortSpillereDescending(spillerListe);
        for (int i = 0; i < sorteretDescending.size(); i++) {
            System.out.println(sorteretDescending.get(i));
        }
        System.out.println("");

        // Opgave 4.3..
        System.out.println("Opgave 4.3");
        ArrayList<Spiller> godesmåspillere = new ArrayList<>();
        godesmåspillere = metoder.godSpiller(spillerListe);
        System.out.println("Spillere under 170 og med over 50 mål er som følger: ");
        for (int i = 0; i < godesmåspillere.size(); i++) {
            System.out.println(godesmåspillere.get(i));
        }

    }
}
