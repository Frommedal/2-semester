package opgave_4;

import java.util.*;

public class SpillerApp {

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 203, 89, 60));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));

        ArrayList<Spiller> spillerListe2 = new ArrayList<>();
        spillerListe2.add(new Spiller("Bo", 203, 89, 60));
        spillerListe2.add(new Spiller("Hans", 196, 99, 45));
        spillerListe2.add(new Spiller("Mads", 200, 103, 37));
        spillerListe2.add(new Spiller("Lars", 192, 86, 35));
        spillerListe2.add(new Spiller("Jens", 188, 109, 32));
        spillerListe2.add(new Spiller("Finn", 194, 102, 12));

        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinier(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinier(spillerListe, 30));

        // Tilføj kode der afprøver opgaver 4.2 og 4.3
        // System.out.println(metoder.findScoreLinier(spillerListe, 32));

        // System.out.println(metoder.findScoreBinær(spillerListe2, 60));
        spillerListe = metoder.sortSpillereDescending(spillerListe);
        for (int i = 0; i < spillerListe.size(); i++) {
            System.out.println(spillerListe.get(i));
        }

    }
}
