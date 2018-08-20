package opgave_1;

public class P12_9 {
	public static int totalValue(int[] array, int index) {
		if(index== array.length-1) {
			return array[index];
		} else 
			return array[index] + totalValue(array, index +1);
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
        int total = totalValue(array, 0);
        System.out.println("The total value of the array is: " + total);
		}
	}
