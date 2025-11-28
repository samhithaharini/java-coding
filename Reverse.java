package strings;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        char[] ch=str.toCharArray();
        // int s=0;
        // int e=n-1;
        // while(s<e){
        //     char temp=ch[s];
        //     ch[s]=ch[e];
        //     ch[e]=temp;
        //     s++;
        //     e--;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(ch[i]);
        // }
        for(int i=n-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
