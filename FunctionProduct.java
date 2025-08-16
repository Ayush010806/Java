// This code is for direct return value
import java.util.*;
public class FunctionProduct {
    public static int calculateProduct(int a, int b){
        return a*b;//Directly return our value
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        System.out.println("The product if A and B is: " + calculateProduct(a, b));
    }
}
