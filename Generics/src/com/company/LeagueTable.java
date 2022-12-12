package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable <T extends Team> {
    private String name; private ArrayList<T> league;

    public LeagueTable(String name) {
        league=new ArrayList<>();
        this.name = name;
    }

    public void printTable(){
        int y=1; Collections.sort(league);
        for(T x:league) {
            System.out.println(y + "- " + x.getName() + " | Score: "+x.getScore());
            y++;
        }
    }

    public void addTeam(T team){
        if(league.contains(team)){
            System.out.println("Ya contiene este equipo");
            return;
        }

        league.add(team);
    }

    public String getName() {
        return name;
    }
}
