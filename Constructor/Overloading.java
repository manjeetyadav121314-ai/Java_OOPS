
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
        System.out.println(rollNo + " " + name + " " + marks);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Manjeet", 121);

        s1.display();
    }
}