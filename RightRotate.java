package arrays;

import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        display(arr,n);


        //rightRotate(arr,n);
    }
    // public static void rightRotate(int[] arr,int n){
    //     int k=2;
    //     for(int i=0;i<k;i++){
    //         int right=arr[n-1];
    //         int j;
    //         for(j=n-1;j>0;j--){
    //             arr[j]=arr[j-1];
    //         }
    //         arr[j]=right;
    //     }
    //     for(int i=0;i<n;i++){ 
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    public static void rotate(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void display(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

