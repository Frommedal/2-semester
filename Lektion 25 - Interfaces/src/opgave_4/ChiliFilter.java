package opgave_4;

public class ChiliFilter implements Filter {

    @Override
    public boolean accept(Measurable x) {
        if (x.getMeasure() >= 10000) {
            return true;
        }
        return false;
    }

}
