package model;

import java.util.ArrayList;

public class Spiller {

    private String navn;
    private int aargang;
    ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Spiller(String navn, int aargang) {
        this.navn = navn;
        this.aargang = aargang;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    // opgave s2
    public double getHonorar() {
        int deltagelse = 0;
        for (Deltagelse d : deltagelser) {
            if (!d.isAfbud()) {
                deltagelse++;
            }
        }
        return deltagelse * 10;
    }

    public void addDeltagelse(Deltagelse deltagelse) {
        if (!deltagelser.contains(deltagelse)) {
            deltagelser.add(deltagelse);
        }
    }

    @Override
    public String toString() {
        return getNavn() + ", " + getAargang() + ", " + getHonorar();
    }
}
