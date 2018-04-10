package model;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Employee {
    /*
     * Attributter der beskriver den ansattes tilstand
     */
    private String name;
    private String lastname;
    private boolean trainee;
    private int age;

    /*
     * Constructor, når den ansatte oprettes, skal den have et navn. Ved oprettelse
     * er den ansatte en trainee
     */
    public Employee(String inputName, String inputLastName, int inputAge) {
        name = inputName;
        lastname = inputLastName;
        trainee = true;
        age = inputAge;
    }

    /*
     * Den ansattes navn kan ændres ved kald af setName metoden
     */
    public void setName(String inputName) {
        name = inputName;
    }

    /*
     * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
     */
    public String getName() {
        return name;
    }

    public void setLastname(String inputLastname) {
        lastname = inputLastname;
    }

    public String getLastname() {
        return lastname;
    }

    /*
     * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
     */
    public void setTrainee(boolean isTrainee) {
        trainee = isTrainee;
    }

    /*
     * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
     * isTrainee
     */
    public boolean isTrainee() {
        return trainee;
    }

    public void setAge(int inputAge) {
        age = inputAge;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age = age + 1;
    }

    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("Fornavn " + name);
        System.out.println("Efternavn " + lastname);
        System.out.println("Trainee " + trainee);
        System.out.println("Alder " + age);
    }
}
