package opgave_1;

import java.util.*;

/**
 * Modeling a Swimmer
 */
public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private ArrayList<Double> lapTimes;
    private TrainingPlan tp;

    /**
     * Initialize a new swimmer with name, club, yearGroup, and lap times.
     */

    public Swimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.lapTimes = lapTimes;
        this.club = club;
    }

    /**
     * Return the name of the swimmer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the yearGroup of the swimmer
     */
    public int getYearGroup() {
        return this.yearGroup;
    }

    /**
     * Return the club of the swimmer
     */
    public String getClub() {
        return this.club;
    }

    /**
     * Register the club of the swimmer
     *
     * @param club
     */
    public void setClub(String club) {
        this.club = club;
    }

    /**
     * Return the fastest lap time
     */
    public double bestLapTime() {
        double bestLap = 10000.00;

        for (Double lapTime : lapTimes) {

            if (lapTime < bestLap) {
                bestLap = lapTime;
            }
        }
        return bestLap;
    }

    public void setTrainingPlan(TrainingPlan tp) {
        this.tp = tp;
    }

    public int getTrainingHours() {
        return tp.getWeeklyStrengthHours() + tp.getWeeklyWaterHours();
    }

}
