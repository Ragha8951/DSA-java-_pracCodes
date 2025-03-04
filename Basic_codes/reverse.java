import java.util.Scanner;
public class reverse {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reveresed");
        int n=sc.nextInt();
        int num=n,rev=0,dig=0;
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;

        }
       
         
         System.out.println("the revere value is: "+rev);
        
sc.close();
        


    }
}
