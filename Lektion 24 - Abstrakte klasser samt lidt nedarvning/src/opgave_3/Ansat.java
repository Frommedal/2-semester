package opgave_3;

import java.util.ArrayList;

public abstract class Ansat extends Person {
    private double payPerHour = 0.0;
    private int yearOfAnsættelse = 0;
    private int workWeek = 0;

    public Ansat(String name, String address, double payPerHour, int yearOfAnsættelse, int workWeek) {
        super(name, address);
        this.payPerHour = payPerHour;
        this.yearOfAnsættelse = yearOfAnsættelse;
        this.workWeek = workWeek;
    }

    public String getABeastyName() {
        return getName() + " the Sexy Beast!";
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int getYearOfAnsættelse() {
        return yearOfAnsættelse;
    }

    public void setYearOfAnsættelse(int yearOfAnsættelse) {
        this.yearOfAnsættelse = yearOfAnsættelse;
    }

    public int getWorkWeek() {
        return workWeek;
    }

    public void setWorkWeek(int workWeek) {
        this.workWeek = workWeek;
    }

    public double getWeeklyPaycheck() {
        return getPayPerHour() * getWorkWeek();
    }

    public static double beregnSamletLøn(ArrayList<Ansat> ansatList) {
        double samletLøn = 0.0;
        for (Ansat ansat : ansatList) {
            samletLøn += ansat.getWeeklyPaycheck();
        }
        return samletLøn;
    }

}
