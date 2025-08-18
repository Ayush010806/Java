import java.util.*;
public class StringBuild {
    public static void main(String[] args) {
        //To Create a StringBuilder object we use
        StringBuilder sb = new StringBuilder("Hello");

        //To Append text we use
        sb.append(" World");
        System.out.println("After append: " + sb);

        //To Insert text at a specific position we use
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        //To Replace part of the string we use
        sb.replace(6, 10, "Programmer");
        System.out.println("After replace: " + sb);

        //To Delete part a of the string we use
        sb.delete(6, 17);
        System.out.println("After delete: " + sb);

        //To Reverse the string we use
        sb.reverse();
        System.out.println("After reverse: " + sb);

        //To Find the Length and Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}