package opgave_3;

public class Mekaniker extends Ansat {
    private int yearOfSvend = 0;

    public Mekaniker(String name, String address, double payPerHour, int yearOfEmployement, int workWeek,
            int yearOfSvend) {
        super(name, address, payPerHour, yearOfEmployement, workWeek);
        this.yearOfSvend = yearOfSvend;
    }

    public int getYearOfSvend() {
        return yearOfSvend;
    }

    public void setYearOfSvend(int yearOfSvend) {
        this.yearOfSvend = yearOfSvend;
    }

}
