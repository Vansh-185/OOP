import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter song " + i + ": ");
            playlist.add(sc.nextLine());
        }

        System.out.println("Playlist: " + playlist);

        if (!playlist.isEmpty()) {
            String first = playlist.removeFirst();
            System.out.println("Playing: " + first);
            System.out.println("Playlist after playing first song: " + playlist);
        }

        if (!playlist.isEmpty()) {
            String last = playlist.removeLast();
            System.out.println("Skipped: " + last);
            System.out.println("Playlist after skipping last song: " + playlist);
        }
    }
}
