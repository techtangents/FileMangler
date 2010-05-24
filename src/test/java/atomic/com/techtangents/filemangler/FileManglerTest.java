package com.techtangents.filemangler;

import com.techtangents.filemangler.api.DefaultFileMangler;
import com.techtangents.filemangler.api.bits.DefaultWholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileReader;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FileManglerTest {

    private final WholeFileReader fileMangler = new DefaultFileMangler();
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();

    @Test public void test() throws Exception {
        File f = createTempFile();
        check(f, fileMangler);
        check(f, wholeFileReader);
    }

    private File createTempFile() throws IOException {
        File f = File.createTempFile("blah", "blah");
        f.deleteOnExit();
        FileWriter w = new FileWriter(f);
        w.append("blah\nblah\nblah\nchicken");
        w.close();
        return f;
    }

    private void check(File f, WholeFileReader reader) {
        String actual = reader.read(f);
        assertEquals("blah\nblah\nblah\nchicken", actual);
    }
}
