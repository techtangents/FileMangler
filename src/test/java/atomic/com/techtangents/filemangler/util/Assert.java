package com.techtangents.filemangler.util;

import com.techtangents.filemangler.alien.DefaultNewlineFixer;
import com.techtangents.filemangler.alien.NewlineFixer;

import static org.junit.Assert.assertEquals;

public class Assert {
    private static final NewlineFixer newlineFixer = new DefaultNewlineFixer();

    public static void assertEqualsIgnoreNewlineDifferences(String expected, String actual) {
        assertEquals(expected, newlineFixer.fix(actual));
    }
}