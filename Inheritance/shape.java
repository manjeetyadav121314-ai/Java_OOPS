
class Shape {
    public void colour() {
        System.out.println("colour is black");
    }
}

class Triangle extends Shape {
    public void type() {
        System.out.println("Triangle");
    }
}

class MultiTriangle extends Triangle {
    void triangle() {
        System.out.println("this shpe is triangle");
    }
}

public class shape {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        MultiTriangle t2 = new MultiTriangle();
        t1.colour();
        t2.type();
        t2.triangle();

    }
}
