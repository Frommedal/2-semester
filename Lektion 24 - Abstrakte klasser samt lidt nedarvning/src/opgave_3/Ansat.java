package opgave_3;

import java.util.ArrayList;

public abstract class Ansat extends Person {
    private double payPerHour = 0.0;
    private int yearOfEmployement = 0;
    private int workWeek = 0;

    public Ansat(String name, String address, double payPerHour, int yearOfEmployement, int workWeek) {
        super(name, address);
        this.payPerHour = payPerHour;
        this.yearOfEmployement = yearOfEmployement;
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

    public int getyearOfEmployement() {
        return yearOfEmployement;
    }

    public void setyearOfEmployement(int yearOfEmployement) {
        this.yearOfEmployement = yearOfEmployement;
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

    public static double calculateTotalPay(ArrayList<Ansat> ansatList) {
        double totalPay = 0.0;
        for (Ansat ansat : ansatList) {
        	totalPay += ansat.getWeeklyPaycheck();
        }
        return totalPay;
    }

}
