import java.util.HashMap;
import java.util.Scanner;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;


public class Register {

    static HashMap<String, String> users = new HashMap<String, String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }


public class UserRegistration {
    private static ConcurrentHashMap<String, String> users = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        registerUser(scanner);
        scanner.close();
    }

    static void registerUser(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine().trim();
        System.out.println("Enter your password:");
        String password = scanner.nextLine().trim();

        if (!isValidUsername(username)) {
            System.out.println("Invalid username. Username must be at least 3 characters long and contain only letters and numbers.");
            return;
        }

        if (!isValidPassword(password)) {
            System.out.println("Invalid password. Password must be at least 6 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            return;
        }

        if (users.containsKey(username)) {
            System.out.println("User already exists.");
        } else {
            String hashedPassword = hashPassword(password);
            users.put(username, hashedPassword);
            System.out.println("Registration successful.");
        }
    }

    private static boolean isValidUsername(String username) {
        return username.length() >= 3 && Pattern.matches("^[a-zA-Z0-9]+$", username);
    }

    private static boolean isValidPassword(String password) {
        return password.length() >= 6 &&
               Pattern.matches(".*[A-Z].*", password) && // At least one uppercase letter
               Pattern.matches(".*[a-z].*", password) && // At least one lowercase letter
               Pattern.matches(".*\\d.*", password) &&   // At least one digit
               Pattern.matches(".*[!@#$%^&*(),.?\":{}|<>].*", password); // At least one special character
    }

    private static String hashPassword(String password) {
        return password;
    }
}


public class UserLogin {
    private static Map<String, String> users = new HashMap<>();

    static {
        users.put("user1", "Password1!");
        users.put("user2", "Password2@");
    }

    public static void loginUser(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine().trim();
        System.out.println("Enter your password:");
        String password = scanner.nextLine().trim();

        // Validate username and password
        String usernameValidationResult = validateUsername(username);
        String passwordValidationResult = validatePassword(password);

        if (!usernameValidationResult.isEmpty()) {
            System.out.println("Invalid username: " + usernameValidationResult);
            return;
        }

        if (!passwordValidationResult.isEmpty()) {
            System.out.println("Invalid password: " + passwordValidationResult);
            return;
        }

       
        if (!users.containsKey(username) || !users.get(username).equals(password)) {
            System.out.println("Invalid username or password.");
        } else {
            System.out.println("Login successful.");
        }
    }

    private static String validateUsername(String username) {
        if (username.isEmpty()) {
            return "Username cannot be empty.";
        }
        if (username.length() < 5 || username.length() > 15) {
            return "Username must be between 5 and 15 characters.";
        }
        if (!username.matches("[a-zA-Z0-9]+")) {
            return "Username can only contain alphanumeric characters.";
        }
        return "";
    }

    private static String validatePassword(String password) {
        if (password.isEmpty()) {
            return "Password cannot be empty.";
        }
        if (password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Password must contain at least one uppercase letter.";
        }
        if (!password.matches(".*[a-z].*")) {
            return "Password must contain at least one lowercase letter.";
        }
        if (!password.matches(".*[0-9].*")) {
            return "Password must contain at least one digit.";
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return "Password must contain at least one special character (e.g., !@#$%^&*()).";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loginUser(scanner);
        scanner.close();
    }
}
}
