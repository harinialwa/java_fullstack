package com;

public class Song {
    private final int songId;
    private String title;
    private String artist;
    private double duration;

    public Song(int songId, String title, String artist, double duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public int getSongId() { return songId; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }

    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setDuration(double duration) { this.duration = duration; }

    @Override
    public String toString() {
        return "ID: " + songId + ", Title: " + title + ", Artist: " + artist + ", Duration: " + duration + " mins";
    }
}
