package opgave_1_og_2;

public class Værkfører extends Mekaniker {
    private int yearOfPromotion = 0;
    private double tillægTilLøn = 0.0;

    public Værkfører(String name, String address, int yearOfSvend, double timeLønSats, int yearOfPromotion,
            double tillægTilLøn) {
        super(name, address, yearOfSvend, timeLønSats);
        this.yearOfPromotion = yearOfPromotion;
        this.tillægTilLøn = tillægTilLøn;
    }

    public int getYearOfPromotion() {
        return yearOfPromotion;
    }

    public void setYearOfPromotion(int yearOfPromotion) {
        this.yearOfPromotion = yearOfPromotion;
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
