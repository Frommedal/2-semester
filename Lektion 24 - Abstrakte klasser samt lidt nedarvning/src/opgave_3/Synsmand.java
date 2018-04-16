package opgave_3;

public class Synsmand extends Mekaniker {
    private int antalSyn = 0;
    private double tillægPerSyn = 250.0;

    public Synsmand(String name, String address, double payPerHour, int yearOfAnsættelse, int workWeek,
            int yearOfSvend) {
        super(name, address, payPerHour, yearOfAnsættelse, workWeek, yearOfSvend);
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
        return super.getWeeklyPaycheck() + (antalSyn * tillægPerSyn);
    }

}
