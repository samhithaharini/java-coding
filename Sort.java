package strings;
import java.util.*;
public class Sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        char[] ch=str.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ch[j]>ch[j+1]){
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ch[i]+" ");
        }
    }
}