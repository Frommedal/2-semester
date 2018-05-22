package adminsystem;

public class Deltagelse {

    private static boolean afbud;
    private String begrundelse;

    public Deltagelse(Boolean afbud, String begrundelse) {
        setAfbud(false);
        this.begrundelse = begrundelse;
    }

    public String getBegrundelse() {
        return begrundelse;
    }

    public void setBegrundelse(String begrundelse) {
        this.begrundelse = begrundelse;
    }

    public static boolean isAfbud() {
        return afbud;
    }

    public void setAfbud(boolean afbud) {
        Deltagelse.afbud = afbud;

    }
}
