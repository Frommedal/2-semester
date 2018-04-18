package opgave_4;

import java.util.ArrayList;

public class Spillermetoder {
    public Spiller findScoreLinier(ArrayList<Spiller> spillere, int score) {
        boolean found = false;
        int i = 0;
        Spiller spiller = null;

        while (!found && i < spillere.size()) {
            if (spillere.get(i).getMaal() == score) {
                spiller = spillere.get(i);
                found = true;
            } else {
                i++;
            }

        }
        if (found) {
            return spiller;

        } else {
            return null;
        }
    }

    public Spiller findScoreBinær(ArrayList<Spiller> spillere, int score) {
        boolean found = false;
        int left = 0;
        int right = spillere.size() - 1;
        int middle = 0;
        Spiller spiller = null;

        while (!found && left <= right) {
            middle = (left + right) / 2;
            int k = spillere.get(middle).getMaal();
            if (k == score) {
                spiller = spillere.get(middle);
                found = true;
            } else if (k < score) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (found) {
            return spiller;
        } else {
            return null;
        }
    }

    public ArrayList<Spiller> sortSpillere(ArrayList<Spiller> spillerne) {
        ArrayList<Spiller> spillere = new ArrayList<>(spillerne);
        boolean sorted = false;
        boolean sortOnce = false;
        int i = 0;
        Spiller spiller = null;
        while (!sorted) {
            while (i < spillere.size() - 1 && !sortOnce) {
                if (spillere.get(i).getMaal() > spillere.get(i + 1).getMaal()) {
                    spiller = spillere.get(i);
                    spillere.set(i, spillere.get(i + 1));
                    spillere.set(i + 1, spiller);
                    i++;
                    sortOnce = true;
                } else {
                    i++;
                }
            }
            if (sortOnce) {
                i = 0;
                sortOnce = false;
            } else if (i == spillere.size() - 1 && !sortOnce) {
                sorted = true;
            }

        }
        return spillere;
    }

    public ArrayList<Spiller> sortSpillereDescending(ArrayList<Spiller> spillerne) {
        ArrayList<Spiller> spillere = new ArrayList<>(spillerne);
        boolean sorted = false;
        boolean sortOnce = false;
        int i = spillere.size() - 1;
        Spiller spiller = null;
        while (!sorted) {
            while (i > 0 && !sortOnce) {
                if (spillere.get(i).getMaal() > spillere.get(i - 1).getMaal()) {
                    spiller = spillere.get(i);
                    spillere.set(i, spillere.get(i - 1));
                    spillere.set(i - 1, spiller);
                    i--;
                    sortOnce = true;
                } else {
                    i--;
                }
            }
            if (sortOnce) {
                i = spillere.size() - 1;
                sortOnce = false;
            } else if (i == 0 && !sortOnce) {
                sorted = true;
            }

        }
        return spillere;
    }

    public ArrayList<Spiller> godSpiller(ArrayList<Spiller> spillere) {
        ArrayList<Spiller> spillereNy = new ArrayList<>();
        boolean found = false;
        boolean found2 = false;
        int i = 0;

        while (!found) {
            while (i < spillere.size()) {
                if (spillere.get(i).getMaal() >= 50 && spillere.get(i).getHoejde() <= 170) {
                    // spiller = spillere.get(i);
                    spillereNy.add(spillere.get(i));
                    i++;
                    found2 = true;
                } else {
                    i++;
                }
            }
            if (found2) {
                found2 = false;
            } else if (i == spillere.size() && !found2) {
                found = true;
            }
        }
        return spillereNy;
    }
}

// Her tilføjes metoder der løser opgve 4.2 og 4.3
