abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); // Calls draw method of Circle class
    }
}