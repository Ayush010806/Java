import java.util.*;
public class FactorialFunction {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("INVALID!");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
    
}
