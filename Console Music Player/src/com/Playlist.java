package com;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Playable {
    private int playlistId;
    private String playlistName;
    private List<Song> songs;

    public Playlist(int playlistId, String playlistName) {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to playlist.");
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void removeSong(int songId) {
        songs.removeIf(song -> song.getSongId() == songId);
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            songs.forEach(System.out::println);
        }
    }

    @Override
    public void play(String title) {
        songs.stream().filter(s -> s.getTitle().equalsIgnoreCase(title))
              .findFirst().ifPresentOrElse(
                  s -> System.out.println("Playing: " + s),
                  () -> System.out.println("Song not found!")
              );
    }

    @Override
    public void play(int songId) {
        songs.stream().filter(s -> s.getSongId() == songId)
              .findFirst().ifPresentOrElse(
                  s -> System.out.println("Playing: " + s),
                  () -> System.out.println("Song not found!")
              );
    }

    @Override
    public void pause(String title) {
        System.out.println("Paused: " + title);
    }

    @Override
    public void pause(int songId) {
        System.out.println("Paused song ID: " + songId);
    }

    @Override
    public void stop(String title) {
        System.out.println("Stopped: " + title);
    }

    @Override
    public void stop(int songId) {
        System.out.println("Stopped song ID: " + songId);
    }
}

