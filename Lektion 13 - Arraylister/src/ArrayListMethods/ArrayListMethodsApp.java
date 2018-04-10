package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethodsApp {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(35);
        list.add(14);
        list.add(7);
        list.add(0);

        ArrayListMethods methods = new ArrayListMethods();

        System.out.println(list);
        System.out.println("Summen af tallene i listen (med for): " + methods.sumListeFor(list));
        System.out.println("Summen af tallene i listen (med forEach): " + methods.sumListeForEach(list));
        System.out.println("Indeks for det første lige tal: " + methods.hasEvenAtIndex(list));
        System.out.println("Det mindste tal er: " + methods.min(list)); // Opgave 2.A
        System.out.println("Gennemsnittet for alle summer er: " + methods.gennemsnit(list)); // Opgave 2.B
        System.out.println("Antaller af nuller i listen er: " + methods.antalNuller(list)); // Opgave 2.C
        System.out.println(methods.enLigeListe(list)); // Opgave 2.E
        methods.erstatLigeMedNul(list); // Opgave 2.D
        System.out.println(list); // Opgave 2.D

    }
}
