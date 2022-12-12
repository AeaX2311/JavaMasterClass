package com.company;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {
    private String name; private LinkedList<Song> playList = new LinkedList<>();;

    public PlayList(String name, Song song) {
        this.name = name;
        addSong(song);
    }
    public void addSong(Song song){
        if(playList.contains(song)){
            System.out.println("No se agrego la pista:");
            System.out.println("\tYa existe en lista de reproduccion.");
        }else{
            playList.add(song);
            System.out.println("Se agrego la pista correctamente.");
        }
    }
    public void printSongs(){
        int y=1;
        for(Song x:playList){
            System.out.println(y+"]- "+x.getName()+".");
            y++;
        }
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public ListIterator<Song> getIterator(){
        return (ListIterator<Song>) playList.iterator();
    }
    public LinkedList<Song> getPlayList() {
        return playList;
    }
}
