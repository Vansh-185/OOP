import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("All Marks: " + marks);

        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));
    }
}
