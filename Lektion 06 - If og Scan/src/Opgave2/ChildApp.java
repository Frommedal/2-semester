package Opgave2;

public class ChildApp {

    public static void main(String[] args) {

        Child c1 = new Child(23, true);
        Child c2 = new Child(7, false);

        System.out.print("En " + c1.drengellerpige() + "på " + c1.getAge()); // skriver en samlet linie med 11 om det er
                                                                             // en dreng eller pige og
        System.out.println(", går i " + c1.institution()); // hvad de går i med den alder de har.

        System.out.print("En " + c2.drengellerpige() + "på " + c2.getAge());
        System.out.println(", går i " + c2.institution() + " Og denne " + c2.drengellerpige() + "går på " + c2.team());

    }

}
