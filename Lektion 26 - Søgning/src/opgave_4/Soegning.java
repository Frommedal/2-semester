package opgave_4;

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

    public int numeroUno(int[] tabel) {
        boolean found = false;
        int i = 0;
        while (!found && i < tabel.length) {
            if (tabel[i] >= 10 && tabel[i] < 16) {
                found = true;
            } else {
                i++;
            }
        }
        if (found) {
            return tabel[i];
        } else {
            return -1;

        }
    }

    public int findToVenner(int[] tabel) {
        boolean found = false;
        int i = 0;

        while (!found && i < tabel.length) {
            if (tabel[i] == tabel[i + 1]) {
                found = true;
            } else {
                i++;
            }
        }
        return tabel[i];
    }

}// her skriver du metoder til opgaverne 2,3,5,6 og 7
