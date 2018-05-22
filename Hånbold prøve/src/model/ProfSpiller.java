package model;

public class ProfSpiller extends Spiller {

    private double kampHonorar;

    public ProfSpiller(String navn, int aargang, double kampHonorar) {
        super(navn, aargang);
        this.kampHonorar = kampHonorar;
    }

    public double getKampHonorar() {
        return kampHonorar;
    }

    public void setKampHonorar(double kampHonorar) {
        this.kampHonorar = kampHonorar;
    }

    // opgave s3.
    @Override
    public double getHonorar() {
        int afbud = 0;
        for (Deltagelse i : deltagelser) {
            if (i.isAfbud()) {
                afbud++;
            }
        }
        return kampHonorar * (1 - (afbud / deltagelser.size()));
    }

}
