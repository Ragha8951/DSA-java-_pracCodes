import java.util.Scanner;
public class pattern {
    static void pattern12(int n){
        /*         
        for(int i=1;i<=n;i++){
        
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);}*/
             /*   int num=1;
            

            for(int i=1;i<=n;i++){
        
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }
                char ascii=64;
                for(int i=1;i<=n;i++){
                    
                    ascii++; 
        
                    for(int j=1;j<=i;j++){
                        System.out.print(ascii+" ");
                        
                       
                    }   
                
                    for(int i=1;i<=n;i++){
                        char ascii=65;
                        
                        
            
                        for(int j=1;j<=n-i;j++){
                            System.out.print(" ");
                            
                           
                        } 
                       
                        for(int j=1;j<=i;j++){
                            System.out.print(ascii);
                            
                            ascii++; 
                        } 
                         ascii-=2;
                        for(int j=2;j<=i;j++){
                            System.out.print(ascii);
                            
                            ascii--;
                        } 
                  
                  
                  for(int i=1;i<=n;i++){
                    char ascii=(char)('E'-i+1);
                    
                    
        
                    for(int j=i;j>=1;j--){
                        System.out.print(ascii);
                        ascii++;
                        }
                       

                       for(int i=0;i<n;i++){
                        
                        
                        
            
                        for(int j=n-i;j>=1;j--){
                            System.out.print("*");
                            
                            }
                            for(int j=0;j<2*i;j++){
                                System.out.print(" ");
                                
                                }
                                for(int j=n-i;j>=1;j--){
                                    System.out.print("*");
                                    
                                    }

               

           System.out.println();
        }

        for(int i=1;i<=n;i++){
                        
                        
                        
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
                }

                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                    
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                        
                        }*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
System.out.println();
}
for(int i=n-1;i>=1;i--){
    for(int j=i;j>=1;j--){
        System.out.print("*");
    }
    for(int j=2*(n-i);j>=0;j--){
        System.out.print(" ");

    }
    for(int j=i;j>=1;j--){
        System.out.print("*");
    }
System.out.println();
}
        }

    
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n\n");
    int value=sc.nextInt();
    pattern12( value);
    sc.close();
    }
}
