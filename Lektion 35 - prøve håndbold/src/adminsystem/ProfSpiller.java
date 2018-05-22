package adminsystem;

public class ProfSpiller extends Spiller {

    private double kampHonorar;

    public ProfSpiller(String navn, int årgang, double kampHonorar) {
        super(navn, årgang);
        this.kampHonorar = kampHonorar;
    }

    public double getKampHonorar() {
        return kampHonorar;
    }

    public void setKampHonorar(double kampHonorar) {
        this.kampHonorar = kampHonorar;
    }

    // public double kampHonorar(ProfSpiller profspiller) {
    // int deltagelser = 0;
    //
    // for (int i = 0; i < array.length; i++) {
    // if (!Deltagelse.isAfbud()) {
    // deltagelser++;
    // }
    //
    // }
}
// }
