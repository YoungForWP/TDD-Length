package com.tw.test;

import com.sun.tools.javac.util.Convert;
import com.tw.Length;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MeterTest {
    @Test
    public void one_meter_equals_one_meter() throws Exception {
        assertEquals(Length.meter(1), Length.meter(1));
        assertEquals(Length.meter(1.1), Length.meter(1.1));
    }

    @Test
    public void one_meter_not_equals_two_meter() throws Exception {
        assertNotEquals(Length.meter(1), Length.meter(2));
        assertNotEquals(Length.meter(1.1), Length.meter(2.1));
    }

    @Test
    public void test_times() throws Exception {
        assertEquals(Length.meter(2), Length.meter(1).times(2));
        assertEquals(Length.meter(3.3), Length.meter(1.1).times(3));
    }

    @Test
    public void test_plus() throws Exception {
        assertEquals(Length.meter(2), Length.meter(1).plus(Length.meter(1)) );
        assertEquals(Length.meter(3.9), Length.meter(1.6).plus(Length.meter(2.3)) );
    }

    @Test
    public void test_mixed_operation() throws Exception {
        assertEquals(Length.meter(5), Length.meter(1).plus(Length.meter(1)).times(2).plus(Length.meter(1)));
        assertEquals(Length.meter(10.4), Length.meter(1.8).plus(Length.meter(1.6)).times(2).plus(Length.meter(3.6)));
    }

    @Test
    public void one_meter_not_equals_one_centimeter() throws Exception {
        assertNotEquals(Length.meter(1), Length.centimeter(1));
        assertNotEquals(Length.meter(2.6), Length.centimeter(2.6));
    }

    @Test
    public void test_convert_from_m_to_cm() throws Exception {
        com.tw.Convert convert = new com.tw.Convert();
        assertEquals(Length.centimeter(100), convert.convert(Length.meter(1), "CM"));
        assertEquals(Length.centimeter(110), convert.convert(Length.meter(1.1), "CM"));
    }

}
