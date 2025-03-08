import java.util.Arrays;
import java.util.Scanner;

public class product_array_238 {
    public static int[] pro(int num[]) {
        int n = num.length;
        if (n == 0) return new int[0]; // Edge case: Handle empty array

        int ans[] = new int[n];

        // Step 1: Compute prefix product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * num[i - 1];
        }

        // Step 2: Compute suffix product and update answer array
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= num[i];
        }

        return ans;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int mar[] = new int[size];

        // Taking array elements as input
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < mar.length; i++) {
            mar[i] = sc.nextInt();
        }

        // Printing the output array
        System.out.println("Product Array: " + Arrays.toString(pro(mar)));

        // Closing scanner to prevent memory leak
        sc.close();
    }
}
