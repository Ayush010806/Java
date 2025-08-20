import java.util.*;
public class AppendString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        sb.append("Y");//str = str + "Y"
        sb.append("U");//str = str + "U"
        sb.append("S");//str = str + "S"
        sb.append("H");//str = str + "H"

        // It works like adding append it will add that value at last of new stringbuilder 
        //In memory it doesn't change any stored value
        System.out.println(sb);

        //To find the length of string 
        System.out.println(sb.length());
    }
}
