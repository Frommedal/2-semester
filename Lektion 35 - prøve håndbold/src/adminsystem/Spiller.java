package adminsystem;

public class Spiller {

    private String navn;
    private int yearOfBirth;

    public Spiller(String navn, int yearOfBirth) {
        this.navn = navn;
        this.yearOfBirth = yearOfBirth;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double kampHonorar(Spiller spiller) {
        int deltagelser = 0;

        if (!Deltagelse.isAfbud()) {
            deltagelser++;
        }
        return deltagelser * 10;
    }
}
