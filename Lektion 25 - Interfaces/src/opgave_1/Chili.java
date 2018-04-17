package opgave_1;

public class Chili implements Measurable {
    private String navn;
    private double scoville = 0.0;

    public Chili(String navn, double scoville) {
        this.navn = navn;
        this.scoville = scoville;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getScoville() {
        return scoville;
    }

    public void setScoville(double scoville) {
        this.scoville = scoville;
    }

    @Override
    public double getMeasure() {
        if (scoville < 1) {
            return 1;
        } else if (scoville > 2500000) {
            return 2500000;
        } else {
            return scoville;
        }
    }

}
