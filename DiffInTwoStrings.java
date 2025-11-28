package strings;
import java.*;
import java.util.Scanner;
public class DiffInTwoStrings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        char ans='a';
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]!=b[j]){
                    ans=b[j];
                }
            }
        }
        System.out.println(ans);
    }
}