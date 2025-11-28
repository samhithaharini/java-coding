package strings;
import java.util.*;
public class CountOfCharInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=0;
        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++) {
            len++;   
        }
        System.out.println("Length of the string: "+len);
    }
}
