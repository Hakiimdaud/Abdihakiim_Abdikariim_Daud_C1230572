import java.util.Scanner;

public class Assigment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password to check it's strength: ");
        String passw = input.nextLine();
        if (isStrong(passw)){
            System.out.println("Your password is Strong");
        }
        else if (!checkLength(passw)){
            System.out.println("Your password must be at least 8 characters ");
        }
        else if (!checkUpercase(passw)){
            System.out.println("Your password must contain at least one Uppercase letter like : 'A'");
        }else if (!checkLowerCase(passw)){
            System.out.println("Your password must contain at least one Lowercase letter like : 'a'  ");
        }else if (!checkSpecialCase(passw)){
            System.out.println("Your password must contain at least one Special-case character like : '@'");
        }
        else {
            System.out.println("Your password is weak ");
        }

    }


    //check length
    public static boolean checkLength(String passw_length){
        return passw_length.length()>=8;
    }
    //check Uppercase
    public static boolean checkUpercase(String Passw_Case){
        for(char ch : Passw_Case.toCharArray()){
            if (Character.isUpperCase(ch))
                return true;
        }
        return false;
    }

    //check lowercase
    public static boolean checkLowerCase(String Passw_Case){
        for (char ch : Passw_Case.toCharArray()){
            if (Character.isLowerCase(ch))
                return true;
        }
        return false;
    }

    //check digit
    public static boolean checkDigit(String passw) {
        for (char ch : passw.toCharArray()){
            if (Character.isDigit(ch))
                return true;
        }
        return false;
    }

    //check specialcase
    public static boolean checkSpecialCase(String Passw_Case){
        for (char ch : Passw_Case.toCharArray()){
            if (!Character.isLetterOrDigit(ch))
                return true;
        }
        return false;
    }

    //check all conditons
    public static boolean isStrong(String passw){
        return checkLength(passw)&&checkUpercase(passw)&&
                checkLowerCase(passw)&&checkSpecialCase(passw)&&
                checkSpecialCase(passw) && isStrong(passw);
    }
}