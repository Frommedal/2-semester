package opgave_3;

public class Car {

    private String license;
    private double pricePerDay;
    private int purchaseYear;

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

}
