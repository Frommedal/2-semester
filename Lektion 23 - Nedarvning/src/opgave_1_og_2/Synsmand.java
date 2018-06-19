package opgave_1_og_2;

public class Synsmand extends Mekaniker {
    private int antalSyn = 0;
    private double extraPay = 250.0;

    public Synsmand(String name, String address, int yearOfSvend, double payPerHour) {
        super(name, address, yearOfSvend, payPerHour);
    }

    public int getAntalSyn() {
        return antalSyn;
    }

    public void setAntalSyn(int antalSyn) {
        this.antalSyn = antalSyn;
    }

    public void lavEtSyn() {
        this.antalSyn++;
    }

    @Override
    public double getWeeklyPaycheck() {
        return super.getWeeklyPaycheck() + (antalSyn * extraPay);
    }

}
