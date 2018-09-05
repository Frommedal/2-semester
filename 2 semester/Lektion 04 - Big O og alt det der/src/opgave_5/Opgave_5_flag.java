package opgave_5;

import java.util.ArrayList;

public class Opgave_5_flag {

	
	public static void italianFlag(char[] italienskeFlag) {
		ArrayList<Character> G = new ArrayList<>();
		ArrayList<Character> H = new ArrayList<>();
		ArrayList<Character> R = new ArrayList<>();
		ArrayList<Character> result = new ArrayList<>();

		
		for (int i = 0; i < italienskeFlag.length; i++) {
			if (italienskeFlag[i] == 'g') {
				G.add(italienskeFlag[i]);
			} else if (italienskeFlag[i] == 'h') {
				H.add(italienskeFlag[i]);
			} else  if (italienskeFlag[i] == 'r') {
				R.add(italienskeFlag[i]);
			}
		}
		
		result.addAll(G);
		result.addAll(H);
		result.addAll(R);
		
	}
	
}
