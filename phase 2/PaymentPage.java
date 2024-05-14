import java.util.*;

public class PaymentPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payment Page");

        System.out.println("Select a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Benefit Pay");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                processCreditCardPayment(scanner);
                break;
            case 2:
                processPayPalPayment(scanner);
                break;
            case 3:
                processBenefitPayPayment(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid payment method.");
        }
        //TODO: Add a loop to prompt the user to select a payment method until a valid choice is made

        scanner.close();
    }

    public static void processCreditCardPayment(Scanner scanner) {
        // TODO: Could be stored as a string to preserve leading zeros and it could be encrypted
        long creditCardNumber;
        do {
            System.out.println("Enter credit card number (16 digits):");
            creditCardNumber = scanner.nextLong();
            scanner.nextLine(); 

         
            if (String.valueOf(creditCardNumber).length() != 16) {
                System.out.println("Invalid credit card number. Please enter exactly 16 digits.");
            }
        } while (String.valueOf(creditCardNumber).length() != 16);

        String expirationDate;
        do {
            System.out.println("Enter expiration date (MM/YY):");
            expirationDate = scanner.nextLine();

          
            if (!expirationDate.matches("^(0[1-9]|1[0-2])/[0-9]{2}$")) {
                System.out.println("Invalid expiration date format. Please enter in MM/YY format.");
            }
        } while (!expirationDate.matches("^(0[1-9]|1[0-2])/[0-9]{2}$"));

        // TODO: Could be stored as a string to preserve leading zeros and it could be encrypted
        System.out.println("Enter CVV (3 digits):");
        int cvv = scanner.nextInt();
        scanner.nextLine();

        
        if (String.valueOf(cvv).length() != 3) {
            System.out.println("Invalid CVV. Please enter exactly 3 digits.");
            return; 
        }

        System.out.println("Payment successful with credit card.");
    }

    public static void processPayPalPayment(Scanner scanner) {
        System.out.println("Enter PayPal username:");
        String username = scanner.nextLine();
        System.out.println("Enter PayPal password:");
        String password = scanner.nextLine();

        System.out.println("Payment successful with PayPal.");
    }

    public static void processBenefitPayPayment(Scanner scanner) {
        System.out.println("Please scan the Benefit Pay QR code to confirm payment.");

        System.out.println("Press Enter after scanning to confirm payment.");
        scanner.nextLine();

        System.out.println("Payment successful with Benefit Pay.");
    }
}
