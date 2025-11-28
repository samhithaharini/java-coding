package strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        // char[] ch=str.toCharArray();
        // char[] ch1=str.toCharArray();
        // for(int i=n-1;i>=0;i--){
        //     ch1[i]=ch[i];
        // }
        // String s=ch1.toString();

        String str1="";
        for(int i=n-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str.toLowerCase().equals(str1.toLowerCase())){
            System.out.println("String is Palindrome!");
        }else{
            System.out.println("String is not Palindrome..");
        }
    }
    
    
}
