import java.util.Scanner;

public class FillForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Form");

        // Prompt the user to fill out the form
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Display the submitted information
        System.out.println("\nThank you for submitting the form. Here is the information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

        // Close the scanner
        scanner.close();
    }
}