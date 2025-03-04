import java.util.Scanner;


public class count {
    /* 
    static int comput(int val){
        int count=0;
        while(val>0){
            count+=1;
            val=val/10;
        }
return count; }  */

    static int comput(int val){
        int count=(int)(Math.log10(val)+1);

     return count;
    }
    public static void main(String[] args ){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number ");
    int val=sc.nextInt();
    int x=comput( val);
    System.out.println("Count of digit is "+x);
    sc.close();
    }
    
}
