import java.util.Scanner;

public class Payment {
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

        scanner.close();
    }

    public static void processCreditCardPayment(Scanner scanner) {
        System.out.println("Enter credit card number:");
        String creditCardNumber = scanner.nextLine();
        System.out.println("Enter expiration date:");
        String expirationDate = scanner.nextLine();
        System.out.println("Enter CVV:");
        String cvv = scanner.nextLine();

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
