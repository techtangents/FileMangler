package com.techtangents.filemangler.tests;

import com.techtangents.filemangler.api.DefaultFileMangler;
import com.techtangents.filemangler.api.bits.DefaultWholeStreamReader;
import com.techtangents.filemangler.api.bits.WholeStreamReader;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class StreamReaderTest {

    private final WholeStreamReader wholeStreamReader = new DefaultWholeStreamReader();
    private final WholeStreamReader fileMangler = new DefaultFileMangler();

    @Test public void test() {
        check(wholeStreamReader);
        check(fileMangler);        
    }

    private void check(WholeStreamReader r) {
        InputStream stream = getClass().getResourceAsStream("test.txt");
        String actual = r.read(stream);
        assertEquals(TestTxtContents.contents, actual);
    }
}