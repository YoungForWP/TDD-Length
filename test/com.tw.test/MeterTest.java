package com.tw.test;

import com.tw.Convert;
import com.tw.Length;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MeterTest {

    private Convert convert;

    @Before
    public void setUp() throws Exception {
        convert = new Convert();
        convert.initRates();
    }

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
        assertEquals(Length.centimeter(100), convert.convert(Length.meter(1), "CM"));
        assertEquals(Length.centimeter(110), convert.convert(Length.meter(1.1), "CM"));
    }

    @Test
    public void test_convert_from_cm_to_m() throws Exception {
        assertEquals(Length.meter(1), convert.convert(Length.centimeter(100), "M"));
        assertEquals(Length.meter(1.5), convert.convert(Length.centimeter(150), "M"));
    }

    @Test
    public void test_convert_from_m_to_km() throws Exception {
        assertEquals(Length.kilometer(1), convert.convert(Length.meter(1000), "KM"));
        assertEquals(Length.kilometer(1.05), convert.convert(Length.meter(1050), "KM"));
    }

    @Test
    public void test_convert_from_km_to_m() throws Exception {
        assertEquals(Length.meter(1000), convert.convert(Length.kilometer(1), "M"));
        assertEquals(Length.meter(1600), convert.convert(Length.kilometer(1.6), "M"));
    }

    @Test
    public void test_convert_from_m_to_mm() throws Exception {
        assertEquals(Length.millimeter(1000), convert.convert(Length.meter(1), "MM"));
        assertEquals(Length.millimeter(1600), convert.convert(Length.meter(1.6), "MM"));
    }

    @Test
    public void test_convert_from_mm_to_m() throws Exception {
        assertEquals(Length.meter(1), convert.convert(Length.millimeter(1000), "M"));
        assertEquals(Length.meter(1.6), convert.convert(Length.millimeter(1600), "M"));
    }

    @Test
    public void test_convert_same_kind() throws Exception {
        assertEquals(Length.meter(1), convert.convert(Length.meter(1), "M"));
        assertEquals(Length.kilometer(1), convert.convert(Length.kilometer(1), "KM"));
        assertEquals(Length.centimeter(1), convert.convert(Length.centimeter(1), "CM"));
        assertEquals(Length.millimeter(1), convert.convert(Length.millimeter(1), "MM"));
    }
}
