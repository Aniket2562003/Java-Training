import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        System.out.println("Welcome to Simple ATM");
        char choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Your current balance is: ₹" + balance);
                    break;
                case '2':
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    balance =  balance+depositAmount;
                    System.out.println("Deposit successful. Your new balance is: ₹" + balance);
                    break;
                case '3':
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient amount. Your balance is: ₹" + balance);
                    } else {
                        balance = balance-withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is: ₹" + balance);
                    }
                    break;
                case '4':
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }

        } while (choice != '4');

        scanner.close();
    }
}
