import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            try {
                if (amount > balance) {
                    throw new Exception("Insufficient Funds");
                }

                balance = balance - amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Updated Balance = " + balance);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}