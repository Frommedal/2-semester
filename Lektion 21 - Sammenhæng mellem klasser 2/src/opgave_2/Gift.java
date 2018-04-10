package opgave_2;

public class Gift {
    private String description;
    private double price = 0.0;

    public Gift(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
