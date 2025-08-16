import java.util.*;
public class FunctionAdd{
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println(sum);
    }
    
}
