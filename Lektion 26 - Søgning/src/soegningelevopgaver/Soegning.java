package soegningelevopgaver;

public class Soegning {

    public boolean findUlige(int[] tabel) {
        boolean found = false;
        int i = 0;

        while (!found && i < tabel[i]) {
            if (tabel[i] % 2 != 0) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

}// her skriver du metoder til opgaverne 2,3,5,6 og 7
