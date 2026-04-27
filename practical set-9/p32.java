import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> rollList = new LinkedList<>();
        System.out.print("Enter number of roll numbers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            rollList.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();
        System.out.println("Found: " + searchElement(rollList, searchRoll));

        sc.nextLine();

        LinkedList<String> nameList = new LinkedList<>();
        System.out.print("Enter number of names: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.print("Enter name: ");
            nameList.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();
        System.out.println("Found: " + searchElement(nameList, searchName));
    }
}
