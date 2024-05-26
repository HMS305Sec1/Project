
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    reservation.Room room2 = new reservation.Room(52, "");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    boolean b15 = room2.isReserved();
    boolean b16 = room2.isReserved();
    boolean b17 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str13 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    reservation.Room room2 = new reservation.Room(35, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i14 = room2.getRoomId();
    int i15 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b16 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    int i15 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    room2.setReserved(true);
    room2.setReserved(true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b16 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    boolean b6 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    reservation.Room room2 = new reservation.Room(100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "hi!");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    room2.setReserved(true);
    boolean b15 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

    reservation.Room room2 = new reservation.Room((int)'#', "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "hi!");
    boolean b3 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    boolean b13 = room2.isReserved();
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b19 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    int i12 = room2.getRoomId();
    room2.setReserved(true);
    int i15 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    boolean b15 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    reservation.Room room2 = new reservation.Room((int)'#', "");
    room2.setReserved(false);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    boolean b13 = room2.isReserved();
    int i14 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str17 = room2.getRoomType();
    java.lang.String str18 = room2.getRoomType();
    java.lang.String str19 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str17 = room2.getRoomType();
    int i18 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str14 = room2.getRoomType();
    int i15 = room2.getRoomId();
    boolean b16 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "");
    room2.setReserved(false);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    java.lang.String str14 = room2.getRoomType();
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    int i16 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    boolean b14 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }

    reservation.Room room2 = new reservation.Room(100, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }

    reservation.Room room2 = new reservation.Room(1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b15 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }

    reservation.Room room2 = new reservation.Room((int)'4', "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    boolean b13 = room2.isReserved();
    int i14 = room2.getRoomId();
    boolean b15 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }

    reservation.Room room2 = new reservation.Room((int)' ', "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str16 = room2.getRoomType();
    java.lang.String str17 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str14 = room2.getRoomType();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i14 = room2.getRoomId();
    boolean b15 = room2.isReserved();
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    int i15 = room2.getRoomId();
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }

    reservation.Room room2 = new reservation.Room(35, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str14 = room2.getRoomType();
    boolean b15 = room2.isReserved();
    boolean b16 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    int i12 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    room2.setReserved(false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }

    reservation.Room room2 = new reservation.Room(100, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }

    reservation.Room room2 = new reservation.Room(52, "");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str13 = room2.getRoomType();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    java.lang.String str15 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
    boolean b15 = room2.isReserved();
    java.lang.String str16 = room2.getRoomType();
    java.lang.String str17 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b13 = room2.isReserved();
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    boolean b15 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    java.lang.String str14 = room2.getRoomType();
    java.lang.String str15 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str18 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    int i14 = room2.getRoomId();
    int i15 = room2.getRoomId();
    java.lang.String str16 = room2.getRoomType();
    room2.setReserved(false);
    boolean b19 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }

    reservation.Room room2 = new reservation.Room(52, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }

    reservation.Room room2 = new reservation.Room((int)'#', "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    java.lang.String str17 = room2.getRoomType();
    java.lang.String str18 = room2.getRoomType();
    int i19 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str16 = room2.getRoomType();
    int i17 = room2.getRoomId();
    boolean b18 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str21 = room2.getRoomType();
    java.lang.String str22 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    boolean b14 = room2.isReserved();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str16 = room2.getRoomType();
    boolean b17 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str13 = room2.getRoomType();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }

    reservation.Room room2 = new reservation.Room((-1), "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(false);
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b12 = room2.isReserved();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b13 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }

    reservation.Room room2 = new reservation.Room((int)'#', "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }

    reservation.Room room2 = new reservation.Room((int)'#', "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "");
    int i3 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }

    reservation.Room room2 = new reservation.Room(1, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }

    reservation.Room room2 = new reservation.Room((int)' ', "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    room2.setReserved(true);
    int i15 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    java.lang.String str16 = room2.getRoomType();
    int i17 = room2.getRoomId();
    boolean b18 = room2.isReserved();
    java.lang.String str19 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    boolean b14 = room2.isReserved();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    boolean b13 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    int i14 = room2.getRoomId();
    int i15 = room2.getRoomId();
    int i16 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }

    reservation.Room room2 = new reservation.Room(100, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }

    reservation.Room room2 = new reservation.Room(52, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    java.lang.String str13 = room2.getRoomType();
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    java.lang.String str13 = room2.getRoomType();
    int i14 = room2.getRoomId();
    room2.setReserved(false);
    int i17 = room2.getRoomId();
    boolean b18 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    room2.setReserved(false);
    boolean b18 = room2.isReserved();
    java.lang.String str19 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }

    reservation.Room room2 = new reservation.Room(100, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    room2.setReserved(false);
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b13 = room2.isReserved();
    room2.setReserved(false);
    int i16 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str16 = room2.getRoomType();
    boolean b17 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    java.lang.String str14 = room2.getRoomType();
    int i15 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    java.lang.String str17 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    java.lang.String str17 = room2.getRoomType();
    java.lang.String str18 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    boolean b13 = room2.isReserved();
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    boolean b13 = room2.isReserved();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    int i14 = room2.getRoomId();
    boolean b15 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

}
