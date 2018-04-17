package opgave_3;

public class AgeDiscount implements Discount {
    private double amount;
    private double originalPrice = 0.0;
    private int age;
    private double percent;

    public AgeDiscount(double originalPrice, int age) {
        this.originalPrice = originalPrice;
        this.amount = 0;
        this.age = age;
    }

    private void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public double getDiscountedPrice(double originalPrice) {

        setPercent(age);
        double discount = (originalPrice / 100) * percent;
        return originalPrice - discount;
    }

}
