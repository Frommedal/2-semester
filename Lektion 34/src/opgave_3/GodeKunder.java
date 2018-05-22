package opgave_3;

import java.util.ArrayList;
import java.util.Collections;

import opgave_3.Customer;

public class GodeKunder {

    public static void main(String[] args) {

        Customer c1 = new Customer("Andersen", "Søren", 18);
        Customer c2 = new Customer("Mikkelsen", "Flemse", 42);
        Customer c3 = new Customer("Eriksen", "Henning", 53);
        Customer c4 = new Customer("Holm", "Mathias", 28);

        ArrayList<Customer> s1 = new ArrayList<>();
        Customer[] s2 = { c1 };

        s1.add(0, c1);
        s1.add(1, c3);
        s1.add(2, c4);
        s1.add(3, c2);

        // Collections.sort(s1); // stod der i opgaven, men jeg har sorteret manuelt.
        System.out.println(goodCustomers(s1, s2));
    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle customers fra l1 der
     * ikke er i l2 Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> s1, Customer[] s2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < s1.size() && i2 < s2.length) {
            if (s1.get(i1).compareTo(s2[i2]) < 0) {
                result.add(s1.get(i1));
                i1++;
            } else if (s2[i2].compareTo(s2[i2]) > 0) {
                i2++;
            } else {
                i1++;
                i2++;
            }
        }
        while (i1 < s1.size()) {
            result.add(s1.get(i1));
            i1++;
        }
        return result;
    }

}
