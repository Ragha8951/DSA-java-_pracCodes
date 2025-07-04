import java.util.*;

public class bubblesort {
    static void bubble(int arr[],int n)
    {
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of array element: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element before sorting");
        System.out.println(Arrays.toString(arr));
        bubble(arr,n);
        System.out.println("Array element after sorting");
        System.out.println(Arrays.toString(arr));




    }
}
