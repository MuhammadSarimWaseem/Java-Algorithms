// public class A {
//     boolean x;
//     public static void main(String[] args) {
//      A a = new A();
//      System.out.println(a.x);
//      }
//     }

public class A {
    private double radius = 1;

    /** Find the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        A myCircle = new A();
        System.out.println("Radius is " + myCircle.radius);
    }
}