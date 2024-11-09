import java.util.Scanner;

public class CurrencyDenominations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the amount in rupees
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        // Define the denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        // Calculate the number of notes and coins for each denomination
        for (int i = 0; i < denominations.length; i++) {
            count[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        // Print the result
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes – " + count[i]);
        }

        // Close the scanner
        scanner.close();
    }
}