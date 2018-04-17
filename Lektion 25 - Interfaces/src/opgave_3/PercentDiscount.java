package opgave_3;

public class PercentDiscount implements Discount {
    private int percent;
    private double originalPrice;

    public PercentDiscount(double originalPrice) {
        this.originalPrice = originalPrice;
        this.percent = 0;
    }

    public int getPercent() {
        return percent;
    }

    private void setPercent(int percent) {
        this.percent = percent;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Override
    public double getDiscountedPrice(double originalPrice) {
        if (originalPrice > 1000) {
            setPercent(25);
        } else {
            setPercent(0);
        }
        double discount = (originalPrice / 100) * percent;
        return originalPrice - discount;
    }
}
