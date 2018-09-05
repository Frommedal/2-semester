package opgave_3_1;
import opgave_3_1.Studerende;

public class testApp {

	public static void main(String[] args) {
		
		Skole s1 = new Skole("EAAA");
		Studerende st1 = new Studerende(10, "Alex Smørbakke");
		Studerende st2 = new Studerende(11, "Morten From");
		Studerende st3 = new Studerende(12, "Martin Morris");
		Studerende st4 = new Studerende(12, "Martin Morris");
		
		
		s1.addStuderende(st1);
		s1.addStuderende(st2);
		
		System.out.println(s1);
		
		System.out.println(s1.findStuderende(10));
		System.out.println(st3.compareTo(st4));
	}
}
