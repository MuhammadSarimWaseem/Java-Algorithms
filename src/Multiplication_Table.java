import java.util.*;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            int table = num * i;
            System.out.println(num + " X " + i + " = " + table);
        }
    }
}
