import java.util.Scanner;
public class Asssigment3 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a String_Text: ");
        String Text = input.nextLine();

        // The index of the first character in the string
        int first_index = 0;

        // The index of the last character in the string
        int second_index = Text.length() - 1;

        boolean is_Palindrome = true;
        while (first_index < second_index) {
            if (Text.charAt(first_index) != Text.charAt(second_index)) {
                is_Palindrome = false;
                break;
            }

            first_index++;
            second_index--;
        }

        if (is_Palindrome)
            System.out.println(Text + " is a palindrome");
        else
            System.out.println(Text + " is not a palindrome");
    }
}

