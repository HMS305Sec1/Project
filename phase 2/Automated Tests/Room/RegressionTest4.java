
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str17 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

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
    room2.setReserved(true);
    int i19 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    room2.setReserved(false);
    int i15 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    boolean b15 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    int i15 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

    reservation.Room room2 = new reservation.Room(100, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

    reservation.Room room2 = new reservation.Room(97, "hi!");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b13 = room2.isReserved();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

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
    boolean b14 = room2.isReserved();
    java.lang.String str15 = room2.getRoomType();
    boolean b16 = room2.isReserved();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    
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

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
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
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

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
    int i14 = room2.getRoomId();
    boolean b15 = room2.isReserved();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    
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

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str18 = room2.getRoomType();
    boolean b19 = room2.isReserved();
    int i20 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(false);
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    java.lang.String str14 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    boolean b12 = room2.isReserved();
    
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
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

    reservation.Room room2 = new reservation.Room(1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    boolean b15 = room2.isReserved();
    room2.setReserved(true);
    int i18 = room2.getRoomId();
    java.lang.String str19 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    reservation.Room room2 = new reservation.Room(1, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

    reservation.Room room2 = new reservation.Room(0, "");
    room2.setReserved(false);
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str12 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

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
    room2.setReserved(true);
    
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

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    boolean b13 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

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
    java.lang.String str17 = room2.getRoomType();
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    reservation.Room room2 = new reservation.Room(32, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

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
    room2.setReserved(true);
    boolean b19 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    room2.setReserved(true);
    boolean b16 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str16 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(true);
    int i10 = room2.getRoomId();
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    int i14 = room2.getRoomId();
    boolean b15 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

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
    boolean b13 = room2.isReserved();
    boolean b14 = room2.isReserved();
    int i15 = room2.getRoomId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    room2.setReserved(false);
    int i15 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    java.lang.String str13 = room2.getRoomType();
    java.lang.String str14 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(false);
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    reservation.Room room2 = new reservation.Room(100, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

    reservation.Room room2 = new reservation.Room((int)' ', "hi!");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    java.lang.String str12 = room2.getRoomType();
    java.lang.String str13 = room2.getRoomType();
    boolean b14 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str17 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str20 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

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
    java.lang.String str12 = room2.getRoomType();
    boolean b13 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }

    reservation.Room room2 = new reservation.Room(35, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
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
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(false);
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }

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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }

    reservation.Room room2 = new reservation.Room((int)'#', "");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    boolean b15 = room2.isReserved();
    room2.setReserved(true);
    int i18 = room2.getRoomId();
    int i19 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    room2.setReserved(false);
    int i14 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }

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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    java.lang.String str12 = room2.getRoomType();
    int i13 = room2.getRoomId();
    int i14 = room2.getRoomId();
    boolean b15 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str11 = room2.getRoomType();
    room2.setReserved(false);
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    room2.setReserved(false);
    boolean b10 = room2.isReserved();
    int i11 = room2.getRoomId();
    boolean b12 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }

    reservation.Room room2 = new reservation.Room(35, "hi!");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    room2.setReserved(true);
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    int i11 = room2.getRoomId();
    java.lang.String str12 = room2.getRoomType();
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b19 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(false);
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    boolean b14 = room2.isReserved();
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }

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
    room2.setReserved(true);
    boolean b15 = room2.isReserved();
    room2.setReserved(false);
    int i18 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(true);
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }

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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }

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
    java.lang.String str15 = room2.getRoomType();
    java.lang.String str16 = room2.getRoomType();
    room2.setReserved(false);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    boolean b13 = room2.isReserved();
    room2.setReserved(false);
    boolean b16 = room2.isReserved();
    java.lang.String str17 = room2.getRoomType();
    boolean b18 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    boolean b12 = room2.isReserved();
    int i13 = room2.getRoomId();
    room2.setReserved(true);
    boolean b16 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    boolean b9 = room2.isReserved();
    room2.setReserved(false);
    room2.setReserved(true);
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    room2.setReserved(false);
    room2.setReserved(false);
    boolean b15 = room2.isReserved();
    boolean b16 = room2.isReserved();
    boolean b17 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }

    reservation.Room room2 = new reservation.Room(0, "");
    int i3 = room2.getRoomId();
    room2.setReserved(true);
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    int i12 = room2.getRoomId();
    boolean b13 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    int i8 = room2.getRoomId();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    int i13 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }

    reservation.Room room2 = new reservation.Room((int)(byte)0, "");
    java.lang.String str3 = room2.getRoomType();
    room2.setReserved(false);
    int i6 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    java.lang.String str13 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    int i4 = room2.getRoomId();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    room2.setReserved(true);
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
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
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    int i7 = room2.getRoomId();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    room2.setReserved(false);
    int i15 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }

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
    boolean b15 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    boolean b11 = room2.isReserved();
    room2.setReserved(false);
    java.lang.String str14 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    room2.setReserved(false);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }

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
    java.lang.String str14 = room2.getRoomType();
    boolean b15 = room2.isReserved();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    boolean b3 = room2.isReserved();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
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
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    boolean b9 = room2.isReserved();
    java.lang.String str10 = room2.getRoomType();
    int i11 = room2.getRoomId();
    room2.setReserved(true);
    int i14 = room2.getRoomId();
    java.lang.String str15 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    room2.setReserved(false);
    boolean b11 = room2.isReserved();
    room2.setReserved(true);
    boolean b14 = room2.isReserved();
    room2.setReserved(false);
    int i17 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }

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
    int i15 = room2.getRoomId();
    int i16 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }

    reservation.Room room2 = new reservation.Room((int)(short)-1, "");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    room2.setReserved(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }

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
    boolean b12 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }

    reservation.Room room2 = new reservation.Room(10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }

    reservation.Room room2 = new reservation.Room((int)'4', "hi!");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    room2.setReserved(true);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    room2.setReserved(false);
    int i7 = room2.getRoomId();
    boolean b8 = room2.isReserved();
    java.lang.String str9 = room2.getRoomType();
    int i10 = room2.getRoomId();
    room2.setReserved(false);
    boolean b13 = room2.isReserved();
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
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    java.lang.String str3 = room2.getRoomType();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }

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
    room2.setReserved(true);
    
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

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }

    reservation.Room room2 = new reservation.Room((int)(byte)1, "");
    boolean b3 = room2.isReserved();
    int i4 = room2.getRoomId();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    int i8 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }

    reservation.Room room2 = new reservation.Room((int)(short)100, "hi!");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "hi!");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    java.lang.String str7 = room2.getRoomType();
    int i8 = room2.getRoomId();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    room2.setReserved(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }

    reservation.Room room2 = new reservation.Room(0, "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    room2.setReserved(true);
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    room2.setReserved(true);
    boolean b11 = room2.isReserved();
    int i12 = room2.getRoomId();
    int i13 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }

    reservation.Room room2 = new reservation.Room((int)(short)1, "hi!");
    room2.setReserved(true);
    boolean b5 = room2.isReserved();
    room2.setReserved(false);
    int i8 = room2.getRoomId();
    int i9 = room2.getRoomId();
    java.lang.String str10 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }

    reservation.Room room2 = new reservation.Room(0, "");
    boolean b3 = room2.isReserved();
    room2.setReserved(true);
    room2.setReserved(true);
    boolean b8 = room2.isReserved();
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    boolean b7 = room2.isReserved();
    java.lang.String str8 = room2.getRoomType();
    java.lang.String str9 = room2.getRoomType();
    boolean b10 = room2.isReserved();
    java.lang.String str11 = room2.getRoomType();
    boolean b12 = room2.isReserved();
    
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }

    reservation.Room room2 = new reservation.Room((int)(short)0, "hi!");
    room2.setReserved(true);
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(true);
    int i9 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    int i6 = room2.getRoomId();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    room2.setReserved(true);
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
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    int i5 = room2.getRoomId();
    java.lang.String str6 = room2.getRoomType();
    room2.setReserved(false);
    int i9 = room2.getRoomId();
    int i10 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }

    reservation.Room room2 = new reservation.Room((-1), "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    boolean b6 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }

    reservation.Room room2 = new reservation.Room((int)(byte)100, "");
    int i3 = room2.getRoomId();
    java.lang.String str4 = room2.getRoomType();
    int i5 = room2.getRoomId();
    int i6 = room2.getRoomId();
    boolean b7 = room2.isReserved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }

    reservation.Room room2 = new reservation.Room((int)(short)10, "");
    room2.setReserved(true);
    int i5 = room2.getRoomId();
    room2.setReserved(true);
    int i8 = room2.getRoomId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }

    reservation.Room room2 = new reservation.Room(0, "hi!");
    java.lang.String str3 = room2.getRoomType();
    java.lang.String str4 = room2.getRoomType();
    java.lang.String str5 = room2.getRoomType();
    java.lang.String str6 = room2.getRoomType();
    java.lang.String str7 = room2.getRoomType();
    java.lang.String str8 = room2.getRoomType();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }

    reservation.Room room2 = new reservation.Room((int)' ', "");
    java.lang.String str3 = room2.getRoomType();
    int i4 = room2.getRoomId();
    boolean b5 = room2.isReserved();
    java.lang.String str6 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "hi!");
    boolean b3 = room2.isReserved();
    boolean b4 = room2.isReserved();
    java.lang.String str5 = room2.getRoomType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }

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
    boolean b18 = room2.isReserved();
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }

    reservation.Room room2 = new reservation.Room((int)(byte)10, "");
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }

    reservation.Room room2 = new reservation.Room((int)(byte)-1, "");
    int i3 = room2.getRoomId();
    boolean b4 = room2.isReserved();
    boolean b5 = room2.isReserved();
    boolean b6 = room2.isReserved();
    boolean b7 = room2.isReserved();
    boolean b8 = room2.isReserved();
    boolean b9 = room2.isReserved();
    int i10 = room2.getRoomId();
    int i11 = room2.getRoomId();
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
    org.junit.Assert.assertTrue(b7 == false);
    
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
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }

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
    int i18 = room2.getRoomId();
    
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
    org.junit.Assert.assertTrue(i18 == 0);

  }

}
