package opgave_1;

import java.util.ArrayList;

public class Opgave_1 {
	
	public static int totalSum(ArrayList<Integer> list) {
		return sum(list, 0, list.size() -1);
		
	}
	
	public static int sum(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			return list.get(l);
		} else {
			int m = (l + h) /2;
			int sum1 = sum(list, l, m);
			int sum2 = sum(list, m + 1, h);
			return sum1 + sum2;
			
		}
	}
}