package Register;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegisterTest {

    @Test
    public void testRegisterUser() {
        Register register = new Register();
        register.runRegistrationSystem(1);


    }

    @Test
    public void testLoginUser() {
        Register register = new Register();
        register.registerUser("JohnDoe", "password123");
        register.runRegistrationSystem(2);


    }
}
