 package arrays;
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         rotate(arr,n);
//     }
//     public static void rotate(int[] arr,int n){
//         int k=2;
//         for(int i=0;i<k;i++){ 
//             int left=arr[0];
//             int j;
//             for(j=0;j<n-1;j++){
//                 arr[j]=arr[j+1];
//             }
//             arr[j]=left;
//         }
//         for(int i=0;i<n;i++){ 
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

import java.util.Scanner;

public class LeftRotate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        leftRotate(arr,0,k-1);
        leftRotate(arr,k,n-1);
        leftRotate(arr,0,n-1);
        display(arr);
    
    }
    public static void leftRotate(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}