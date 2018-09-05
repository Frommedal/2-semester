package opgave_3_2;

import java.util.Set;
import java.util.TreeSet;

public class Studerende implements Comparable<Studerende>{

	private int studieNr;
	private String navn;
	private Set<Double> karakterer = new TreeSet<>();
	
	public Studerende(int studieNr, String navn) {
		this.studieNr = studieNr;
		this.navn = navn;
	}
	
	public int getStudieNr() {
		return studieNr;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public void addKarakter(double karakter) {
		karakterer.add(karakter);
	}
	
	public Set<Double> getKarakterer() {
		return karakterer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Navn: " + navn + ", Studienr: " + studieNr;
	}
	
	public int compareTo(Studerende obj) { // Opgave 3
        if (obj.getStudieNr() == this.studieNr) {
            return navn.compareTo(obj.getNavn());
        }
        return Integer.compare(studieNr, obj.getStudieNr());
    }
}
