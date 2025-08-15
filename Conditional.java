//For Giving Greeting Press Button 1,2,3
import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button: ");
        int Button = sc.nextInt();

        /*if(Button == 1){
            System.out.println("Namaste");
        }else if(Button == 2){
                System.out.println("Hello");
        }else if(Button == 3){
                System.out.println("Bonjour");
        }else{
            System.out.println("INVALID");
        } */

        switch (Button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("INVALID");
            
        }
        }
    }
