package arrays;
import java.util.*;
public class AlternativePosNeg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=0;
        int neg=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        for(int i=0;i<n;i++){ 
            System.out.print(ans[i]+" ");
        }
    }
}
