package com.company;

public class Song {
    private String name; private int seconds;

    public Song(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    public String getName() {
        return name;
    }

    public int getSeconds() {
        return seconds;
    }

    public void playSong(){
        System.out.println(" -Reproduciendo \""+name+"\".");
    }
}
