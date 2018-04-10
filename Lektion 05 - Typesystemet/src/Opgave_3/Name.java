package Opgave_3;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    // sætter et fornavn
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // returnere fornavnet
    public String getFirstName() {
        return firstName;
    }

    // sætter et mellemnavn
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // returnerer mellemnavnet
    public String getMiddleName() {
        return middleName;
    }

    // sætter et efternavn
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // returnere efternavnet
    public String getLastName() {
        return lastName;
    }

    // Skulle gerne returnere initialerne fra de 3 navne.
    public String getInit() {
        return firstName.substring(0, 1) + middleName.substring(0, 1) + lastName.substring(0, 1);
    }

    public String getUsername() {
        return firstName.toUpperCase().substring(0, 2) + middleName.length()
                + lastName.toLowerCase().substring(lastName.length() - 2);

    }

    public void printName() {
        System.out.println("Fornavn:\t" + firstName);
        System.out.println("Mellemnavn:\t" + middleName);
        System.out.println("Efternavn:\t" + lastName);
        System.out.println("Fulde navn:\t" + firstName + " " + middleName + " " + lastName);
        System.out.println("");
        System.out.println("Initialer\t" + getInit());
        System.out.println("Username:\t" + getUsername());
    }
}
