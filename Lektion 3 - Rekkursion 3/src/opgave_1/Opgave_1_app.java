package opgave_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave_1_app {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		
		System.out.println(Opgave_1.totalSum(list));
	}
}
