package strings;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next().toLowerCase();
        String str2=sc.next().toLowerCase();
        int l1=str1.length();
        int l2=str2.length();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        boolean ans=false;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(ch1[i]==ch2[j]){
                    ans=true;
                }
            }
        }
        if(ans){
            System.out.println("Anagram..");
        }
        else{
            System.out.println("Not Anagram..");
        }
    }
}
