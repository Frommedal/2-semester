package Opgave_2;

public class Opgave_2 {
    public static void main(String[] arg) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";
        String ord3 = ord1 + " " + ord2.toLowerCase();
        String ord4 = ord1 + ord2.toLowerCase();

        System.out.println(ord1.toUpperCase());
        System.out.println(ord2.toLowerCase());
        System.out.println(ord1 + " " + ord2);
        System.out.println(ord3);
        System.out.println(ord3.length());
        System.out.println(ord1.substring(0, 7));
        System.out.println(ord2.substring(2, 7));
        System.out.println(ord4.substring(ord4.length() / 2));
        System.out.println(ord4.substring(0, 1) + ord3.substring(0, 1));
    }
}
