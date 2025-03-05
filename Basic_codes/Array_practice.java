import java.util.Arrays;
import java.util.Scanner;
public class Array_practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int size=sc.nextInt();

        int marks[]=new int[size];
        System.out.println("enter the element in an array: ");
        for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt();
        }
       
           
            System.out.println(Arrays.toString(marks));
            
  sc.close();  }
}
