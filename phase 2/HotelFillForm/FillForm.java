import java.util.Scanner;

public class FillForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Hotel Form ---");
        System.out.print("Name (A-Z letters only): "); /* add without space and only letters */
        String name = readValidName(scanner);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Nationality: ");
        String nationality = readValidNationality(scanner);

        System.out.println("Hotel Star Preference:");
        System.out.println("[1] 1 Star");
        System.out.println("[2] 2 Stars");
        System.out.println("[3] 3 Stars");
        System.out.println("[4] 4 Stars");
        System.out.println("[5] 5 Stars");
        System.out.print("Enter your choice (1-5): ");
        int starPreference = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String starPreferenceText = "";
        switch (starPreference) {
            case 1:
                starPreferenceText = "1 Star";
                break;
            case 2:
                starPreferenceText = "2 Stars";
                break;
            case 3:
                starPreferenceText = "3 Stars";
                break;
            case 4:
                starPreferenceText = "4 Stars";
                break;
            case 5:
                starPreferenceText = "5 Stars";
                break;
            default:
                starPreferenceText = "Invalid Choice";
        }

        System.out.println("Room Preference:");
        System.out.println("[1] Single Room");
        System.out.println("[2] Double Room");
        System.out.println("[3] Suite");
        System.out.println("[4] Other");
        System.out.print("Enter your choice (1-4): ");
        int roomChoice = scanner.nextInt();

        String roomPreference = "";
        switch (roomChoice){
            case 1:
                roomPreference= "Single Room";
                break;
            case 2:
                roomPreference= "Double Room";
                break;
            case 3:
                roomPreference= "Suite";
                break;
            case 4:
                roomPreference= "Other";
                break;
            default:
                roomPreference = "Invalid Choice";
        }
        
        // Output the collected information
        System.out.println("\n--- Form Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Hotel Star Preference: " + starPreferenceText);
        System.out.println("Room Preference: " + roomPreference);

        // Close the scanner
        scanner.close();
    }

    private static String readValidName(Scanner scanner) {
        String name;
        do {
            name = scanner.nextLine();
            if (!name.matches("[a-zA-Z]+")) {
                System.out.print("Please enter a valid name (A-Z letters only): ");
            }
        } while (!name.matches("[a-zA-Z]+"));
        return name;
    }
    private static String readValidNationality(Scanner scanner) {
        String nationality;
        do {
            nationality = scanner.nextLine();
            if (!nationality.matches("[a-zA-Z]+")) {
                System.out.print("Please enter a valid Nationality (A-Z letters only): ");
            }
        } while (!nationality.matches("[a-zA-Z]+"));
        return nationality;
    }
}
