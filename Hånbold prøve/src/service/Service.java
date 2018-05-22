package service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import model.Spiller;
import storage.Storage;
import model.Deltagelse;
import model.Kamp;
import model.ProfSpiller;

public class Service {

    public static Spiller createSpiller(String navn, int aargang) {
        Spiller spiller = new Spiller(navn, aargang);
        Storage.addSpiller(spiller);
        return spiller;
    }

    public static void updateSpiller(Spiller spiller, String navn, int aargang) {
        spiller.setNavn(navn);
        spiller.setAargang(aargang);
    }

    public static ArrayList<Spiller> getSpillere() {
        return Storage.getSpillere();
    }

    // -------------------------------------------------------------------------

    public static ProfSpiller createProfSpiller(String navn, int aargang, double kampHonorar) {
        ProfSpiller profSpiller = new ProfSpiller(navn, aargang, kampHonorar);
        Storage.addProfSpiller(profSpiller);
        return profSpiller;
    }

    public static void updateProfSpiller(ProfSpiller profSpiller, String navn, int aargang, double kampHonorar) {
        profSpiller.setNavn(navn);
        profSpiller.setAargang(aargang);
        profSpiller.setKampHonorar(kampHonorar);
    }

    public static ArrayList<ProfSpiller> getProfSpillere() {
        return Storage.getProfSpillere();
    }

    // -------------------------------------------------------------------------

    public static Kamp createKamp(String sted, LocalDate dato, LocalTime tid) {
        Kamp kamp = new Kamp(sted, dato, tid);
        Storage.addKamp(kamp);
        return kamp;
    }

    public static void updateKamp(Kamp kamp, String sted, LocalDate dato, LocalTime tid) {
        kamp.setSted(sted);
        kamp.setDato(dato);
        kamp.setTid(tid);
    }

    public static ArrayList<Kamp> getKampe() {
        return Storage.getKampe();
    }

    // -------------------------------------------------------------------------

    // Opgave S9.
    public static ArrayList<Kamp> alleKampe(ArrayList<Kamp> list1, ArrayList<Kamp> list2) {
        ArrayList<Kamp> resultat = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1).compareTo(list2.get(index2)) <= 0) {
                resultat.add(list1.get(index1));
                index1++;
            } else {
                resultat.add(list2.get(index2));
                index2++;
            }
        }

        while (index1 < list1.size()) {
            resultat.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            resultat.add(list2.get(index2));
            index2++;
        }
        return resultat;
    }

    // -------------------------------------------------------------------------

    public static void createSomeObjects() {
        Spiller s1 = Service.createSpiller("Jane Jensen", 1999);
        Spiller s2 = Service.createSpiller("Lene Hansen", 2000);
        Spiller s3 = Service.createSpiller("Mette Petesen", 1999);

        ProfSpiller ps1 = Service.createProfSpiller("Sofia Kjeldsen", 1999, 50);
        ProfSpiller ps2 = Service.createProfSpiller("Maria Nielsen", 2000, 55);

        Kamp k1 = Service.createKamp("Herning", LocalDate.of(2015, 01, 26), LocalTime.of(10, 30));
        Kamp k2 = Service.createKamp("Ikast", LocalDate.of(2015, 01, 27), LocalTime.of(13, 30));

        Deltagelse d1 = k1.opretDeltagelse(s1);
        Deltagelse d2 = k1.opretDeltagelse(s2);
        Deltagelse d3 = k1.opretDeltagelse(s3);
        Deltagelse d4 = k1.opretDeltagelse(ps1);
        Deltagelse d5 = k1.opretDeltagelse(ps2);

        Deltagelse d6 = k1.opretDeltagelse(s1);
        Deltagelse d7 = k1.opretDeltagelse(s2);
        Deltagelse d8 = k1.opretDeltagelse(s3);
        Deltagelse d9 = k1.opretDeltagelse(ps1);
        Deltagelse d10 = k1.opretDeltagelse(ps2);

        d1.setAfmelding(s1, "Moster har fødselsdag");
        d9.setAfmelding(ps1, "Dårlig form");

        k1.compareTo(k2);

    }
}
