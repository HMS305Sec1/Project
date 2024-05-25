package Register;

import java.util.HashMap;

public class Register {

    // HashMap to store user credentials (username, password)
    static HashMap<String, String> users = new HashMap<>();

    // Function to run the registration system
    public void runRegistrationSystem(int choice) {
        // Menu loop
        switch (choice) {
            case 1:
                registerUser("Ali", "123456897");
                break;
            case 2:
                loginUser("Mahdi", "12356498");
                break;
            case 3:
                break; // Exit the loop if the user chooses to quit
            default:
                System.out.println("Invalid choice");
        }
    }

    // Function to register a new user
    public void registerUser(String username, String password) {
        // Check if the username already exists
        if (users.containsKey(username)) {
            System.out.println("User already exists.");
        } else {
            // Add the new user to the HashMap
            users.put(username, password);
            System.out.println("Registration successful.");
        }
    }

    // Function to log in an existing user
    public void loginUser(String username, String password) {
        // Check if the username exists in the HashMap
        if (!users.containsKey(username)) {
            System.out.println("Invalid username or password.");
        } else {
            // Check if the entered password matches the stored password for the username
            if (users.get(username).equals(password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }
}
