package opgave_3_2;

public class testApp {

	public static void main(String[] args) {
		
		Skole s1 = new Skole("EAAA");
		Studerende st1 = new Studerende(10, "Alex Sm�rbakke");
		Studerende st2 = new Studerende(11, "Morten From");
		Studerende st3 = new Studerende(12, "John Fiedel");
		
		s1.addStuderende(st1);
		s1.addStuderende(st2);
		s1.addStuderende(st3);
		
		st1.addKarakter(6);
		st1.addKarakter(5);
		st2.addKarakter(5);
		st2.addKarakter(5);
		st3.addKarakter(5);
		st3.addKarakter(5);
		st3.addKarakter(12);
		
		
		System.out.println(s1);
		
		System.out.println(s1.findStuderende(10));
		System.out.println(s1.gennemsnit());
	}
}
