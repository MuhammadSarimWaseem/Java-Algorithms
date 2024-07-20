// public class Test {
//     public static void main(String[] args) {
//         new A();
//         new B();
//     }
// }

// class  A {
//     int i = 7;

//     public  A() {
//         setI(20);
//         System.out.println("i from A is " + i);
//     }

//     public void setI(int i) {
//         this.i = 2 * i;
//     }
// }

// class B extends A {
//     public B() {
//         System.out.println("i from B is " + i);
//     }

//     public void setI(int i) {
//         this.i = 3 * i;
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Object fruit = new Fruit();
//         Object apple = (Apple) fruit;
//     }
// }

// class Apple extends Fruit {
//     void X(){
//         System.out.println("X");

//     }
// }

// class Fruit {
//     void X(){
//         System.out.println("Y");

//     }
// }

// public class Test {
//     private String text;

//     public Test(String s) {
//         this.text = s;
//         // String text =s;
//     }

//     public static void main(String[] args) {
//         Test test = new Test("ABC");
//         System.out.println(test.text.toLowerCase());
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         As a = new As();
//         a.p(10);
//         a.p(10.0);
//     }
// }

// class Bs {
//     public void p(double i) {
//         System.out.println(i * 2);
//     }
// }

// class As extends Bs {
//     // This method overrides the method in B
//     public void p(double i) {
//         System.out.println(i);
//     }
// }