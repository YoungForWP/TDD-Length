package com.tw.test;

import com.tw.Meter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MeterTest {
    @Test
    public void one_meter_equals_one_meter() throws Exception {
        assertEquals(new Meter(1), new Meter(1));
        assertEquals(new Meter(1.1), new Meter(1.1));
    }

    @Test
    public void one_meter_not_equals_two_meter() throws Exception {
        assertNotEquals(new Meter(1), new Meter(2));
        assertNotEquals(new Meter(1.1), new Meter(2.1));
    }

    @Test
    public void test_times() throws Exception {
        assertEquals(new Meter(2), new Meter(1).times(2));
        assertEquals(new Meter(3.3), new Meter(1.1).times(3));
    }

    @Test
    public void test_plus() throws Exception {
        assertEquals(new Meter(2), new Meter(1).plus(new Meter(1)) );
        assertEquals(new Meter(3.9), new Meter(1.6).plus(new Meter(2.3)) );
    }

    @Test
    public void test_mixed_operation() throws Exception {
        assertEquals(new Meter(5), new Meter(1).plus(new Meter(1)).times(2).plus(new Meter(1)));
        assertEquals(new Meter(10.4), new Meter(1.8).plus(new Meter(1.6)).times(2).plus(new Meter(3.6)));
    }
}
