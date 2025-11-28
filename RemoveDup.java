package arrays;
import java.util.*;
public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicates are: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=0){
                    System.out.println(arr[i]+" ");
                }
            }
        }
        // for(int i:dup){
        //     System.out.print(i+" ");
        // }
    }
}
