package com.company;
import java.util.ArrayList;

public class Album {
    private String name;// private ArrayList<Song> songs = new ArrayList<>();
    private SongList songList;

    public Album(String name, Song song) {
        this.name = name;
        songList= new SongList();
        addSong(song);
    }

    public void addSong(Song song){
        songList.addSongToSL(song);
        System.out.println("A new song was added to the album:"+ name);
    }

    public Song getSong(int position){
        if(position>0)
            return songList.getSongToSL(position);
        else
            System.out.println("There is no such position.");
        return new Song("---",0);
    }

    public void viewSongs(){
        int y=1;
        for (Song x: songList.songs) {
            System.out.println(y+"- "+x.getName());
            y++;
        }
    }

    public String getName() {
        return name;
    }

    private class SongList{
        private ArrayList<Song> songs = new ArrayList<>();
        public SongList(){
            System.out.println("SongList class called.");
        }
        public void addSongToSL(Song song){
            songs.add(song);
        }
        public Song getSongToSL(int position){
            return songs.get(position-1);
        }
    }
}
