
class Pen {
    String color;
    String type;

    public void printContext() {
        System.out.println("Print your details");
    }

    public void printInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void studentDetails() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }
}

public class practice {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "bollpoint";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "gel";

        // pen1.printContext();
        // pen2.printInfo();
        // pen1.printInfo();

        Student s1 = new Student();
        s1.name = "Manjeet yadav";
        s1.age = 22;

        s1.studentDetails();

    }
}
