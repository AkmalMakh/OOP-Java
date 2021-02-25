package com.company.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song>songs;
    private String name;
    private String artist;

    public Album(  String name, String artist) {
        this.songs = new ArrayList<Song>();
        this.name = name;
        this.artist = artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Song searchSong(String song){
        for(int i=0;i<songs.size();i++){
            Song song1 = songs.get(i);
            if(song1.getTitle().equals(song)){
                return song1;
            }
        }
        return null;
    }
    public boolean addSong(String name, double duration){
        if(searchSong(name) == null){
            this.songs.add(new Song(name,duration));
            return true;
        }
        return false;
    }
    public boolean addToplayList(String title, LinkedList<Song>playlist){
        Song song = searchSong(title);
        if(song !=null){
            playlist.add(song);
            return true;
        }
        System.out.println("This song "+title+" is not in this album");
        return false;
    }
    public boolean addToplayList(int trackNumber, LinkedList<Song>playlist){
        int index = trackNumber-1;
        if(index>0 && index<songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track  "+trackNumber);
        return false;
    }
}
