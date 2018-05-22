package adminsystem;

import java.util.ArrayList;

import adminsystem.Spiller;
import adminsystem.Kamp;

public class Storage {
    private static ArrayList<Spiller> spillere = new ArrayList<>();
    private static ArrayList<Kamp> kampe = new ArrayList<>();

    public static ArrayList<Spiller> getSpillere() {
        return new ArrayList<>(spillere);
    }

    public static void addSpiller(Spiller spiller) {
        spillere.add(spiller);
    }

    public static void removeSpiller(Spiller spiller) {
        spillere.remove(spiller);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Kamp> getKampe() {
        return new ArrayList<>(kampe);
    }

    public static void addKamp(Kamp kamp) {
        kampe.add(kamp);
    }

    public static void removeKamp(Kamp kamp) {
        kampe.remove(kamp);
    }
}
