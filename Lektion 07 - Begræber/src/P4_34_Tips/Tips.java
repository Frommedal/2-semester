package P4_34_Tips;

public class Tips {

    private double total;
    private double tip;

    public Tips(double total, int sat) {
        this.total = total;
        this.tip = 0;

        String result;

        if (sat == 1) {
            tip = this.total * 0.2;
            result = "Totally satisfied";
        } else if (sat == 2) {
            tip = this.total * 0.15;
            result = "medium saitsfied";
        } else {
            tip = this.total * 0.1;
            result = "not so satisfied";
        }
        System.out.println(result);
        System.out.println("You should tip: " + this.tip + "DKK");
    }
}