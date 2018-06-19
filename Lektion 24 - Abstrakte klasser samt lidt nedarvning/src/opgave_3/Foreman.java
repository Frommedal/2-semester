package opgave_3;

public class Foreman extends Ansat {
    private int yearOfGraduation = 0;
    private double extraPay = 0.0;

    public Foreman(String name, String address, double payPerHour, int yearOfEmployement, int workWeek,
            int yearOfGraduation, double extraPay) {
        super(name, address, payPerHour, yearOfEmployement, workWeek);
        this.yearOfGraduation = yearOfGraduation;
        this.extraPay = extraPay;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfPromotion) {
        this.yearOfGraduation = yearOfPromotion;
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
