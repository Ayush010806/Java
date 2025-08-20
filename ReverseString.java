import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("AYUSH");

        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;//5-1-0;

            char frontChar = sb.charAt(front);//At this step we remove front character
            char backChar = sb.charAt(back);//At this step we remove back character

            sb.setCharAt(front, backChar);// Here we replace front character with back charcter
            sb.setCharAt(back, frontChar);//vice-versa

           
        }
        System.out.println(sb);
    }
}
