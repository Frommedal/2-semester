package Opgave_1;

import java.util.ArrayList;

public class ArrayListApp {

    public static void main(String[] args) {

        ArrayList<String> navne = new ArrayList<>();

        navne.add("Hans");
        navne.add("Viggo");
        navne.add("Jens");
        navne.add("Børge");
        navne.add("Bent");

        System.out.println(navne.size());

        navne.add(2, "Jane");
        System.out.println(navne);
        navne.remove(1);
        System.out.println(navne);
        navne.add(0, "Pia");
        navne.add("Ib");

        System.out.println(navne.size());

        navne.set(2, "Hansi");

        System.out.println(navne.size());
        System.out.println(navne);

        for (int i = 0; i < navne.size(); i++) {
            System.out.print(navne.get(i).length() + " ");
        }

        System.out.print("\r");

        for (String s : navne) {
            System.out.print(s.length() + " ");

        }
    }

}
