package org.cis120;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 * 
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     * 
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    /* ADD YOUR OWN TESTS BELOW */
    @Test
    public void testConstructArrayShorterThan3() {
        int[] arr = { 10, 20 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    public void testConstructNegativeElement() {
        int[] arr = { -10, 20, 30 };
        Pixel p = new Pixel(arr);
        assertEquals(0, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    @Test
    public void testConstructOutofBounds() {
        Pixel p = new Pixel(440, 50, 60);
        assertEquals(255, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testDistanceSamePixel() {
        Pixel p1 = new Pixel(40, 50, 60);
        Pixel p2 = new Pixel(40, 50, 60);
        assertEquals(0, p1.distance(p2));

    }

    @Test
    public void testDistanceDifferentPixel() {
        Pixel p1 = new Pixel(40, 50, 60);
        Pixel p2 = new Pixel(30, 40, 60);
        assertEquals(20, p1.distance(p2));

    }

    @Test
    public void testToString() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals("(40, 50, 60)", p.toString());
    }

    @Test
    public void testEqualsSamePixel() {
        Pixel p1 = new Pixel(40, 50, 60);
        Pixel p2 = new Pixel(40, 50, 60);
        assertArrayEquals(p1.getComponents(), p2.getComponents());

    }

    @Test
    public void testEqualsDifferentPixel() {
        Pixel p1 = new Pixel(40, 50, 60);
        Pixel p2 = new Pixel(30, 40, 60);
        assertFalse(p1.equals(p2));

    }

}
