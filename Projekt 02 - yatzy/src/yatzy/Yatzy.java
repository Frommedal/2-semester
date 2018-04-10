package yatzy;

import java.util.Random;

/**
 * Models a game of Yatzy.
 */
public class Yatzy {
    /**
     * Face values of the 5 dice. <br/>
     * 1 <= values[i] <= 6.
     */
    private int[] values = new int[5];

    /**
     * Number of times the 5 dice have been thrown. <br/>
     * 0 <= throwCount <= 3.
     */
    private int throwCount = 0;

    /**
     * Random number generator.
     */
    private Random random = new Random();

    /**
     * Rolls the 5 dice. <br/>
     * Only roll dice that are not hold. <br/>
     * Requires: holds contain 5 boolean values.
     */

    public void throwDice(boolean[] holds) {
        for (int i = 0; i < values.length; i++) {
            if (holds[i] == false) {
                values[i] = random.nextInt(6) + 1; // plusser med 1 fordi 0 er
                                                   // med i random
            }
        }
        throwCount++;

    }

    /**
     * Returns the number of times the five dice have been thrown.
     */
    public int getThrowCount() {
        return throwCount;
    }

    /**
     * Resets the throw count.
     */
    public void resetThrowCount() {
        throwCount = 0;
    }

    /**
     * Get current dice values
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Set the current dice values
     */
    public void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Returns all results possible with the current face values. <br/>
     * The order of the results is the same as on the score board.
     */
    public int[] getPossibleResults() {
        int[] results = new int[15];
        for (int i = 0; i <= 5; i++) {
            results[i] = valueSpecificFace(i + 1);
        }
        results[6] = valueOnePair();
        results[7] = valueTwoPair();
        results[8] = valueThree();
        results[9] = valueFour();
        results[10] = valueFullHouse();
        results[11] = valueSmallStraight();
        results[12] = valueLargeStraight();
        results[13] = valueChance();
        results[14] = valueYatzy();
        return results;
    }

    /**
     * Returns an int[7] containing the frequency of face values. <br/>
     * Frequency at index v is the number of dice with the face value v, 1 <= v <=
     * 6. <br/>
     * Index 0 is not used.
     */
    private int[] freqFaceValue() {
        int[] freq = new int[7];

        for (int i = 0; i < values.length; i++) {
            freq[values[i]]++;

        }
        return freq;
    }

    /**
     * Returns the total value for the dice currently showing the given face value
     * 
     * @param face
     *            the face value to return values for
     */
    public int valueSpecificFace(int face) {
        int value = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == face) {
                value = value + face;
            }

        }
        return value;
    }

    /**
     * Returns the maximum value for n-of-a-kind for the given n. <br/>
     * For example, valueManyOfAKind(3) returns the maximum value for 3 of-a-kind.
     * <br/>
     * Requires: 1 <= faceValue and faceValue <= 6
     * 
     * @param n
     *            number of kind
     */
    public int valueManyOfAKind(int n) {
        int value = 0;
        for (int i = 0; i < freqFaceValue().length; i++) {
            if (freqFaceValue()[i] >= n) {
                if (freqFaceValue()[i] * i > value) {
                    value = i * n;
                }
            }
        }
        return value;
    }

    /**
     * The current value if you try to score the current face values as Yatzy.
     */
    public int valueYatzy() {
        int value = 0;
        for (int i = 0; i < freqFaceValue().length; i++) {
            if (freqFaceValue()[i] == 5) {
                value = 50;
            }
        }
        return value;
    }

    /**
     * Returns the current score if used as "chance".
     */
    public int valueChance() {
        int value = 0;
        for (int i = 0; i < values.length; i++) {
            value = value + values[i];
        }
        return value;
    }

    /**
     * Returns the current score for one pair.
     */
    public int valueOnePair() {
        return valueManyOfAKind(2);
    }

    /**
     * Returns the current score for two pairs.
     */
    public int valueTwoPair() {
        int[] freq = freqFaceValue();
        int pair1 = 0;
        int pair2 = 0;

        // K�rer modsat for at vi f�r det h�jeste par
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] >= 2) {
                if (pair1 > 0) {
                    pair2 = i * 2;

                } else {
                    pair1 = i * 2;
                }
            }

        }
        return pair1 + pair2;
    }

    /**
     * Returns the current score for three of a kind.
     */
    public int valueThree() {
        return valueManyOfAKind(3);
    }

    /**
     * Returns the current score for four of a kind.
     */
    public int valueFour() {
        return valueManyOfAKind(4);
    }

    /**
     * Returns the value of a small straight with the current face values.
     */
    public int valueSmallStraight() {
        for (int i = 1; i < freqFaceValue().length - 1; i++) {
            if (freqFaceValue()[i] != 1) {
                return 0;
            }
        }

        return 15;
    }

    /**
     * Returns the value of a large straight with the current face values.
     */
    public int valueLargeStraight() {
        for (int i = 2; i < freqFaceValue().length - 1; i++) {
            if (freqFaceValue()[i] != 1) {
                return 0;
            }
        }

        return 20;
    }

    /**
     * Returns the value of a full house with the current face values.
     */
    public int valueFullHouse() {
        int value = 0;
        int value2 = 0;
        int value3 = 0;
        for (int i = 1; i < freqFaceValue().length; i++) {
            if (freqFaceValue()[i] == 2) {
                value2 = (i * 2);
            }
            if (freqFaceValue()[i] == 3) {
                value3 = (i * 3);
            }
        }
        if (value2 != 0 && value3 != 0) {
            value = value2 + value3;
        }
        return value;
    }

}
