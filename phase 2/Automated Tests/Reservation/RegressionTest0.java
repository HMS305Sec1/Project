
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)10, room1, "");

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "");
    int i4 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(35, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    java.lang.String str15 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
    int i15 = reservation3.getReservationId();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    int i15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    reservation.Room room15 = reservation3.getRoom();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    int i15 = reservation3.getReservationId();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    reservation.Room room15 = reservation3.getRoom();
    java.lang.String str16 = reservation3.getGuestName();
    reservation.Room room17 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    reservation.Room room14 = reservation3.getRoom();
    java.lang.String str15 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)10, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "");
    int i4 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)10, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    java.lang.String str15 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
    reservation.Room room15 = reservation3.getRoom();
    reservation.Room room16 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    int i15 = reservation3.getReservationId();
    reservation.Room room16 = reservation3.getRoom();
    reservation.Room room17 = reservation3.getRoom();
    reservation.Room room18 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
    java.lang.String str15 = reservation3.getGuestName();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    reservation.Room room15 = reservation3.getRoom();
    int i16 = reservation3.getReservationId();
    java.lang.String str17 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)10, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    reservation.Room room14 = reservation3.getRoom();
    int i15 = reservation3.getReservationId();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    int i14 = reservation3.getReservationId();
    reservation.Room room15 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    int i15 = reservation3.getReservationId();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(35, room1, "");
    int i4 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    reservation.Room room15 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    int i15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    reservation.Room room15 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    reservation.Room room15 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    reservation.Room room15 = reservation3.getRoom();
    java.lang.String str16 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    int i14 = reservation3.getReservationId();
    reservation.Room room15 = reservation3.getRoom();
    int i16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(52, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(97, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(35, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
    java.lang.String str15 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    int i15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)0, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    reservation.Room room14 = reservation3.getRoom();
    int i15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    int i14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    reservation.Room room13 = reservation3.getRoom();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((-1), room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "");
    int i4 = reservation3.getReservationId();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    int i11 = reservation3.getReservationId();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)' ', room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'4', room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    int i6 = reservation3.getReservationId();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    reservation.Room room9 = reservation3.getRoom();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    int i15 = reservation3.getReservationId();
    reservation.Room room16 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    java.lang.String str11 = reservation3.getGuestName();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    int i13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    int i13 = reservation3.getReservationId();
    reservation.Room room14 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)0, room1, "hi!");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    int i12 = reservation3.getReservationId();
    reservation.Room room13 = reservation3.getRoom();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(32, room1, "");
    int i4 = reservation3.getReservationId();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    reservation.Room room8 = reservation3.getRoom();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    int i9 = reservation3.getReservationId();
    reservation.Room room10 = reservation3.getRoom();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
    java.lang.String str13 = reservation3.getGuestName();
    java.lang.String str14 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)10, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)100, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    reservation.Room room5 = reservation3.getRoom();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    int i10 = reservation3.getReservationId();
    reservation.Room room11 = reservation3.getRoom();
    reservation.Room room12 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(1, room1, "hi!");
    int i4 = reservation3.getReservationId();
    int i5 = reservation3.getReservationId();
    reservation.Room room6 = reservation3.getRoom();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

}
