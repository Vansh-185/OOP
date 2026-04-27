package student;

public class Student {
    public int rollNo;
    public String name;

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
