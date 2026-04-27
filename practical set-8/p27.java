import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);

        try {
            fw = new FileWriter("students.txt");

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter roll no: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                fw.write(roll + " " + name + " " + marks + "\n");
            }

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("\nStudent Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error");
        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
