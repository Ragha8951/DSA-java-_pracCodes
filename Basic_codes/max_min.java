import java.util.Arrays;
import java.util.Scanner;
public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int size=sc.nextInt();

        int marks[]=new int[size];
        System.out.println("enter the element in an array: ");
        for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt();
        }
       
           
           int x=Integer.MAX_VALUE;
           int y=Integer.MIN_VALUE;
           for(int i=0;i<marks.length;i++){
            if(marks[i]>x){
                x=marks[i];
            }
           }
           for(int i=0;i<marks.length;i++){
            if(marks[i]<y){
                y=marks[i];
            }
           }
           System.out.println("max marks is: "+x);
           System.out.println("min marks is: "+y);
            
  sc.close();  }
}

