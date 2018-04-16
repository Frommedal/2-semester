package opgave_3;

public class Værkfører extends Ansat {
    private int yearOfGraduation = 0;
    private double tillægTilLøn = 0.0;

    public Værkfører(String name, String address, double payPerHour, int yearOfAnsættelse, int workWeek,
            int yearOfGraduation, double tillægTilLøn) {
        super(name, address, payPerHour, yearOfAnsættelse, workWeek);
        this.yearOfGraduation = yearOfGraduation;
        this.tillægTilLøn = tillægTilLøn;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfPromotion) {
        this.yearOfGraduation = yearOfPromotion;
    }

    public double getTillægTilLøn() {
        return tillægTilLøn;
    }

    public void setTillægTilLøn(double tillægTilLøn) {
        this.tillægTilLøn = tillægTilLøn;
    }

    @Override
    public double getWeeklyPaycheck() {
        return super.getWeeklyPaycheck() + (tillægTilLøn * getWorkWeek());
    }
}
