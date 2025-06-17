import java.util.Scanner;
public class Assigment4 {
    public static void main(String[] args) {
        System_Of_Banking();
    }
    public static void System_Of_Banking() {
        Scanner ask = new Scanner(System.in);
        int balance = 0;
        final int MAX_ATTEMPTS = 3;

        System.out.print("Create a 4-digit PIN and Don't Tell Any one: ");
        String pin = ask.nextLine();

        int attempts = 0;
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your PIN: ");
            String user_input = ask.nextLine();

            if (user_input.equals(pin)) {
                System.out.println("PIN verified or PIN Successful.\n");

                int choice = 0;
                while (choice != 4) {
                    System.out.println("Our Banking Menu Services Please Choice One Of Them");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Please Choose one option: ");
                    choice = ask.nextInt();

                    if (choice == 1) {
                        System.out.print("How many Money Do you want to deposit: ");
                        int deposit = ask.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposited $" + deposit);
                        } else {
                            System.out.println("Invalid deposit Money.");
                        }

                    } else if (choice == 2) {
                        System.out.print("How many Money Do you want to withdraw: ");
                        int withdraw = ask.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrew $" + withdraw);
                        } else {
                            System.out.println("Invalid or insufficient balance.");
                        }

                    } else if (choice == 3) {
                        System.out.println("Current balance: $" + balance);

                    } else if (choice == 4) {
                        System.out.println("Thank You See you Soon !");

                    } else {
                        System.out.println("Invalid option.");
                    }

                    System.out.println(); // Just for spacing
                }

                return; // Exit after done
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        System.out.println("Too many incorrect attempts. System is locked So be careful the other time Good lock.");
    }
}