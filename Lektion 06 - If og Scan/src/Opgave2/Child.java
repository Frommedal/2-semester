package Opgave2;

/**
 * Write a description of class Barn here.
 */
public class Child {
    private int age;
    private boolean boy; // true if the child is a boy

    public Child(int age, boolean boy) {
        this.age = age;
        this.boy = boy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return boy;
    }

    public void setBoy(boolean boy) {
        this.boy = boy;
    }

    public String institution() {

        String result;

        if (age == 0) {
            result = "derhjemme";
        } else if (age > 0 && age < 3) {
            result = "dagpleje";
        } else if (age > 2 && age < 6) {
            result = "børnehave";
        } else if (age > 5 && age < 17) {
            result = "skole";
        } else {
            result = "Out of school";
        }
        return result;
    }

    public String drengellerpige() { // bruges til at skrive enten dreng eller pige alt efter om booleanen højere
                                     // oppe er sand eller falsk.
        String dellerp;

        if (boy == true) {
            dellerp = "dreng ";
        } else {
            dellerp = "pige ";
        }
        return dellerp.toString();
    }

    public String team() {

        String hold;

        if (age < 8 && boy == false) {
            hold = "Tumbling Girls";
        } else if (age >= 8 && boy == false) {
            hold = "Springy Girls";
        } else if (age < 8 && boy == true) {
            hold = "Young Cubs";
        } else {
            hold = "Cool Boys";
        }
        return hold.toString();
    }

}
