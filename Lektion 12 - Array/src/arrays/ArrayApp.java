package arrays;

public class ArrayApp {

    public static void main(String[] args) {

        ArrayMethods methods = new ArrayMethods();
        int[] array = { 5, 7, 6 };
        methods.sum(array);
        System.out.println(methods.sum(array));

        int[] alexarray = { 1, 3, 7, 6, 5 };

        System.out.println(methods.sum(alexarray));

        int[] a = { 1, 1, 1, 1 };
        int[] b = { 2, 2, 2, 2 };
        int[] array1 = methods.createSum(a, b).clone();
        for (int i = 0; i < a.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
