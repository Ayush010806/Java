import java.util.*;

public class NewStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ayush");
        System.out.println(sb);

        /*//To print charcter at particular index like to print 'A' we write its position which is '0'
        System.out.println(sb.charAt(0));

        //Set char at 
        //To replace a charcter from a particular index like 'Ayush' replace a with 'P' then it becomes 'Pyush'        
        sb.setCharAt(0,'P');
        System.out.println(sb);*/
        
        //Inserting a new character on a position like 'Ayush' inserting 'A' at '0' position
        sb.insert(0, 'A');
        System.out.println(sb);

        // Now deleting that extra inserted character 
        sb.delete(0, 1);// It will start from '0' and it will not include end number 
        System.out.println(sb);
    }
    
}
