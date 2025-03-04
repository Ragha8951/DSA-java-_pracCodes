import java.util.Scanner;

public class pongademo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] marks = new int[size];

        // Taking array input
        System.out.println("Enter values in array: ");
        for (int i = 0; i < size; i++) {  // ✅ Fixed loop condition
            marks[i] = sc.nextInt();
        }

        // Input the number to search
        System.out.print("Enter the number to be searched: ");
        int seh = sc.nextInt();

        // Searching for the number
        int index = -1; // Default value (if not found)
        for (int i = 0; i < size; i++) {
            if (marks[i] == seh) {
                index = i;
                break;  // Stop searching after first match
            }
        }

        // Display result
        if (index != -1) {
            System.out.println("Index of number in array: " + index);
        } else {
            System.out.println("Number not found in array.");
        }
        
        sc.close(); 
    }
}
