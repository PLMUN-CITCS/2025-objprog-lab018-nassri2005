import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from user
    public static int getIntegerInput(Scanner scanner) {
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine().trim());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }
    
    // Method to check if number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    
    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getIntegerInput(scanner);
        String result = checkEvenOrOdd(number);
        System.out.println(result);
        scanner.close();
    }
}
