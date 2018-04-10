package opgave_1;

import java.util.ArrayList;

public class Car {

    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals = new ArrayList<>();

    public Car(String license, double pricePerDay, int purchaseYear) {
        this.license = license;
        this.pricePerDay = pricePerDay;
        this.purchaseYear = purchaseYear;

    }

    public void setDayPrice(double price) {
        this.pricePerDay = price;
    }

    public double getDayPrice() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    void addRental(Rental rental) {
        rentals.add(rental);
    }

    void removeRental(Rental rental) {
        rentals.remove(rental);
    }

    public int longestRental() {
        int lr = 0;
        for (Rental i : rentals) {
            if (i.getDays() > lr) {
                lr = i.getDays();
            }
        }
        return lr;
    }
}
