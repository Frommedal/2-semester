package Opgave_P2_21;

public class Bug {
    private int movement = 1; // 1 = right - -1 = left.
    private int position;

    public Bug(int initialPosition) {
        this.position = initialPosition;
    }

    public void turn() {
        movement *= -1;
    }

    public void move() {
        position += movement;
    }

    public int getPosition() {
        return position;
    }
}
