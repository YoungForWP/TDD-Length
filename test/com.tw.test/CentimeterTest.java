package com.tw.test;

import com.tw.Centimeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CentimeterTest {
    @Test
    public void one_centimeter_equals_one_centimeter() throws Exception {
        assertEquals(new Centimeter(1), new Centimeter(1));
        assertEquals(new Centimeter(1.0), new Centimeter(1.0));
    }

    @Test
    public void one_centimeter_not_equals_two_centimeter() throws Exception {
        assertNotEquals(new Centimeter(1), new Centimeter(2));
        assertNotEquals(new Centimeter(1.1), new Centimeter(2.9));
    }

    @Test
    public void test_times() throws Exception {
        assertEquals(new Centimeter(2), new Centimeter(1).times(2));
        assertEquals(new Centimeter(3.6 * 2), new Centimeter(3.6).times(2));
    }

    @Test
    public void test_plus() throws Exception {
        assertEquals(new Centimeter(2), new Centimeter(1).plus(new Centimeter(1)));
        assertEquals(new Centimeter(11.2), new Centimeter(3.5).plus(new Centimeter(7.7)));
    }

    @Test
    public void test_mixed_operation() throws Exception {
        assertEquals(new Centimeter(5), new Centimeter(1).plus(new Centimeter(1)).times(2).plus(new Centimeter(1)));
        assertEquals(new Centimeter(16.8), new Centimeter(3.4).plus(new Centimeter(1.6)).times(2).plus(new Centimeter(6.8)));
    }
}
