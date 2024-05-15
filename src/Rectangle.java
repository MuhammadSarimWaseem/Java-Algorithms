public class Rectangle {
    public static void main(String[] args) {
        InnerRectangle getarea = new InnerRectangle(3, 5);
        System.out.println(getarea.area());
        InnerRectangle getarea2 = new InnerRectangle(2, 5);
        System.out.println(getarea2.area());

    }

}

class InnerRectangle {

    private double length;
    private double width;

    double area() {
        double area = length * width;
        return area;
    }

    InnerRectangle() {
    }

    InnerRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}
