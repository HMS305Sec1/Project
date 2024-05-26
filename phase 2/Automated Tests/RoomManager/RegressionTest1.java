
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager6.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.Room room9 = roomManager6.searchRoom("");
    reservation.Room room11 = roomManager6.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager6.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager3.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.Room room14 = roomManager12.searchRoom("hi!");
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    reservation.Room room18 = roomManager12.searchRoom("hi!");
    reservation.Room room20 = roomManager12.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.Room room15 = roomManager13.searchRoom("");
    java.util.List<reservation.Room> list_room16 = roomManager13.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager8 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager9 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room11 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    reservation.Room room14 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room8);
    reservation.Room room14 = roomManager12.searchRoom("");
    reservation.Room room16 = roomManager12.searchRoom("");
    reservation.Room room18 = roomManager12.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager8 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager9 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.Room room9 = roomManager6.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager6.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager11.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager6.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.Room room18 = roomManager9.searchRoom("");
    reservation.Room room20 = roomManager9.searchRoom("");
    reservation.Room room22 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room23 = roomManager9.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room23);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager10.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.Room room13 = roomManager10.searchRoom("");
    java.util.List<reservation.Room> list_room14 = roomManager10.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    reservation.Room room6 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.Room room10 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.Room room11 = roomManager9.searchRoom("hi!");
    reservation.Room room13 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room14 = roomManager9.getRooms();
    reservation.Room room16 = roomManager9.searchRoom("");
    reservation.Room room18 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager7.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager11.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    reservation.Room room9 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    reservation.Room room6 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.Room room12 = roomManager10.searchRoom("hi!");
    java.util.List<reservation.Room> list_room13 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager10.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("");
    reservation.Room room10 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    reservation.Room room13 = roomManager3.searchRoom("");
    reservation.Room room15 = roomManager3.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room5 = roomManager3.searchRoom("");
    reservation.Room room7 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room8);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager13.getRooms();
    reservation.Room room18 = roomManager13.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.Room room11 = roomManager9.searchRoom("");
    reservation.Room room13 = roomManager9.searchRoom("");
    reservation.Room room15 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager9.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.Room room9 = roomManager6.searchRoom("");
    reservation.Room room11 = roomManager6.searchRoom("");
    reservation.Room room13 = roomManager6.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager11.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager11.getRooms();
    reservation.Room room16 = roomManager11.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager3.getRooms();
    reservation.Room room14 = roomManager3.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.Room room13 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager4.getRooms();
    reservation.Room room16 = roomManager4.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.Room room13 = roomManager11.searchRoom("");
    reservation.Room room15 = roomManager11.searchRoom("");
    reservation.Room room17 = roomManager11.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.Room room12 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room13 = roomManager4.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager4.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.Room room11 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager9.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room15 = roomManager14.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    java.util.List<reservation.Room> list_room17 = roomManager16.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    reservation.Room room12 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager4.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.Room room13 = roomManager11.searchRoom("");
    reservation.Room room15 = roomManager11.searchRoom("");
    java.util.List<reservation.Room> list_room16 = roomManager11.getRooms();
    reservation.Room room18 = roomManager11.searchRoom("");
    java.util.List<reservation.Room> list_room19 = roomManager11.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room12);
    java.util.List<reservation.Room> list_room17 = roomManager16.getRooms();
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room17);
    reservation.RoomManager roomManager19 = new reservation.RoomManager(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.Room room10 = roomManager8.searchRoom("");
    reservation.Room room12 = roomManager8.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.Room room13 = roomManager11.searchRoom("hi!");
    reservation.Room room15 = roomManager11.searchRoom("");
    java.util.List<reservation.Room> list_room16 = roomManager11.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager8 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager9 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room16);
    reservation.RoomManager roomManager19 = new reservation.RoomManager(list_room16);
    reservation.RoomManager roomManager20 = new reservation.RoomManager(list_room16);
    reservation.Room room22 = roomManager20.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room22);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.Room room9 = roomManager7.searchRoom("");
    reservation.Room room11 = roomManager7.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager7.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    java.util.List<reservation.Room> list_room18 = roomManager17.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room12);
    java.util.List<reservation.Room> list_room15 = roomManager14.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room15);
    java.util.List<reservation.Room> list_room18 = roomManager17.getRooms();
    reservation.Room room20 = roomManager17.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    reservation.Room room12 = roomManager4.searchRoom("");
    reservation.Room room14 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager4.getRooms();
    reservation.Room room17 = roomManager4.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager3.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    reservation.Room room13 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager4.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.Room room7 = roomManager4.searchRoom("");
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    reservation.Room room13 = roomManager4.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room11);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager13.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    java.util.List<reservation.Room> list_room18 = roomManager17.getRooms();
    reservation.Room room20 = roomManager17.searchRoom("");
    java.util.List<reservation.Room> list_room21 = roomManager17.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room21);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager6.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.Room room11 = roomManager9.searchRoom("");
    reservation.Room room13 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.Room room15 = roomManager12.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room13);
    reservation.Room room18 = roomManager16.searchRoom("hi!");
    java.util.List<reservation.Room> list_room19 = roomManager16.getRooms();
    reservation.Room room21 = roomManager16.searchRoom("");
    java.util.List<reservation.Room> list_room22 = roomManager16.getRooms();
    java.util.List<reservation.Room> list_room23 = roomManager16.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room23);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    reservation.Room room13 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager4.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    java.util.List<reservation.Room> list_room17 = roomManager16.getRooms();
    reservation.Room room19 = roomManager16.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    reservation.Room room9 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.Room room13 = roomManager11.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager11.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    reservation.Room room16 = roomManager9.searchRoom("");
    reservation.Room room18 = roomManager9.searchRoom("");
    reservation.Room room20 = roomManager9.searchRoom("hi!");
    reservation.Room room22 = roomManager9.searchRoom("");
    reservation.Room room24 = roomManager9.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room24);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.Room room15 = roomManager12.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    java.util.List<reservation.Room> list_room17 = roomManager16.getRooms();
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    reservation.Room room13 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager4.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    reservation.Room room18 = roomManager15.searchRoom("");
    reservation.Room room20 = roomManager15.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager15.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    reservation.Room room16 = roomManager12.searchRoom("");
    reservation.Room room18 = roomManager12.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    reservation.Room room14 = roomManager11.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    reservation.Room room10 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager3.getRooms();
    reservation.Room room14 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room15 = roomManager3.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room14 = roomManager13.getRooms();
    reservation.Room room16 = roomManager13.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.Room room9 = roomManager6.searchRoom("");
    reservation.Room room11 = roomManager6.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager6.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    reservation.Room room14 = roomManager4.searchRoom("");
    reservation.Room room16 = roomManager4.searchRoom("hi!");
    reservation.Room room18 = roomManager4.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.Room room10 = roomManager8.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager8.getRooms();
    reservation.Room room13 = roomManager8.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager8.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room5);
    reservation.Room room11 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager9.getRooms();
    reservation.Room room15 = roomManager9.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.Room room10 = roomManager8.searchRoom("");
    java.util.List<reservation.Room> list_room11 = roomManager8.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    reservation.RoomManager roomManager5 = new reservation.RoomManager(list_room4);
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room4);
    reservation.Room room8 = roomManager6.searchRoom("hi!");
    reservation.Room room10 = roomManager6.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.Room room13 = roomManager11.searchRoom("hi!");
    reservation.Room room15 = roomManager11.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.Room room15 = roomManager12.searchRoom("");
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager10.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.Room room16 = roomManager14.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room14);
    reservation.Room room18 = roomManager16.searchRoom("");
    java.util.List<reservation.Room> list_room19 = roomManager16.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room11);
    reservation.Room room16 = roomManager14.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.Room room18 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room19 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room20 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room21 = roomManager9.getRooms();
    reservation.Room room23 = roomManager9.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room23);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room5 = roomManager3.searchRoom("");
    reservation.Room room7 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room8);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    reservation.Room room17 = roomManager13.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room6);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager7.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room15);
    reservation.Room room19 = roomManager17.searchRoom("");
    reservation.Room room21 = roomManager17.searchRoom("");
    java.util.List<reservation.Room> list_room22 = roomManager17.getRooms();
    reservation.RoomManager roomManager23 = new reservation.RoomManager(list_room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room22);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.Room room16 = roomManager14.searchRoom("");
    java.util.List<reservation.Room> list_room17 = roomManager14.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.Room room7 = roomManager4.searchRoom("");
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    reservation.Room room19 = roomManager17.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.Room room15 = roomManager12.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager12.getRooms();
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    reservation.Room room17 = roomManager12.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    reservation.RoomManager roomManager5 = new reservation.RoomManager(list_room4);
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room4);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room4);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.Room room10 = roomManager7.searchRoom("");
    reservation.Room room12 = roomManager7.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager7.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room15 = roomManager14.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    java.util.List<reservation.Room> list_room17 = roomManager16.getRooms();
    reservation.Room room19 = roomManager16.searchRoom("hi!");
    java.util.List<reservation.Room> list_room20 = roomManager16.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room12);
    reservation.Room room16 = roomManager14.searchRoom("");
    reservation.Room room18 = roomManager14.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    reservation.Room room13 = roomManager4.searchRoom("hi!");
    reservation.Room room15 = roomManager4.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.Room room10 = roomManager8.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager8.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.Room room15 = roomManager12.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room6 = roomManager5.getRooms();
    reservation.Room room8 = roomManager5.searchRoom("");
    reservation.Room room10 = roomManager5.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager5.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager5.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room12);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager7.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    reservation.Room room10 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    reservation.Room room13 = roomManager3.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    reservation.Room room17 = roomManager9.searchRoom("");
    reservation.Room room19 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room6 = roomManager5.getRooms();
    reservation.Room room8 = roomManager5.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager5.getRooms();
    reservation.Room room11 = roomManager5.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.Room room13 = roomManager11.searchRoom("hi!");
    reservation.Room room15 = roomManager11.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager11.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager11.getRooms();
    java.util.List<reservation.Room> list_room18 = roomManager11.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room12 = roomManager11.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    java.util.List<reservation.Room> list_room14 = roomManager13.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room14);
    java.util.List<reservation.Room> list_room17 = roomManager16.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager4.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room14);
    reservation.Room room18 = roomManager16.searchRoom("");
    reservation.Room room20 = roomManager16.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager9.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    reservation.Room room17 = roomManager9.searchRoom("hi!");
    java.util.List<reservation.Room> list_room18 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room19 = roomManager9.getRooms();
    reservation.RoomManager roomManager20 = new reservation.RoomManager(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.Room room11 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager9.getRooms();
    reservation.Room room15 = roomManager9.searchRoom("hi!");
    reservation.Room room17 = roomManager9.searchRoom("hi!");
    java.util.List<reservation.Room> list_room18 = roomManager9.getRooms();
    reservation.RoomManager roomManager19 = new reservation.RoomManager(list_room18);
    java.util.List<reservation.Room> list_room20 = roomManager19.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.Room room10 = roomManager7.searchRoom("");
    reservation.Room room12 = roomManager7.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager7.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room18 = roomManager17.getRooms();
    reservation.Room room20 = roomManager17.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    reservation.Room room17 = roomManager9.searchRoom("hi!");
    java.util.List<reservation.Room> list_room18 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room19 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room20 = roomManager9.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room7);
    reservation.Room room12 = roomManager10.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    reservation.Room room12 = roomManager4.searchRoom("");
    reservation.Room room14 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room15 = roomManager4.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room15 = roomManager14.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager14.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    java.util.List<reservation.Room> list_room18 = roomManager17.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    reservation.Room room9 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager3.getRooms();
    reservation.Room room14 = roomManager3.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.Room room11 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    reservation.Room room14 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager4.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    java.util.List<reservation.Room> list_room14 = roomManager13.getRooms();
    reservation.Room room16 = roomManager13.searchRoom("");
    reservation.Room room18 = roomManager13.searchRoom("hi!");
    java.util.List<reservation.Room> list_room19 = roomManager13.getRooms();
    java.util.List<reservation.Room> list_room20 = roomManager13.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.Room room10 = roomManager8.searchRoom("");
    java.util.List<reservation.Room> list_room11 = roomManager8.getRooms();
    reservation.Room room13 = roomManager8.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room5);
    reservation.Room room11 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager9.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room15 = roomManager14.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    reservation.Room room6 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.Room room10 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    reservation.Room room13 = roomManager3.searchRoom("hi!");
    reservation.Room room15 = roomManager3.searchRoom("");
    reservation.Room room17 = roomManager3.searchRoom("hi!");
    reservation.Room room19 = roomManager3.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.Room room9 = roomManager6.searchRoom("hi!");
    reservation.Room room11 = roomManager6.searchRoom("hi!");
    java.util.List<reservation.Room> list_room12 = roomManager6.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager13.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager13.getRooms();
    reservation.Room room19 = roomManager13.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room11 = roomManager4.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    reservation.Room room17 = roomManager12.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.Room room14 = roomManager12.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    java.util.List<reservation.Room> list_room9 = roomManager8.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.Room room13 = roomManager11.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.Room room12 = roomManager4.searchRoom("");
    reservation.Room room14 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room18 = roomManager4.getRooms();
    reservation.Room room20 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room21 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room22 = roomManager4.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room22);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room5 = roomManager3.searchRoom("");
    reservation.Room room7 = roomManager3.searchRoom("hi!");
    reservation.Room room9 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room10);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    java.util.List<reservation.Room> list_room9 = roomManager8.getRooms();
    reservation.Room room11 = roomManager8.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    reservation.Room room9 = roomManager3.searchRoom("");
    reservation.Room room11 = roomManager3.searchRoom("");
    reservation.Room room13 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager3.getRooms();
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room14);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room5 = roomManager3.searchRoom("");
    reservation.Room room7 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.Room room10 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room11 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager3.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room7 = roomManager6.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room5 = roomManager3.searchRoom("");
    reservation.Room room7 = roomManager3.searchRoom("hi!");
    reservation.Room room9 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room16);
    reservation.Room room20 = roomManager18.searchRoom("");
    java.util.List<reservation.Room> list_room21 = roomManager18.getRooms();
    reservation.RoomManager roomManager22 = new reservation.RoomManager(list_room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room21);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room5 = roomManager3.searchRoom("");
    reservation.Room room7 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room8 = roomManager3.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room14 = roomManager13.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager13.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager13.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager13.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    reservation.Room room16 = roomManager9.searchRoom("");
    reservation.Room room18 = roomManager9.searchRoom("");
    reservation.Room room20 = roomManager9.searchRoom("hi!");
    reservation.Room room22 = roomManager9.searchRoom("hi!");
    reservation.Room room24 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room24);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    reservation.Room room19 = roomManager17.searchRoom("");
    reservation.Room room21 = roomManager17.searchRoom("hi!");
    reservation.Room room23 = roomManager17.searchRoom("");
    reservation.Room room25 = roomManager17.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room25);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    reservation.Room room8 = roomManager3.searchRoom("hi!");
    java.util.List<reservation.Room> list_room9 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room17 = roomManager12.getRooms();
    reservation.RoomManager roomManager18 = new reservation.RoomManager(list_room17);
    java.util.List<reservation.Room> list_room19 = roomManager18.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room5);
    reservation.Room room12 = roomManager10.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager10.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    java.util.List<reservation.Room> list_room16 = roomManager15.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.Room room10 = roomManager7.searchRoom("");
    reservation.Room room12 = roomManager7.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager7.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.Room room10 = roomManager7.searchRoom("");
    reservation.Room room12 = roomManager7.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager7.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.Room room16 = roomManager14.searchRoom("");
    reservation.Room room18 = roomManager14.searchRoom("");
    reservation.Room room20 = roomManager14.searchRoom("hi!");
    reservation.Room room22 = roomManager14.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room22);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    reservation.Room room6 = roomManager3.searchRoom("hi!");
    reservation.Room room8 = roomManager3.searchRoom("");
    reservation.Room room10 = roomManager3.searchRoom("");
    reservation.Room room12 = roomManager3.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room5);
    reservation.Room room10 = roomManager8.searchRoom("");
    java.util.List<reservation.Room> list_room11 = roomManager8.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.Room room14 = roomManager12.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager6 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager7 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room8 = roomManager7.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    reservation.Room room12 = roomManager10.searchRoom("hi!");
    reservation.Room room14 = roomManager10.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager10.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.Room room9 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room10 = roomManager4.getRooms();
    reservation.Room room12 = roomManager4.searchRoom("");
    reservation.Room room14 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager4.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    reservation.Room room12 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room13 = roomManager4.getRooms();
    reservation.Room room15 = roomManager4.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.Room room18 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room19 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room20 = roomManager9.getRooms();
    reservation.RoomManager roomManager21 = new reservation.RoomManager(list_room20);
    java.util.List<reservation.Room> list_room22 = roomManager21.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room22);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    reservation.RoomManager roomManager6 = new reservation.RoomManager(list_room5);
    reservation.RoomManager roomManager7 = new reservation.RoomManager(list_room5);
    reservation.Room room9 = roomManager7.searchRoom("");
    reservation.Room room11 = roomManager7.searchRoom("");
    java.util.List<reservation.Room> list_room12 = roomManager7.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager7.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager9.getRooms();
    reservation.Room room18 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room19 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room20 = roomManager9.getRooms();
    reservation.RoomManager roomManager21 = new reservation.RoomManager(list_room20);
    reservation.Room room23 = roomManager21.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room23);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager5 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room6 = roomManager5.getRooms();
    reservation.Room room8 = roomManager5.searchRoom("");
    reservation.Room room10 = roomManager5.searchRoom("hi!");
    java.util.List<reservation.Room> list_room11 = roomManager5.getRooms();
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room11);
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room11);
    reservation.Room room15 = roomManager13.searchRoom("hi!");
    java.util.List<reservation.Room> list_room16 = roomManager13.getRooms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    reservation.Room room14 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room15 = roomManager9.getRooms();
    reservation.Room room17 = roomManager9.searchRoom("hi!");
    java.util.List<reservation.Room> list_room18 = roomManager9.getRooms();
    reservation.Room room20 = roomManager9.searchRoom("");
    java.util.List<reservation.Room> list_room21 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room22 = roomManager9.getRooms();
    java.util.List<reservation.Room> list_room23 = roomManager9.getRooms();
    reservation.Room room25 = roomManager9.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room25);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.Room room11 = roomManager4.searchRoom("hi!");
    reservation.Room room13 = roomManager4.searchRoom("hi!");
    java.util.List<reservation.Room> list_room14 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager4.getRooms();
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room15);
    reservation.Room room18 = roomManager16.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room4 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room5 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager3.getRooms();
    java.util.List<reservation.Room> list_room7 = roomManager3.getRooms();
    reservation.Room room9 = roomManager3.searchRoom("");
    java.util.List<reservation.Room> list_room10 = roomManager3.getRooms();
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room10);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room10);
    reservation.Room room14 = roomManager12.searchRoom("");
    reservation.Room room16 = roomManager12.searchRoom("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    reservation.RoomManager roomManager8 = new reservation.RoomManager(list_room7);
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room7);
    java.util.List<reservation.Room> list_room10 = roomManager9.getRooms();
    reservation.Room room12 = roomManager9.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    reservation.Room room8 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager10.getRooms();
    reservation.RoomManager roomManager13 = new reservation.RoomManager(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room14 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room15 = roomManager12.getRooms();
    java.util.List<reservation.Room> list_room16 = roomManager12.getRooms();
    reservation.RoomManager roomManager17 = new reservation.RoomManager(list_room16);
    java.util.List<reservation.Room> list_room18 = roomManager17.getRooms();
    java.util.List<reservation.Room> list_room19 = roomManager17.getRooms();
    reservation.RoomManager roomManager20 = new reservation.RoomManager(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room9 = roomManager4.getRooms();
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager11 = new reservation.RoomManager(list_room9);
    reservation.RoomManager roomManager12 = new reservation.RoomManager(list_room9);
    java.util.List<reservation.Room> list_room13 = roomManager12.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager16 = new reservation.RoomManager(list_room13);
    reservation.Room room18 = roomManager16.searchRoom("hi!");
    java.util.List<reservation.Room> list_room19 = roomManager16.getRooms();
    reservation.Room room21 = roomManager16.searchRoom("");
    java.util.List<reservation.Room> list_room22 = roomManager16.getRooms();
    reservation.Room room24 = roomManager16.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room24);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    java.util.List<reservation.Room> list_room5 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room6 = roomManager4.getRooms();
    reservation.Room room8 = roomManager4.searchRoom("hi!");
    reservation.Room room10 = roomManager4.searchRoom("hi!");
    reservation.Room room12 = roomManager4.searchRoom("");
    reservation.Room room14 = roomManager4.searchRoom("");
    reservation.Room room16 = roomManager4.searchRoom("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room16);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    reservation.Room[] room_array0 = new reservation.Room[] {  };
    java.util.ArrayList<reservation.Room> arraylist_room1 = new java.util.ArrayList<reservation.Room>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<reservation.Room>)arraylist_room1, room_array0);
    reservation.RoomManager roomManager3 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.RoomManager roomManager4 = new reservation.RoomManager((java.util.List<reservation.Room>)arraylist_room1);
    reservation.Room room6 = roomManager4.searchRoom("");
    java.util.List<reservation.Room> list_room7 = roomManager4.getRooms();
    java.util.List<reservation.Room> list_room8 = roomManager4.getRooms();
    reservation.RoomManager roomManager9 = new reservation.RoomManager(list_room8);
    reservation.RoomManager roomManager10 = new reservation.RoomManager(list_room8);
    java.util.List<reservation.Room> list_room11 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room12 = roomManager10.getRooms();
    java.util.List<reservation.Room> list_room13 = roomManager10.getRooms();
    reservation.RoomManager roomManager14 = new reservation.RoomManager(list_room13);
    reservation.RoomManager roomManager15 = new reservation.RoomManager(list_room13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(room_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(room6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_room13);

  }

}
