package opgave_3;

import java.lang.reflect.Array;

public class Opgave_3 {

	public static double[] prefixAverage(int[] inputTal) {
		
		double[] results = new double[inputTal.length];
		double sum = 0.0;
		
		for (int i = 0; i < inputTal.length; i++) {
			sum = sum + inputTal[i];
			results[i] = sum / (i+1);
		}
		
		return results;
}
}
