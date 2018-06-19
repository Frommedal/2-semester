package opgave_1_og_2;

import java.util.ArrayList;

public class PersonApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Person mfa = new Person("Morten From Andersen", "Skanderborgvej");
        System.out.println(mfa.getAddress());

        Mekaniker bla = new Mekaniker("Benjamin Larsen", "Lidt flyvsk", 2018, 125.5);
        Mekaniker sje = new Mekaniker("Søren Jensen", "Juelsminde", 2016, 125.5);
        Mekaniker flb = new Mekaniker("Flemming Busk", "Lyngåvej", 2011, 135.5);
        System.out.println(bla.getPayPerHour());
        System.out.println(bla.getWeeklyPaycheck());

        Foreman tgn = new Foreman("Torbe Grove Nielsen", "Rosenhøj", 2014, 125.5, 2017, 50);
        System.out.println("Værkførerens tillæg er: " + tgn.getExtraPay() + " DKK");
        System.out.println("Denne værkførers navn er: " + tgn.getName());
        System.out.println(tgn.getName() + "'s ugenlige løn er: " + tgn.getWeeklyPaycheck() + " DKK");

        Synsmand als = new Synsmand("Alexander Lynge Skou", "Silkeborgvej 22", 2013, 135.5);
        als.setAntalSyn(10);
        als.lavEtSyn();

        ArrayList<Mekaniker> mekanikerList = new ArrayList<>();
        mekanikerList.add(bla);
        mekanikerList.add(sje);
        mekanikerList.add(flb);
        mekanikerList.add(tgn);
        mekanikerList.add(als);

        for (Mekaniker mekaniker : mekanikerList) {
            System.out.println(mekaniker.getWeeklyPaycheck()); // bare som test
        }
        Mekaniker.calculateTotalPay(mekanikerList);
        System.out.println("Samlet løn for alle mekanikere er: " + Mekaniker.calculateTotalPay(mekanikerList));
    }

}
