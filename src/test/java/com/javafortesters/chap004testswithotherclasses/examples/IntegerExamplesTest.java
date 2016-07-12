package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmitriy.kotelnikov on 11.07.2016.
 */
public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    @Test
    public void stringExploration(){
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    @Test
    public void hexExploration(){
        assertEquals("hex returns b", "b", Integer.toHexString(11));
        assertEquals("hex returns b", "a", Integer.toHexString(10));
        assertEquals("hex returns b", "3", Integer.toHexString(3));
        assertEquals("hex returns b", "15", Integer.toHexString(21));
    }

    @Test
    public void minMaxValues(){
        assertEquals("minvalue returns -2147483648", -2147483648, Integer.MIN_VALUE);
        assertEquals("minvalue returns 2147483648", 2147483647, Integer.MAX_VALUE);
    }
}
