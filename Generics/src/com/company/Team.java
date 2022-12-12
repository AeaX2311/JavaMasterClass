package com.company;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name; private int score; private ArrayList<T> players;

    public Team(String name, int score) {
        this.name = name;
        this.score=score;
        players=new ArrayList<>();
    }

    public void addPlayer(T player){
        if(players.contains(player)){
            System.out.println("Ya contiene este jugador");
            return;
        }

        players.add(player);
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.score > o.getScore())
            return -1;
        else if(this.score<o.getScore())
            return 1;
        return 0;
    }
}
