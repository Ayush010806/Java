import java.util.*;
public class Strings {
    public static void main(String[] args) {
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is :" + name);*/

        /* Concatenation: Joining two string*/
        /*String firstname = "Ayush";
        String lastname = "Ayush";
        String fullname = firstname + " " +lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        //Charat
        for(int i = 0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        } */
       String name1 = "Ayush";
       String name2 = "Ayush";
        //Compare
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }
    }
}
