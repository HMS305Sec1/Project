
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test01"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    reservation.Room room9 = reservation3.getRoom();
    reservation.Room room10 = reservation3.getRoom();
    reservation.Room room11 = reservation3.getRoom();
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    
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
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test02"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(10, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    int i7 = reservation3.getReservationId();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test03"); }

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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test04"); }

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
    int i12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getGuestName();
    int i14 = reservation3.getReservationId();
    
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
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test05"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'a', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test06"); }

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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test07"); }

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
    java.lang.String str12 = reservation3.getGuestName();
    java.lang.String str13 = reservation3.getGuestName();
    reservation.Room room14 = reservation3.getRoom();
    reservation.Room room15 = reservation3.getRoom();
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test08"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)'#', room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    int i5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getGuestName();
    reservation.Room room7 = reservation3.getRoom();
    reservation.Room room8 = reservation3.getRoom();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test09"); }

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
    java.lang.String str12 = reservation3.getGuestName();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test10"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    reservation.Room room4 = reservation3.getRoom();
    int i5 = reservation3.getReservationId();
    int i6 = reservation3.getReservationId();
    int i7 = reservation3.getReservationId();
    java.lang.String str8 = reservation3.getGuestName();
    int i9 = reservation3.getReservationId();
    int i10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getGuestName();
    reservation.Room room12 = reservation3.getRoom();
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test11"); }

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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test12"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(short)1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    int i8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getGuestName();
    java.lang.String str10 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test13"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation(100, room1, "hi!");
    java.lang.String str4 = reservation3.getGuestName();
    java.lang.String str5 = reservation3.getGuestName();
    java.lang.String str6 = reservation3.getGuestName();
    java.lang.String str7 = reservation3.getGuestName();
    reservation.Room room8 = reservation3.getRoom();
    java.lang.String str9 = reservation3.getGuestName();
    int i10 = reservation3.getReservationId();
    int i11 = reservation3.getReservationId();
    reservation.Room room12 = reservation3.getRoom();
    int i13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getGuestName();
    int i15 = reservation3.getReservationId();
    reservation.Room room16 = reservation3.getRoom();
    
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
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test14"); }

    reservation.Room room1 = null;
    reservation.Reservation reservation3 = new reservation.Reservation((int)(byte)-1, room1, "");
    reservation.Room room4 = reservation3.getRoom();
    java.lang.String str5 = reservation3.getGuestName();
    reservation.Room room6 = reservation3.getRoom();
    reservation.Room room7 = reservation3.getRoom();
    java.lang.String str8 = reservation3.getGuestName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test15"); }

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
    reservation.Room room13 = reservation3.getRoom();
    reservation.Room room14 = reservation3.getRoom();
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

}
