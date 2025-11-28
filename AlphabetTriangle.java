package patterns;
import java.util.*;
public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int ch='A';
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //for(int j=0;j<=i;j++){
            for(char ch='A';ch<='A'+i;ch++){
                //System.out.print((char)ch+" ");
                //ch++; abcdef...
                System.out.print(ch+" ");
            }
            System.out.println();
            //ch++; same row
        }
        sc.close();
    }
}
