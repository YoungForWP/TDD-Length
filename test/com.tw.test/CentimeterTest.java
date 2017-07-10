package com.tw.test;

import com.tw.Length;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CentimeterTest {
    @Test
    public void one_centimeter_equals_one_centimeter() throws Exception {
        assertEquals(Length.centimeter(1), Length.centimeter(1));
        assertEquals(Length.centimeter(1.0), Length.centimeter(1.0));
    }

    @Test
    public void one_centimeter_not_equals_two_centimeter() throws Exception {
        assertNotEquals(Length.centimeter(1), Length.centimeter(2));
        assertNotEquals(Length.centimeter(1.1), Length.centimeter(2.9));
    }

    @Test
    public void test_times() throws Exception {
        assertEquals(Length.centimeter(2), Length.centimeter(1).times(2));
        assertEquals(Length.centimeter(3.6 * 2), Length.centimeter(3.6).times(2));
    }

    @Test
    public void test_plus() throws Exception {
        assertEquals(Length.centimeter(2), Length.centimeter(1).plus(Length.centimeter(1)));
        assertEquals(Length.centimeter(11.2), Length.centimeter(3.5).plus(Length.centimeter(7.7)));
    }

    @Test
    public void test_mixed_operation() throws Exception {
        assertEquals(Length.centimeter(5), Length.centimeter(1).plus(Length.centimeter(1)).times(2).plus(Length.centimeter(1)));
        assertEquals(Length.centimeter(16.8), Length.centimeter(3.4).plus(Length.centimeter(1.6)).times(2).plus(Length.centimeter(6.8)));
    }
}
