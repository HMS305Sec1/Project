import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentPageTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testCreditCardPayment() {
        String simulatedInput = "1\n1234567890123456\n12/25\n123\n";
        provideSimulatedInput(simulatedInput);

        PaymentPage.main(new String[]{});

        assertEquals("Welcome to the Payment Page\r\n" + 
                        "Select a payment method:\r\n" + 
                        "1. Credit Card\r\n" + 
                        "2. PayPal\r\n" + 
                        "3. Benefit Pay\r\n" + 
                        "Enter credit card number (16 digits):\r\n" + 
                        "Enter expiration date (MM/YY):\r\n" + 
                        "Enter CVV (3 digits):\r\n" + 
                        "Payment successful with credit card.", outContent.toString().trim());
    }


    private void provideSimulatedInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }
}
