package com.javafortesters.com.javafortesters.chap005testwithourownclasses.domainobject.example;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmitriy.kotelnikov on 11.07.2016.
 */
public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }
}
