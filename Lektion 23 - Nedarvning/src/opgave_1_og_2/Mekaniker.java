package opgave_1_og_2;

import java.util.ArrayList;

public class Mekaniker extends Person {
    private int yearOfSvend = 0;
    private double timeLønSats = 0.0;
    private int workWeek = 37;

    public Mekaniker(String name, String address, int yearOfSvend, double timeLønSats) {
        super(name, address);
        this.yearOfSvend = yearOfSvend;
        this.timeLønSats = timeLønSats;
    }

    public int getYearOfSvend() {
        return yearOfSvend;
    }

    public void setYearOfSvend(int yearOfSvend) {
        this.yearOfSvend = yearOfSvend;
    }

    public double getTimeLønSats() {
        return timeLønSats;
    }

    public void setTimeLønSats(double timeLønSats) {
        this.timeLønSats = timeLønSats;
    }

    public double getWeeklyPaycheck() {
        return timeLønSats * workWeek;
    }

    public int getWorkWeek() {
        return workWeek;
    }

    public void setWorkWeek(int workWeek) {
        this.workWeek = workWeek;
    }

    public static double beregnSamletLøn(ArrayList<Mekaniker> mekanikerList) {
        double samletLøn = 0.0;
        for (Mekaniker mekaniker : mekanikerList) {
            samletLøn += mekaniker.getWeeklyPaycheck();
        }
        return samletLøn;
    }
}
