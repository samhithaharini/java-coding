package arrays;

import java.util.*;
public class Copyfromonetoanother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
            
            System.out.print(arr1[i]+" ");
        }
       /*  for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
            */
    }
}


