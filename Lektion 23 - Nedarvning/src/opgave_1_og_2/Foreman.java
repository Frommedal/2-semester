package opgave_1_og_2;

public class Foreman extends Mekaniker {
    private int yearOfPromotion = 0;
    private double extraPay = 0.0;

    public Foreman(String name, String address, int yearOfSvend, double payPerHour, int yearOfPromotion,
            double extraPay) {
        super(name, address, yearOfSvend, payPerHour);
        this.yearOfPromotion = yearOfPromotion;
        this.extraPay = extraPay;
    }

    public int getYearOfPromotion() {
        return yearOfPromotion;
    }

    public void setYearOfPromotion(int yearOfPromotion) {
        this.yearOfPromotion = yearOfPromotion;
    }

    public double getExtraPay() {
        return extraPay;
    }

    public void setExtraPay(double extraPay) {
        this.extraPay = extraPay;
    }

    @Override
    public double getWeeklyPaycheck() {
        return super.getWeeklyPaycheck() + (extraPay * getWorkWeek());
    }
}
