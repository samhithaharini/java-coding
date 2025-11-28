package strings;
import java.util.*;
public class ReverseLettersInSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        char[] arr=str.toCharArray();
        for(int i=l-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
