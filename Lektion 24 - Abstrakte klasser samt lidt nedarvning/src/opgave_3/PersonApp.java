package opgave_3;

import java.util.ArrayList;

public class PersonApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Person mfa = new Person("Morten From Andersen", "Skanderborgvej");
        System.out.println(mfa.getAddress());

        Mekaniker bla = new Mekaniker("Benjamin Larsen", "Lidt flyvsk", 125.5, 2018, 37, 2013);
        Mekaniker sje = new Mekaniker("Søren Jensen", "Juelsminde", 135, 2014, 37, 2013);
        Mekaniker flb = new Mekaniker("Flemming Busk", "Lyngåvej", 142.5, 2012, 37, 2007);
        System.out.println(bla.getPayPerHour());
        System.out.println(bla.getWeeklyPaycheck());

        Værkfører tgn = new Værkfører("Torbe Grove Nielsen", "Rosenhøj", 125.5, 2014, 37, 2012, 50);
        System.out.println("Værkførerens tillæg er: " + tgn.getTillægTilLøn() + " DKK");
        System.out.println("Denne værkførers navn er: " + tgn.getName());
        System.out.println(tgn.getName() + "'s ugenlige løn er: " + tgn.getWeeklyPaycheck() + " DKK");

        StableBoy mbø = new StableBoy("Martin Børkop", "Skanderborg", 95.0, 2017, 25, "Alt de andre ikke gider lave");

        System.out.println(mbø.getABeastyName());

        Synsmand als = new Synsmand("Alexander Lynge Skou", "Silkeborgvej 22", 125.5, 2013, 37, 2013);
        als.setAntalSyn(10);
        als.lavEtSyn();

        ArrayList<Ansat> ansatList = new ArrayList<>();
        ansatList.add(bla);
        ansatList.add(sje);
        ansatList.add(flb);
        ansatList.add(tgn);
        ansatList.add(als);
        ansatList.add(mbø);

        for (Ansat ansat : ansatList) {
            System.out.println(ansat.getName() + " har en ugeløn på " + ansat.getWeeklyPaycheck()); // bare som test
        }
        Ansat.beregnSamletLøn(ansatList);
        System.out.println("Samlet løn for alle ansatte er: " + Ansat.beregnSamletLøn(ansatList));
    }

}
