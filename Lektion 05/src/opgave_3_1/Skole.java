package opgave_3_1;

import java.util.HashSet;
import java.util.Set;

import opgave_3_1.Studerende;

public class Skole {

	private String navn;
	private Set<Studerende> studerendelist = new HashSet<>();
	
	public Skole(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void addStuderende(Studerende studerende) {
		studerendelist.add(studerende);
	}
	
	public void removeStuderende(Studerende studerende) {
		studerendelist.remove(studerende);
	}
	
	public Studerende findStuderende(int studieNr) {
		
		for (Studerende studerende : studerendelist) {
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
		
		for (Studerende studerende : studerendelist) {
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
