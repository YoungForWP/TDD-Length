package com.tw.test;

import com.tw.Meter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MeterTest {
    @Test
    public void one_meter_equals_one_meter() throws Exception {
        assertEquals(new Meter(1), new Meter(1));
    }

    @Test
    public void one_meter_not_equals_two_meter() throws Exception {
        assertNotEquals(new Meter(1), new Meter(2));
    }
    
}
