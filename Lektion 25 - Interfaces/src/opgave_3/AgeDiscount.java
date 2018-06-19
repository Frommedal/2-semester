package opgave_3;

public class AgeDiscount implements Discount {
    private double amount;
    private double originalPrice = 0.0;
    private int age;
    private double percent;

    public AgeDiscount(double originalPrice, int age) {
        this.setOriginalPrice(originalPrice);
        this.setAmount(0);
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

}
