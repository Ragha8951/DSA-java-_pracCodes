import java.util.Scanner;
public class palindrom {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked ");
        int n=sc.nextInt();
        int num=n,rev=0,dig=0;
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;

        }
       
         
        if(num==rev){
            System.out.println("its a palindrome ");
        }
        else{
            System.out.println("its not a palindrome ");
        }
sc.close();}
}
