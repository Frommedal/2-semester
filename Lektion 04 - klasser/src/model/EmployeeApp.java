package model;

/*
 * Anvendelses program der opretter Employee objekter og anvender metoder på disse
 */
public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Hans", "Jensen", 30);
        e1.setName("Viggo");
        e1.printEmployee();

        Employee purr = new Employee("Per", "B", 46);
        purr.setName(e1.getName());
        purr.printEmployee();

        Employee effie = new Employee("Effie", "Baleffi", 20);
        effie.setAge(21);
        effie.printEmployee();

        Employee e23 = new Employee("Per", "Glad", 72);
        e23.birthday();
        e23.printEmployee();

    }

}
