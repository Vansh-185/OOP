import java.util.Scanner;

class Employee {
    String name;
    String department;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;

    void readManagerData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter manager name: ");
        name = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
        System.out.print("Enter team size: ");
        teamSize = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Employee Details:");
        e.readData();
        e.displayDetails();

        Manager m = new Manager();
        System.out.println("\nManager Details:");
        m.readManagerData();
        m.displayDetails();
    }
}
