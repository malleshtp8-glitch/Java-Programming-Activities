import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class PasswordCheck {

    static void validate(String password)
            throws InvalidPasswordException {

        if (password.length() < 6) {
            throw new InvalidPasswordException(
                    "Password must be at least 6 characters.");
        }

        boolean digit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit = true;
                break;
            }
        }

        if (!digit) {
            throw new InvalidPasswordException(
                    "Password must contain at least one digit.");
        }

        System.out.println("Password is valid.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validate(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}