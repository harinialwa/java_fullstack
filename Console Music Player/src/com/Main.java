package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();
        int choice;
        do {
            System.out.println("\n========= MUSIC PLAYER MENU =========");
            System.out.println("1. Add New Song");
            System.out.println("2. Update Existing Song");
            System.out.println("3. Delete Song");
            System.out.println("4. Display All Songs");
            System.out.println("5. Create New Playlist");
            System.out.println("6. Add Song to Playlist");
            System.out.println("7. Display All Playlists");
            System.out.println("8. Display Songs in Playlist");
            System.out.println("9. Play Song in Playlist");
            System.out.println("10. Pause Song in Playlist");
            System.out.println("11. Stop Song in Playlist");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter duration: ");
                    double duration = sc.nextDouble();
                    sc.nextLine();
                    player.addSong(new Song(id, title, artist, duration));
                }
                case 2 -> {
                    System.out.print("Enter song title to update: ");
                    String oldTitle = sc.nextLine();
                    System.out.print("Enter new title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter new artist: ");
                    String newArtist = sc.nextLine();
                    System.out.print("Enter new duration: ");
                    double newDuration = sc.nextDouble();
                    sc.nextLine();
                    player.updateSong(oldTitle, new Song(0, newTitle, newArtist, newDuration));
                }
                case 3 -> {
                    System.out.print("Enter song title to delete: ");
                    String delTitle = sc.nextLine();
                    player.deleteSong(delTitle);
                }
                case 4 -> player.displayAllSongs();
                case 5 -> {
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    player.createPlaylist(plName);
                }
                case 6 -> {
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    System.out.print("Enter song title to add: ");
                    String title = sc.nextLine();
                    Song songToAdd = player.getSongByTitle(title);
                    if (songToAdd != null)
                        player.addSongToPlaylist(plName, songToAdd);
                    else
                        System.out.println("Song or playlist not found.");
                }
                case 7 -> player.displayAllPlaylists();
                case 8 -> {
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    Playlist pl = player.getPlaylist(plName);
                    if (pl != null) pl.displaySongs();
                    else System.out.println("Playlist not found.");
                }
                case 9 -> {
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    Playlist pl = player.getPlaylist(plName);
                    if (pl != null) {
                        System.out.print("Enter song title to play: ");
                        String title = sc.nextLine();
                        pl.play(title);
                    } else System.out.println("Playlist not found.");
                }
                case 10 -> {
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    Playlist pl = player.getPlaylist(plName);
                    if (pl != null) {
                        System.out.print("Enter song title to pause: ");
                        String title = sc.nextLine();
                        pl.pause(title);
                    }
                }
                case 11 -> {
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    Playlist pl = player.getPlaylist(plName);
                    if (pl != null) {
                        System.out.print("Enter song title to stop: ");
                        String title = sc.nextLine();
                        pl.stop(title);
                    }
                }
                case 12 -> System.out.println("Exiting Music Player...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 12);

        sc.close();
    }
}
