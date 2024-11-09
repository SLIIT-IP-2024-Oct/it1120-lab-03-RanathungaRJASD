import java.util.Scanner;

public class SupermarketDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input total bill amount
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();
        
        // Calculate discount
        double discountRate = 0.10; // 10% discount
        double discountAmount = totalBill * discountRate;
        
        // Calculate final amount after discount
        double finalAmount = totalBill - discountAmount;
        
        // Output the results
        System.out.printf("Total bill amount: $%.2f%n", totalBill);
        System.out.printf("Discount amount: $%.2f%n", discountAmount);