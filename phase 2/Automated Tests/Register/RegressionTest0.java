
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }

    java.util.Scanner scanner0 = null;
    // The following exception was thrown during execution in test generation
    try {
    Register.UserLogin.loginUser(scanner0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test2"); }

    Register register0 = new Register();
    Register.UserRegistration userRegistration1 = register0.new UserRegistration();

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test3"); }

    Register register0 = new Register();
    Register.UserLogin userLogin1 = register0.new UserLogin();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test4"); }

    Register register0 = null;
    // The following exception was thrown during execution in test generation
    try {
    Register.UserRegistration userRegistration1 = register0.new UserRegistration();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
