package Opgave_3_Team;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void printPlayers() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Navn:   " + players.get(i).getName());
            System.out.println("Alder:  " + players.get(i).getAge());
            System.out.println("Score:  " + players.get(i).getScore());
            System.out.print("\r");
        }
    }

    public double calcAverageAge() {
        double snit = 0.0;

        for (int i = 0; i < players.size(); i++) {

            snit = snit + players.get(i).getAge();

        }
        return snit / players.size();

    }

    public int calcTotalScore() {
        int score = 0;

        for (int i = 0; i < players.size(); i++) {

            score = score + players.get(i).getScore();

        }
        return score;

    }

    public int calcOldPlayersScore(int ageLimit) {
        int score = 0;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getAge() > ageLimit) {
                score = score + players.get(i).getScore() + score;
            }
        }

        return score;
    }

    public int maxScore() {
        int maxscore = 0;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getScore() > maxscore) {
                maxscore = players.get(i).getScore();
            }
        }
        return maxscore;
    }

    public String bestPlayer() {
        int maxscore = 0;
        String bedstespiller = "";

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getScore() > maxscore) {
                maxscore = players.get(i).getScore();
                bedstespiller = players.get(i).getName();

            }

        }
        return bedstespiller;
    }
}
