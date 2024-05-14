package HotelFillForm;

import org.junit.jupiter.api.Test;
import org.opentest4j.MultipleFailuresError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class FillFormTest {

    @Test
    public void testFillForm() throws IOException {
        // Mock user input
        String userInput = "John\n25\nAmerican\n3\n2\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        FillForm.main(new String[]{});

        // Get the output
        String output = outputStream.toString();

        // Assert the output
        try {
            assertAll(
                () -> assertEquals("--- Hotel Form ---\nName (A-Z letters only): Age: Nationality: Hotel Star Preference:\n[1] 1 Star\n[2] 2 Stars\n[3] 3 Stars\n[4] 4 Stars\n[5] 5 Stars\nEnter your choice (1-5): Room Preference:\n[1] Single Room\n[2] Double Room\n[3] Suite\n[4] Other\nEnter your choice (1-4): \n--- Form Summary ---\nName: John\nAge: 25\nNationality: American\nHotel Star Preference: 3 Stars\nRoom Preference: Double Room\n", output)
            );
        } catch (MultipleFailuresError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Test
    public void testReadValidName() {
        // Mock user input
        String userInput = "John\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the method
        String name = FillForm.readValidName(new Scanner(System.in));

        // Assert output and result
        assertAll(
            () -> assertEquals("John", name),
            () -> assertEquals("", outputStream.toString()) // No output expected
        );
        
    }

    @Test
    public void testReadValidNationality() {
        // Mock user input
        String userInput = "American\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the method
        String nationality = FillForm.readValidNationality(new Scanner(System.in));

        // Assert output and result
        assertAll(
            () -> assertEquals("American", nationality),
            () -> assertEquals("", outputStream.toString()) // No output expected
        );
    }
}
