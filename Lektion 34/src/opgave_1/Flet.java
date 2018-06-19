package opgave_1;

import java.util.ArrayList;
import opgave_1.Customer;

public class Flet {

    public static void main(String[] args) {

        Customer c1 = new Customer("Andersen", "Søren", 18);
        Customer c2 = new Customer("Mikkelsen", "Flemse", 42);
        Customer c3 = new Customer("Eriksen", "Henning", 53);
        Customer c4 = new Customer("Holm", "Mathias", 28);

        ArrayList<Customer> s1 = new ArrayList<>();
        ArrayList<Customer> s2 = new ArrayList<>();

        s1.add(0, c1);
        s1.add(1, c4);
        s2.add(0, c2);
        s2.add(0, c3);

        // System.out.println(s1);
        // System.out.println(s2);
        System.out.println(fletterier(s1, s2));
    }

    public static ArrayList<Customer> fletterier(ArrayList<Customer> s1, ArrayList<Customer> s2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        int r1 = 0; // behøver måske ikke at være.

        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1).compareTo(s2.get(i2)) <= 0) {
                result.add(r1, s1.get(i1));
                i1++;
                r1++;
            } else {
                result.add(r1, s2.get(i2));
                i2++;
                r1++;
            }

        }

        while (i1 < s1.size()) {
            result.add(r1, s1.get(i1));
            i1++;
            r1++;
        }
        while (i2 < s2.size()) {
            result.add(r1, s2.get(i2));
            i2++;
            r1++;
        }
        return result;
    }
}
