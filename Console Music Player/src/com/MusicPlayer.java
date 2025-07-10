package com;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Song> allSongs = new ArrayList<>();
    private List<Playlist> playlists = new ArrayList<>();
    private int playlistCounter = 1;

    public void addSong(Song song) {
        allSongs.add(song);
        System.out.println("Song added to library.");
    }

    public void updateSong(String title, Song updatedSong) {
        for (Song song : allSongs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                song.setTitle(updatedSong.getTitle());
                song.setArtist(updatedSong.getArtist());
                song.setDuration(updatedSong.getDuration());
                System.out.println("Song updated.");
                return;
            }
        }
        System.out.println("Song not found.");
    }

    public void deleteSong(String title) {
        allSongs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
        System.out.println("Song deleted from library.");
    }

    public void displayAllSongs() {
        if (allSongs.isEmpty()) {
            System.out.println("No songs available.");
        } else {
            allSongs.forEach(System.out::println);
        }
    }

    public void createPlaylist(String playlistName) {
        playlists.add(new Playlist(playlistCounter++, playlistName));
        System.out.println("Playlist created: " + playlistName);
    }

    public Playlist getPlaylist(String name) {
        return playlists.stream()
                .filter(p -> p.getPlaylistName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }

    public void addSongToPlaylist(String playlistName, Song song) {
        Playlist p = getPlaylist(playlistName);
        if (p != null) {
            p.addSong(song);
        } else {
            System.out.println("Playlist not found.");
        }
    }

    public void deletePlaylist(String name) {
        playlists.removeIf(p -> p.getPlaylistName().equalsIgnoreCase(name));
        System.out.println("Playlist deleted.");
    }

    public void displayAllPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists found.");
        } else {
            playlists.forEach(p -> System.out.println(p.getPlaylistName()));
        }
    }

    public void playPlaylist(String name) {
        Playlist p = getPlaylist(name);
        if (p != null) {
            p.displaySongs();
        } else {
            System.out.println("Playlist not found.");
        }
    }

    public Song getSongByTitle(String title) {
        for (Song song : allSongs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }
}

