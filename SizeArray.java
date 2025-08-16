// After declaring varibles it default stores value to zero
//Like for int 0; float 0.0; boolean false; String ""; For array it will store every block by 0;

import java.util.*;
public class SizeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Arrays Size: ");
        int size = sc.nextInt();

        int Number[] = new int[size];

        //Input
        for(int i = 0; i<size; i++){
            System.out.print("Enter Number to store in array: ");
            Number[i] = sc.nextInt();
        }

        //Output
        for(int i = 0; i<size; i++){
            System.out.print("The Numbers stored in " + Number[i] +" array is:");
            System.out.println(Number[i]);
        }
    }
    
}
