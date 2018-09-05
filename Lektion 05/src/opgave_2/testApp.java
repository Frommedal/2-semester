package opgave_2;

public class testApp {

	public static void main(String[] args) {
		
		Skole s1 = new Skole("EAAA");
		Studerende st1 = new Studerende(10, "Alex Smørbakke");
		Studerende st2 = new Studerende(11, "Morten From");
		
		s1.addStuderende(st1);
		s1.addStuderende(st2);
		
		System.out.println(s1);
		
		System.out.println(s1.findStuderende(10));
	}
}
