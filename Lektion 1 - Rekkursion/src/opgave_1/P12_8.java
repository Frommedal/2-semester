package opgave_1;

public class P12_8 {
	
	public static int findLargest(int[] array, int index) {
		if(index== array.length-1) {
			return array[index];
		} else 
			return Integer.max(findLargest(array, index+1), array[index]);
	}

	public static void main(String[] args) {
		int[] array = {3,6,2,7,4,2,8,11,3,12};
        int largest = findLargest(array, 1);
        System.out.println("Largest element in array is: " + largest);
		}
	}
