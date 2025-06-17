import java.util.Scanner;

public class Assigmentt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = ' ';
        int sum = 0;

        while (input != 'n' && input != 'N') {
            System.out.print("Enter an integer number or 'n' to stop: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("n")) {
                input = 'n';
                System.out.println("Program stopped.");
                break;
            }

            // Check if input is a valid number (all digits)
            boolean isValidNumber = true;
            for (int i = 0; i < userInput.length(); i++) {
                if (!Character.isDigit(userInput.charAt(i))) {
                    isValidNumber = false;
                    break;
                }
            }

            if (isValidNumber) {
                // Convert string to number manually
                int number = 0;
                for (int i = 0; i < userInput.length(); i++) {
                    number = number * 10 + (userInput.charAt(i) - '0');
                }
                sum += number;
                System.out.println("You entered: " + number);
            } else {
                System.out.println("Invalid input");
                break;
            }
        }

        System.out.println("Total sum: " + sum);
    }
}
