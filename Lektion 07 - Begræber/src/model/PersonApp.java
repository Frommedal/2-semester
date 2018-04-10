package model;

public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person("Morten", "Andersen", 24, 9, 1984);
        p.printPerson();
        System.out.println("Initialer: " + p.getInit());
        System.out.println("Username: " + p.getUserName());

        System.out.println("Age: " + p.age(9, 10, 2018));
        int year = 2000;
        System.out.println("Er " + year + " skudår: " + p.leapYear(year));

    }
}
