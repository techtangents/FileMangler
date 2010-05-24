package com.techtangents.filemangler.tests;

import com.techtangents.filemangler.api.DefaultFileMangler;
import com.techtangents.filemangler.api.bits.DefaultWholeResourceReader;
import com.techtangents.filemangler.api.bits.WholeResourceReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResourceReaderTest {
    private final WholeResourceReader resourceReader = new DefaultWholeResourceReader();
    private final WholeResourceReader fileMangler = new DefaultFileMangler();

    @Test public void test() {
        check(resourceReader);
        check(fileMangler);
    }

    private void check(WholeResourceReader r) {
        String actual = r.read(getClass(), "test.txt");
        assertEquals(TestTxtContents.contents, actual);
    }
}
