package Opgave_3_Team;

public class TeamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Player p1 = new Player("Morten", 24);
        Player p2 = new Player("Alex", 22);
        Player p3 = new Player("Peter", 22);
        Player p4 = new Player("Martin", 30);
        Player p5 = new Player("Michael", 20);

        Team t1 = new Team("dreamTeam");
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        t1.addPlayer(p5);

        p1.addScore(20);
        p2.addScore(22);
        p3.addScore(30);
        p4.addScore(17);
        p5.addScore(11);

        t1.printPlayers();
        System.out.println("Gennemsnitsalderen er:   " + t1.calcAverageAge());
        System.out.println("Teamets totale score er: " + t1.calcTotalScore());
        System.out.println("De gamles score er:      " + t1.calcOldPlayersScore(25));
        System.out.println("Den individuelle højeste score er: " + t1.maxScore());
        System.out.println("Den bedste spiller er:             " + t1.bestPlayer());
    }

}
