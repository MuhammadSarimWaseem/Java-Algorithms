// class Student {
//     String name; // name has the default value null
//     int age; // age has the default value 0
//     boolean isScienceMajor; // isScienceMajor has default value false
//     char gender; // gender has default value '\u0000'
// }

// public class Test {
//     public static void main(String[] args) {

//         Student student = new Student();
//         System.out.println("name? " + student.name);
//         System.out.println("age? " + student.age);
//         System.out.println("isScienceMajor? " + student.isScienceMajor);
//         System.out.println("gender? " + student.gender);
//     }
// // }
// class Test {
//     public static void main(String[] args) {
//     int x; // x has no default value
//     String y; // y has no default value
//      System.out.println("x is " + x);
//      System.out.println("y is " + y);
//      }
//     }


class CircleWithStaticMembers {
   /** The radius of the circle */
   double radius;

   /** The number of objects created */
   static int numberOfObjects = 0;

   /** Construct a circle with radius 1 */
   CircleWithStaticMembers() {
      radius = 1;
      numberOfObjects++;
   }

   /** Construct a circle with a specified radius */
   CircleWithStaticMembers(double newRadius) {
      radius = newRadius;
      numberOfObjects++;
   }

   /** Return numberOfObjects */
   static int getNumberOfObjects() {
      return numberOfObjects;
   }

   /** Return the area of this circle */
   double getArea() {
      return radius * radius * Math.PI;
   }
}

public class TestCircleWithStaticMembers {
   /** Main method */
   public static void main(String[] args) {
      System.out.println("Before creating objects");
      System.out.println("The number of Circle objects is " +
            CircleWithStaticMembers.numberOfObjects);

      // Create c1
      CircleWithStaticMembers c1 = new CircleWithStaticMembers();

      // Display c1 BEFORE c2 is created
      System.out.println("\nAfter creating c1");
      System.out.println("c1: radius (" + c1.radius +
            ") and number of Circle objects (" +
            c1.numberOfObjects + ")");

      // Create c2
      CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

      // Modify c1
      c1.radius = 9;

      // Display c1 and c2 AFTER c2 was created
      System.out.println("\nAfter creating c2 and modifying c1");
      System.out.println("c1: radius (" + c1.radius +
            ") and number of Circle objects (" +
            c1.numberOfObjects + ")");
      System.out.println("c2: radius (" + c2.radius +
            ") and number of Circle objects (" +
            c2.numberOfObjects + ")");
   }
}