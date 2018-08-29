package opgave_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave_2_app {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(new Integer[] {1,0,0,2,3,0,4,5}));
		
		System.out.println(Opgave_2.antalNuller(list));
	}

}
