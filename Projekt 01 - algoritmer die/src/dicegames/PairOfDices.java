package dicegames;

/**
 * This class models one pair of dices. This is useful for games where you have
 * to throw two dice at once.
 */
public class PairOfDices {
    /**
     * The first die in the pair.
     */
    private Die die1;

    /**
     * The second die in the pair.
     */
    private Die die2;

    // private int counterRoll;
    private int counterEyes[];
    private int counterPair;
    private int biggestRoll;

    /**
     * Constructor for objects of class PairOfDices
     */
    // TODO: put the constructor here!
    // Remember, the constructor should initialize die1 and die2.
    public PairOfDices() {
        Die dice1 = new Die();
        this.die1 = dice1;
        Die dice2 = new Die();
        this.die2 = dice2;
        counterEyes = new int[6];
    }

    public PairOfDices(int sides) {
        Die dice1 = new Die(sides);
        this.die1 = dice1;
        Die dice2 = new Die(sides);
        this.die2 = dice2;
        counterEyes = new int[sides];
    }

    public void rollBothDices() {
        die1.roll();
        die2.roll();
        if (die1.getFaceValue() == die2.getFaceValue()) {
            counterPair++;
        }
        if (biggestRoll < sumOfDices()) {
            biggestRoll = sumOfDices();
        }

        counterEyes[die1.getFaceValue() - 1]++;
        counterEyes[die2.getFaceValue() - 1]++;

        // counterRoll++;
    }

    public int sumOfDices() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public int getEyeCounter(int eyes) {
        // return counterSixes;
        return counterEyes[eyes];
    }

    // public int getCounterRolls() {
    // return counterRoll;
    // }

    public int getCounterPairs() {
        return counterPair;
    }

    public int getBiggestRoll() {
        return biggestRoll;
    }

    public void resetPairOfDies() {
        die1 = new Die(die1.getSides());
        die2 = new Die(die2.getSides());
        // counterRoll = 0;
        counterEyes = new int[die1.getSides()];
        counterPair = 0;
        biggestRoll = 0;
    }

}
