package com.techtangents.filemangler;

import com.techtangents.filemangler.api.DefaultFileMangler;
import com.techtangents.filemangler.api.bits.DefaultWholeFileReader;
import com.techtangents.filemangler.api.bits.DefaultWholeFileWriter;
import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class WholeFileWriterTest {

    private static final String CONTENT = "blahblahblah\nblahblah\nhello\r\n";

    private final WholeFileWriter wholeFileWriter = new DefaultWholeFileWriter();
    private final WholeFileWriter fileMangler = new DefaultFileMangler();
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();

    @Test public void test() throws IOException {
        File f = File.createTempFile("blah", "blah");
        f.deleteOnExit();
        check(f, wholeFileWriter);
        check(f, fileMangler);
    }

    private void check(File f, WholeFileWriter writer) {
        writer.write(f, CONTENT);
        assertEquals(CONTENT, wholeFileReader.read(f));
    }
}
