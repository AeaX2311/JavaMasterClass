package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("FP1");FootballPlayer footballPlayer2 = new FootballPlayer("FP2");
        FootballPlayer footballPlayer3 = new FootballPlayer("FP3");FootballPlayer footballPlayer4 = new FootballPlayer("FP4");
        
        BascketballPlayer basketballPlayer1 = new BascketballPlayer("BP1");BascketballPlayer basketballPlayer2 = new BascketballPlayer("BP2");
        BascketballPlayer basketballPlayer3 = new BascketballPlayer("BP3");BascketballPlayer basketballPlayer4 = new BascketballPlayer("BP4");
        
        Team<FootballPlayer> footballTeam1=new Team<>("Equipo Futbol 1",5);
        footballTeam1.addPlayer(footballPlayer1);
        footballTeam1.addPlayer(footballPlayer2);

        Team<FootballPlayer> footballTeam2=new Team<>("Equipo futbol 2",10);
        footballTeam2.addPlayer(footballPlayer3);
        footballTeam2.addPlayer(footballPlayer4);

        Team<BascketballPlayer> basketballTeam1=new Team<>("Equipo Futbol 1",5);
        basketballTeam1.addPlayer(basketballPlayer1);
        basketballTeam1.addPlayer(basketballPlayer2);

        Team<BascketballPlayer> basketballTeam2=new Team<>("Equipo futbol 2",10);
        basketballTeam2.addPlayer(basketballPlayer3);
        basketballTeam2.addPlayer(basketballPlayer4);

        LeagueTable<Team<FootballPlayer>> americanLeagueF= new LeagueTable<>("Liga americana futbol");
        americanLeagueF.addTeam(footballTeam1);
        americanLeagueF.addTeam(footballTeam2);

        LeagueTable<Team<BascketballPlayer>> americanLeagueB =new LeagueTable<>("Liga amercana bascketbol");
        americanLeagueB.addTeam(basketballTeam1);
        americanLeagueB.addTeam(basketballTeam2);

        americanLeagueF.printTable();
        americanLeagueB.printTable();
        
    }
}

