import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        // Input number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();
        
        // Input OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        
        // Calculate OT Amount
        double otAmount = otHours * otHourlyRate;
        
        // Calculate Total Salary
        double totalSalary = monthlySalary + otAmount;
        
        // Output the total salary
        System.out.printf("Total Salary = %.2f%n", totalSalary);
        
        // Close the scanner
        scanner.close();
    }
}