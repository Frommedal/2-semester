package opgave_3;

public class Opgave_3_App {
	public static void main(String[] args) {
		int[] input = {5,10,5,6,4,9,8};
		double[] result = Opgave_3.prefixAverage(input);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(String.format("%.4g", result[i]));
			
		}
		
	}
}
