package opgave_4;

public class Person {
    private String name;
    private boolean boy;

    public Person(String name, String titel, boolean senior) {
        this.name = name;
        this.boy = senior;
    }

    @Override
    public String toString() {
        String s = "" + name;
        if (boy) {
            s = s + " (senior)";
        }
        return s;
    }
}
