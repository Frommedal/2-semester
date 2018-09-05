package opgave_2_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import opgave_2_3.Studerende;

public class Skole {

	private String navn;
	private HashMap<Integer, Studerende> studerendelist = new HashMap<>();
	
	public Skole(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void addStuderende(Studerende studerende) {
		studerendelist.put(studerende.getStudieNr(), studerende);
	}
	
	public void removeStuderende(Studerende studerende) {
		studerendelist.remove(studerende.getStudieNr(), studerende);
	}
	
	public Studerende findStuderende(int studieNr) {
		
		for (Studerende studerende : studerendelist.values()) {
			if (studerende.getStudieNr() == studieNr) {
				return studerende;
			}
		}
		return null;
	}
		
		
//		Studerende studerende = null;
//		
//		for (int i = 0; i < studerendelist.size(); i++) {
//			if (studerendelist.get(i).getStudieNr() == studieNr) {
//				studerende = studerendelist.get(i);
//			}
//		}
//			return studerende;
	
	public double gennemsnit() {
		int temp = 0;
		int karaktererTotal = 0;
		
		for (Studerende studerende : studerendelist.values()) {
			for (Integer karakterer : studerende.getKarakterer()) {
				temp = temp + karakterer;
				karaktererTotal++;
			}
			
		}
		return temp / karaktererTotal;
		
	}
//		int temp = 0;
//		double snit = 0.0;
//		
//		for (int i = 0; i < studerendelist.size(); i++) {
//			for (int j = 0; j < studerendelist.get(i).getKarakterer().size(); j++) {
//				temp = temp + studerendelist.get(i).getKarakterer().get(i);	
//			}
//			temp = temp / studerendelist.get(i).getKarakterer().size();
//			snit = snit + temp;
//			temp = 0;
//		}
//		
//		return snit / studerendelist.size();
//	}
	
	@Override
	public String toString() {
		return "Skole: " + navn + ", Studerende: " + studerendelist;
	}
}
