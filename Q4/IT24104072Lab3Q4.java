import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Ensure the number is five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Convert the number to a string to easily access individual digits
            String numberString = Integer.toString(number);

            // Print each digit separated by a space
            for (int i = 0; i < numberString.length(); i++) {
                System.out.print(numberString.charAt(i));
                if (i < numberString.length() - 1) {
                    System.out.print(" "); // Print a space between digits
                }
            }
            System.out.println(); // Move to the next line after printing all digits
        }

        scanner.close();
    }
}
How It Works:
Input: The program prompts the user to enter a five-digit number.
Validation: It checks if the number is indeed five digits.
Separation: The number is converted to a string, allowing access to each digit.
Output: Each digit is printed with a space in between.
Usage:
Compile and run the program.
Input a five-digit number when prompted, and the program will display the digits separated by spaces.


