import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {
            System.out.println("Number you entered is even!");
        } else {
            System.out.println("Number you entered is odd!");
        }
    }
}