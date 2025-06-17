import java.util.Scanner;
public class Assigment1 {
    public static void main(String[] args) {
        int Prime = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter An Integer Number: ");
        int Ans = input.nextInt();
//
        for (int i = 1; i < Ans; i++) {
            if (Ans % i == 0) {
                Prime = 0;
                break;
            }
        }
        if (Prime == 1) {
            System.out.println(" it's a Prime Number.");
        } else {
            System.out.println(" it's not a Prime Number.");
        }


    }
}