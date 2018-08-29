package opgave_3.src.fletning.copy;

import java.util.ArrayList;

public class FletteSorteringMedTODO {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int l, int m, int h) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> s1 = new ArrayList<Integer>(list.subList(l, m + 1));
		ArrayList<Integer> s2 = new ArrayList<Integer>(list.subList(m + 1, h + 1));
		
		int i1 = 0;
		int i2 = 0;
		// flet sålænge der er noget i begge lister
		while (i1 < s1.size() && i2 < s2.size()) {
			if (s1.get(i1).compareTo((s2.get(i2))) <= 0) {
		// s1's første tal er mindst
			temp.add(s1.get(i1));
			i1++;
			}
		else { // s2's første tal er mindst
			temp.add(s2.get(i2));
			i2++;
			}
		}
		// tøm den liste der ikke er tom
		while (i1 < s1.size()) {
			temp.add(s1.get(i1));
			i1++;
		}
		while (i2 < s2.size()) {
			temp.add(s2.get(i2));
			i2++;
		}
		
		for (int i = 0; i < temp.size(); i++) {
			list.set(l + i, temp.get(i));
		}
	}


}
