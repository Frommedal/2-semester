package Opgave_5;

public class Radiator {

    private int skruOp = 1; // skruer en grad op for radiatoren
    private int skruNed = -1; // skruer en grad ned for radiatoren
    private int startTemp = 0; // standard temperaturen sat til 0

    public Radiator(int startTemp) { // Giver startemperaturen til radiatoren
        setTemp(startTemp); // Tager vores setTemp i stedet for at lave en ny formel til at sætte starten.
    }

    public Radiator() { // sætter startværdien til 0 altid hvis ikke andet angivet
        setTemp(0);
    }

    public void skruop() { // får radiatoren til at skrue op med 1.
        startTemp += skruOp;
    }

    public void skruned() { // skruer ned for temperaturen med 1 grad.
        startTemp += skruNed;
    }

    public int getTemp() { // returnerer temperaturen i appen når sat i sysout.
        return this.startTemp;
    }

    public void fåtemp() { // BRUG IKKE DENNE I APPEN. giver temperaturen i appen uden at skulle skrive
                           // sysout. Radiator#.fåtemp()
        System.out.println(startTemp);
    }

    public void setTemp(int setTemp) { // sætter temperaturen. Bruges også til starttemperaturen.
        startTemp = setTemp;
    }

}
