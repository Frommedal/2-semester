package opgave_2;

import java.util.ArrayList;

public class Opgave_2 {
	public static int antalNuller(ArrayList<Integer> list) {
		return nuller(list, list.get(0), list.size() -1);
		
	}
	
	public static int nuller(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			if (list.get(l)== 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			int m = (l + h) /2;
			int nuller1 = nuller(list, l, m);
			int nuller2 = nuller(list, m + 1, h);
			return nuller1 + nuller2;
		}
	}
}
