package opgave_1_og_2;

import java.util.ArrayList;

public class Mekaniker extends Person {
    private int yearOfSvend = 0;
    private double payPerHour = 0.0;
    private int workWeek = 37;

    public Mekaniker(String name, String address, int yearOfSvend, double payPerHour) {
        super(name, address);
        this.yearOfSvend = yearOfSvend;
        this.payPerHour = payPerHour;
    }

    public int getYearOfSvend() {
        return yearOfSvend;
    }

    public void setYearOfSvend(int yearOfSvend) {
        this.yearOfSvend = yearOfSvend;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public double getWeeklyPaycheck() {
        return payPerHour * workWeek;
    }

    public int getWorkWeek() {
        return workWeek;
    }

    public void setWorkWeek(int workWeek) {
        this.workWeek = workWeek;
    }

    public static double calculateTotalPay(ArrayList<Mekaniker> mekanikerList) {
        double totalPay = 0.0;
        for (Mekaniker mekaniker : mekanikerList) {
        	totalPay += mekaniker.getWeeklyPaycheck();
        }
        return totalPay;
    }
}
