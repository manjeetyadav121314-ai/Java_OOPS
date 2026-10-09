import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);

    public void square(int side) {
        int aria = side * side;
        System.out.println("Aria = " + aria);
    }

    public void square(int side, int x) {
        int perimeter = 4 * side;
        System.out.println("Perimeter = " + perimeter);
    }
}

public class Aria {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square : ");
        int side = sc.nextInt();

        System.out.print("Enter the x : ");
        int x = sc.nextInt();

        s1.square(side);
        s1.square(side, x);

        sc.close();
    }
}
