// To take a input from user and search for imput and print that index
import java.util.*;
public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter Number to insert:");
            number[i] = sc.nextInt();
    }
    System.out.print("Enter the value to to print that numbers index:");
    int x = sc.nextInt();

    for(int i = 0; i < number.length; i++){
        if(number[i] == x){
            System.out.println("x is found at index :" + i);
        }
    }
    
}

}