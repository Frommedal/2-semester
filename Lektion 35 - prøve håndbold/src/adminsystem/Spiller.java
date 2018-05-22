package adminsystem;

public class Spiller {

    private String navn;
    private int årgang;

    public Spiller(String navn, int årgang) {
        this.navn = navn;
        this.årgang = årgang;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public double kampHonorar(Spiller spiller) {
        int deltagelser = 0;

        if (!Deltagelse.isAfbud()) {
            deltagelser++;
        }
        return deltagelser * 10;
    }
}
