package storage;

import java.util.ArrayList;

import model.Spiller;
import model.Kamp;
import model.ProfSpiller;

public class Storage {
    private static ArrayList<Spiller> spillere = new ArrayList<>();
    private static ArrayList<Kamp> kampe = new ArrayList<>();
    private static ArrayList<ProfSpiller> profSpillere = new ArrayList<>();

    // -------------------------------------------------------------------------

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

    // -------------------------------------------------------------------------

    public static ArrayList<ProfSpiller> getProfSpillere() {
        return new ArrayList<>(profSpillere);
    }

    public static void addProfSpiller(ProfSpiller profSpiller) {
        profSpillere.add(profSpiller);
    }

    public static void removeSpiller(ProfSpiller profSpiller) {
        profSpillere.remove(profSpiller);
    }
}
