package model;

public class Deltagelse {

    private boolean afbud;
    private String begrundelse;
    // grundet dobbeltretning skal den være her.
    private Spiller spiller;

    public Deltagelse(Spiller spiller) {
        this.spiller = spiller;
        // gør så man kan få spilleren ind på listen. Så den er dobbeltrettet.
        spiller.addDeltagelse(this);
    }

    public Deltagelse(String begundelse) {
        this.afbud = false;
        this.begrundelse = begundelse;
        this.spiller = null;
    }

    public boolean isAfbud() {
        return afbud;
    }

    public void setAfbud(boolean afbud) {
        this.afbud = afbud;
    }

    public String getBegrundelse() {
        return begrundelse;
    }

    public void setBegrundelse(String begrundelse) {
        this.begrundelse = begrundelse;
    }

    public Spiller getSpiller() {
        return spiller;
    }

    public void setSpiller(Spiller spiller) {
        this.spiller = spiller;
    }

    public void setAfmelding(Spiller spiller, String begrundelse) {
        setAfbud(true);
        setBegrundelse(begrundelse);
    }

    @Override
    public String toString() {
        return spiller.getNavn() + ", " + spiller.getAargang() + ", " + spiller.getHonorar();
    }

}
