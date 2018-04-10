package arrays;

public class ArrayMethods {

    public int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public int[] createSum(int[] a, int[] b) {

        int[] array = new int[a.length];
        for (int i = 0; i < array.length; i++) {

            array[i] = a[i] + b[i];
        }
        return array;
    }
}