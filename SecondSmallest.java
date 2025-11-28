package arrays;
import java.util.*;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<a){
                b=a;
                a=arr[i];
            }else if(arr[i]<b && a!=b){
                b=arr[i];
            }
        }
        System.out.println(b);
    }
}
