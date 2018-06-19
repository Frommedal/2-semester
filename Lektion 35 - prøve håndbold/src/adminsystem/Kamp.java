package adminsystem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp {
    private String sted;
    private LocalDate dato;
    private LocalTime tid;
    private Deltagelse deltagelse;
    private ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Kamp(String sted, LocalDate dato, LocalTime tid, Deltagelse deltagelse) {
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
        this.setDeltagelse(deltagelse);
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public LocalTime getTid() {
        return tid;
    }

    public void setTid(LocalTime tid) {
        this.tid = tid;
    }

	public Deltagelse getDeltagelse() {
		return deltagelse;
	}

	public void setDeltagelse(Deltagelse deltagelse) {
		this.deltagelse = deltagelse;
	}

	public ArrayList<Deltagelse> getDeltagelser() {
		return deltagelser;
	}

	public void setDeltagelser(ArrayList<Deltagelse> deltagelser) {
		this.deltagelser = deltagelser;
	}

}
