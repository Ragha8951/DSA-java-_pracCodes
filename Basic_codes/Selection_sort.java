import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class Selection_sort {
    static void Selection(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                


                }
                if(arr[i]!=arr[min]){
                    int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                }
            }
        }
       
        

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of array element: ");
        int n;
        n=sc.nextInt();
         System.out.println("Enter the array element: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("arrys before sorting: ");
        System.out.println(Arrays.toString(arr));
        Selection(arr,n);
        System.out.println("arrys before sorting: ");
        System.out.println(Arrays.toString(arr));


    }
    
}
