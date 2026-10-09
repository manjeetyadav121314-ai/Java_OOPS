import java.util.Scanner;

public class StudentDeatails {
    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        Scanner sc = new Scanner(System.in);

        int rollNo;
        String name;
        int marks;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the roll number : ");
            rollNo = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter the name : ");
            name = sc.nextLine();

            System.out.print("Enter the marks : ");
            marks = sc.nextInt();

            s1[i] = new Student(rollNo, name, marks);
        }
        System.out.println("\n ---Student Details---");
        for (int i = 0; i < 5; i++) {
            s1[i].display();
            System.out.println();
        }
        sc.close();
    }
}

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Student marks : " + marks);
    }
}
