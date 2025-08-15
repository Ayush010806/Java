//To take input from user and do addition,substraction,and so on
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter Value of b: ");
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("The sum of a and b is : " + sum);
    }
    
}
