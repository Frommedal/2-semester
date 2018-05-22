package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp implements Comparable<Kamp> {

    private String sted;
    private LocalDate dato;
    private LocalTime tid;

    // deltagelses array grundet enkeltrettet aggregering.
    private ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Kamp(String sted, LocalDate dato, LocalTime tid) {
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setTid(LocalTime tid) {
        this.tid = tid;
    }

    public LocalTime getTid() {
        return tid;
    }

    // opgave s4.
    public ArrayList<String> afbud() {
        ArrayList<String> afbud = new ArrayList<>();
        for (Deltagelse i : deltagelser) {
            if (i.isAfbud()) {
                afbud.add(i.getSpiller().getNavn() + " " + i.getBegrundelse());
            }
        }
        return null;
    }

    public Deltagelse opretDeltagelse(Spiller spiller) {
        Deltagelse dt = new Deltagelse(spiller);
        deltagelser.add(dt);
        return dt;
    }

    @Override
    public int compareTo(Kamp o) {
        int comp0 = dato.compareTo(o.dato);
        if (comp0 == 0) {
            int comp1 = tid.compareTo(o.tid);
            if (comp1 == 0) {
                return sted.compareTo(o.getSted());
            } else {
                return comp1;
            }
        } else {
            return comp0;
        }
    }

    public void spillerHonorar(String tekstFil) {
        PrintWriter output = null;

        try {
            output = new PrintWriter(tekstFil);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i = 0;
        while (i < deltagelser.size()) {
            Deltagelse line = deltagelser.get(i);
            output.write("Spiller: " + line.getSpiller().getNavn() + ", aargang: " + line.getSpiller().getAargang()
                    + ", Honorar: " + line.getSpiller().getHonorar());
            i++;
        }
        output.close();
    }

    @Override
    public String toString() {
        return getSted() + ", " + getDato() + ", " + getTid();
    }
}
