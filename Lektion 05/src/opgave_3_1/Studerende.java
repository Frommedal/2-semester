package opgave_3_1;

import java.util.ArrayList;

public class Studerende implements Comparable<Studerende>{

	private int studieNr;
	private String navn;
	private ArrayList<Integer> karakterer = new ArrayList<>();
	
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
	
	public void addKarakter(int karakter) {
		karakterer.add(karakter);
	}
	
	public ArrayList<Integer> getKarakterer() {
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
