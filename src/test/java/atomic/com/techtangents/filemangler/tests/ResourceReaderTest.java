package com.techtangents.filemangler.tests;

import com.techtangents.filemangler.api.bits.DefaultResourceReader;
import com.techtangents.filemangler.api.bits.ResourceReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResourceReaderTest {
    private final ResourceReader resourceReader = new DefaultResourceReader();

    @Test public void test() {
        String actual = resourceReader.read(getClass(), "test.txt");
        assertEquals("a\nb\nc\n", actual);
    }
}
