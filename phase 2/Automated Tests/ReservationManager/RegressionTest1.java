
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.Room room21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = reservationManager16.makeReservation(room21, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager14.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.Room room13 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = reservationManager10.makeReservation(room13, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation10);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager11.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager11.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager18 = new reservation.ReservationManager(list_reservation17);
    reservation.ReservationManager reservationManager19 = new reservation.ReservationManager(list_reservation17);
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager19.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation23 = reservationManager19.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation23);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation22 = reservationManager16.getReservationsByGuestName("");
    reservation.Room room23 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = reservationManager16.makeReservation(room23, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation22);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager6.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager6.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager6.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    reservation.Room room17 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = reservationManager16.makeReservation(room17, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.Room room15 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = reservationManager14.makeReservation(room15, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager10.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager10.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager19 = new reservation.ReservationManager(list_reservation18);
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager19.getReservationsByGuestName("");
    reservation.Room room22 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = reservationManager19.makeReservation(room22, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager6.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager11.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager17.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager8.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager8.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager8.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager8.getReservationsByGuestName("hi!");
    reservation.Room room19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = reservationManager8.makeReservation(room19, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager14.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation22 = reservationManager14.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation22);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager3.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    reservation.Room room11 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = reservationManager10.makeReservation(room11, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    reservation.Room room11 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = reservationManager10.makeReservation(room11, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager21 = new reservation.ReservationManager(list_reservation20);
    reservation.ReservationManager reservationManager22 = new reservation.ReservationManager(list_reservation20);
    reservation.ReservationManager reservationManager23 = new reservation.ReservationManager(list_reservation20);
    java.util.List<reservation.Reservation> list_reservation25 = reservationManager23.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager26 = new reservation.ReservationManager(list_reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation25);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager9.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.Room room19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = reservationManager16.makeReservation(room19, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation13);
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager15.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager15.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager20 = new reservation.ReservationManager(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager9.getReservationsByGuestName("");
    reservation.Room room20 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = reservationManager9.makeReservation(room20, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation23 = reservationManager13.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager24 = new reservation.ReservationManager(list_reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation23);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.Room room13 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = reservationManager12.makeReservation(room13, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager12.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.Room room16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = reservationManager7.makeReservation(room16, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager17.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation8);
    reservation.Room room13 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = reservationManager12.makeReservation(room13, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test28"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager8.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager8.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager8.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager8.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager19 = new reservation.ReservationManager(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager12.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager12.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    reservation.Room room11 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = reservationManager10.makeReservation(room11, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager13.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager8.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation12);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test34"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test35"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager6.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager11.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("");
    reservation.Room room19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = reservationManager16.makeReservation(room19, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test36"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager6.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test37"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager18 = new reservation.ReservationManager(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test38"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.Room room16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = reservationManager15.makeReservation(room16, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager15.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager15.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test41"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager8.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation6);
    reservation.Room room14 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = reservationManager13.makeReservation(room14, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager6.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager6.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager6.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager10.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation10);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation23 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager24 = new reservation.ReservationManager(list_reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation23);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test48"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager17.getReservationsByGuestName("hi!");
    reservation.Room room20 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = reservationManager17.makeReservation(room20, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager11.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager18 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager18.getReservationsByGuestName("");
    reservation.Room room21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = reservationManager18.makeReservation(room21, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test50"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager12.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation8);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test52"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager21 = new reservation.ReservationManager(list_reservation20);
    reservation.Room room22 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = reservationManager21.makeReservation(room22, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test53"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager3.getReservationsByGuestName("");
    reservation.Room room18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = reservationManager3.makeReservation(room18, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test54"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation23 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation25 = reservationManager13.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation25);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test55"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test56"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager7.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test57"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test58"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test59"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation8);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager12.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test60"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager3.getReservationsByGuestName("");
    reservation.Room room18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = reservationManager3.makeReservation(room18, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test61"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation8);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation8);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    reservation.Room room17 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = reservationManager16.makeReservation(room17, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test62"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager9.getReservationsByGuestName("");
    reservation.Room room20 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = reservationManager9.makeReservation(room20, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test63"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation13);
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager15.getReservationsByGuestName("");
    reservation.Room room18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = reservationManager15.makeReservation(room18, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test64"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test65"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test66"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    reservation.Room room12 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = reservationManager9.makeReservation(room12, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test67"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.Room room16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = reservationManager15.makeReservation(room16, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test68"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test69"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation9);
    reservation.Room room12 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = reservationManager11.makeReservation(room12, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test70"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation11);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test71"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager21 = new reservation.ReservationManager(list_reservation20);
    reservation.ReservationManager reservationManager22 = new reservation.ReservationManager(list_reservation20);
    reservation.ReservationManager reservationManager23 = new reservation.ReservationManager(list_reservation20);
    java.util.List<reservation.Reservation> list_reservation25 = reservationManager23.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation27 = reservationManager23.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager28 = new reservation.ReservationManager(list_reservation27);
    java.util.List<reservation.Reservation> list_reservation30 = reservationManager28.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation30);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test72"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    reservation.ReservationManager reservationManager18 = new reservation.ReservationManager(list_reservation16);
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager18.getReservationsByGuestName("");
    reservation.Room room21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = reservationManager18.makeReservation(room21, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test73"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation13);
    reservation.Room room16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = reservationManager15.makeReservation(room16, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test74"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager12.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test75"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation14);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test76"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager10.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager15.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager15.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test77"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager6.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager6.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager11.getReservationsByGuestName("");
    reservation.Room room16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = reservationManager11.makeReservation(room16, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test78"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager7.getReservationsByGuestName("");
    reservation.Room room18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = reservationManager7.makeReservation(room18, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test79"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager13.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager18 = new reservation.ReservationManager(list_reservation17);
    reservation.Room room19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = reservationManager18.makeReservation(room19, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test80"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager8.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation10);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test81"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation8);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    reservation.Room room13 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = reservationManager12.makeReservation(room13, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test82"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation13);
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager15.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager15.getReservationsByGuestName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test83"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager21 = new reservation.ReservationManager(list_reservation20);
    reservation.ReservationManager reservationManager22 = new reservation.ReservationManager(list_reservation20);
    reservation.ReservationManager reservationManager23 = new reservation.ReservationManager(list_reservation20);
    java.util.List<reservation.Reservation> list_reservation25 = reservationManager23.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation27 = reservationManager23.getReservationsByGuestName("");
    reservation.Room room28 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = reservationManager23.makeReservation(room28, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation27);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test84"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager14.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager14.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager21 = new reservation.ReservationManager(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test85"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager12.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test86"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation7);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation7);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager9.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager18 = new reservation.ReservationManager(list_reservation17);
    reservation.Room room19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = reservationManager18.makeReservation(room19, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test87"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation16);
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager17.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation21 = reservationManager17.getReservationsByGuestName("hi!");
    reservation.Room room22 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = reservationManager17.makeReservation(room22, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation21);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test88"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation9);
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager10.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation16 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager14.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation22 = reservationManager14.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation22);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test89"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    reservation.Room room19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = reservationManager16.makeReservation(room19, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test90"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager8 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager10 = new reservation.ReservationManager(list_reservation6);
    reservation.ReservationManager reservationManager11 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager11.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager11.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test91"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation7 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager3.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager3.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    reservation.ReservationManager reservationManager17 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager17.getReservationsByGuestName("hi!");
    reservation.Room room20 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = reservationManager17.makeReservation(room20, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test92"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager12 = new reservation.ReservationManager(list_reservation11);
    java.util.List<reservation.Reservation> list_reservation14 = reservationManager12.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation14);
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager15.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test93"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation15);
    java.util.List<reservation.Reservation> list_reservation18 = reservationManager16.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation20 = reservationManager16.getReservationsByGuestName("");
    reservation.Room room21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = reservationManager16.makeReservation(room21, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation20);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test94"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation5 = reservationManager3.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager6 = new reservation.ReservationManager(list_reservation5);
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation5);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.ReservationManager reservationManager15 = new reservation.ReservationManager(list_reservation13);
    reservation.ReservationManager reservationManager16 = new reservation.ReservationManager(list_reservation13);
    reservation.Room room17 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = reservationManager16.makeReservation(room17, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test95"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager9 = new reservation.ReservationManager(list_reservation8);
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager9.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager9.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager14 = new reservation.ReservationManager(list_reservation13);
    reservation.Room room15 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = reservationManager14.makeReservation(room15, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test96"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager7 = new reservation.ReservationManager(list_reservation6);
    java.util.List<reservation.Reservation> list_reservation9 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation11 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation13 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager7.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager7.getReservationsByGuestName("hi!");
    reservation.Room room18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = reservationManager7.makeReservation(room18, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test97"); }

    reservation.Reservation[] reservation_array0 = new reservation.Reservation[] {  };
    java.util.ArrayList<reservation.Reservation> arraylist_reservation1 = new java.util.ArrayList<reservation.Reservation>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Reservation>)arraylist_reservation1, reservation_array0);
    reservation.ReservationManager reservationManager3 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    reservation.ReservationManager reservationManager4 = new reservation.ReservationManager((java.util.List<reservation.Reservation>)arraylist_reservation1);
    java.util.List<reservation.Reservation> list_reservation6 = reservationManager4.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation8 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation10 = reservationManager4.getReservationsByGuestName("");
    java.util.List<reservation.Reservation> list_reservation12 = reservationManager4.getReservationsByGuestName("");
    reservation.ReservationManager reservationManager13 = new reservation.ReservationManager(list_reservation12);
    java.util.List<reservation.Reservation> list_reservation15 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation17 = reservationManager13.getReservationsByGuestName("hi!");
    java.util.List<reservation.Reservation> list_reservation19 = reservationManager13.getReservationsByGuestName("hi!");
    reservation.ReservationManager reservationManager20 = new reservation.ReservationManager(list_reservation19);
    java.util.List<reservation.Reservation> list_reservation22 = reservationManager20.getReservationsByGuestName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(reservation_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_reservation22);

  }

}
