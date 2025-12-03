package session1Activity1_01;
 
import java.util.Scanner;
public class M1A3 {
 
    // Method to compute sum
    public static int computeSum(int a, int b) {
        return a + b;
    }
 
    // Method to compute difference
    public static int computeDifference(int a, int b) {
        return a - b;
    }
 
    // Method to compute product
    public static int computeProduct(int a, int b) {
        return a * b;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // Read two integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
 
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
 
        // Compute results using methods
        int sum = computeSum(num1, num2);
        int difference = computeDifference(num1, num2);
        int product = computeProduct(num1, num2);
 
        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
 
        input.close();
    }
        
        
}
