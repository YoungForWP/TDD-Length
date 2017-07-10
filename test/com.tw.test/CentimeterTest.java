package com.tw.test;

import com.tw.Centimeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CentimeterTest {
    @Test
    public void one_centimeter_equals_one_centimeter() throws Exception {
        assertEquals(new Centimeter(1), new Centimeter(1));
    }

    @Test
    public void one_centimeter_not_equals_two_centimeter() throws Exception {
        assertNotEquals(new Centimeter(1), new Centimeter(2));
    }

    @Test
    public void test_times() throws Exception {
        assertEquals(new Centimeter(2), new Centimeter(1).times(2));
    }

    @Test
    public void test_plus() throws Exception {
        assertEquals(new Centimeter(2), new Centimeter(1).plus(new Centimeter(1)));
    }
}
