import java.util.*;
public class insertion_sort {
    static void Select(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of arrays");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element before sorting");
        System.out.println(Arrays.toString(arr));
        Select(arr,n);
        System.out.println("Array element after sorting");
        System.out.println(Arrays.toString(arr));

    }
}
