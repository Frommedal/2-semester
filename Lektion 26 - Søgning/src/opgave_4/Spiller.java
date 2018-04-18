package opgave_4;

public class Spiller {
    private String navn;
    private int hojde;
    private int vaegt;
    private int antalMaal;

    // Opretter et Spiller objekt med navn, højde, vægt og
    // antal mål
    public Spiller(String navn, int hoejde, int vaegt, int antalmaal) {
        this.hojde = hoejde;
        this.navn = navn;
        this.vaegt = vaegt;
        this.antalMaal = antalmaal;
    }

    // returnerer spillerens navn
    public String getNavn() {
        return navn;
    }

    // returnerer spillerens højde i cm
    public int getHoejde() {
        return hojde;
    }

    // returnerer spillerens vægt i kg
    public int getVaegt() {
        return vaegt;
    }

    // returnerer antal mål spilleren har scoret i
    // indeværende sæson
    public int getMaal() {
        return antalMaal;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + " højde: " + hojde + " vægt: " + vaegt + " mål: " + antalMaal;
    }

    // @Override
    // public double compareTo(Spiller spillerli) {
    // int compareMaal = ((Spiller) spillerli).getMaal();
    //
    // // ascending order
    // // return this.quantity - compareQuantity;
    //
    // // descending order
    // return compareMaal - this.antalMaal;
    // }

    // public static Comparator<Spiller> SpillerMaal = new Comparator<Spiller>() {
    //
    // @Override
    // public int compare(Spiller spiller1, Spiller spiller2) {
    //
    // int spillerMaal1 = spiller1.getMaal();
    // int spillerMaal2 = spiller2.getMaal();
    //
    // // ascending order
    // // return fruitName1.compareTo(fruitName2);
    //
    // // descending order
    // return spillerMaal2.compareTo(spillerMaal1);
    // }

    // int comparescore = spillerli.getMaal();
    // return comparescore - this.antalMaal;
    // Collections.sort(spillerListe1);

}
