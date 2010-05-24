package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.DefaultWholeFileReader;
import com.techtangents.filemangler.api.bits.DefaultWholeFileWriter;
import com.techtangents.filemangler.api.bits.DefaultWholeReaderReader;
import com.techtangents.filemangler.api.bits.DefaultWholeResourceReader;
import com.techtangents.filemangler.api.bits.DefaultWholeStreamReader;
import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileWriter;
import com.techtangents.filemangler.api.bits.WholeReaderReader;
import com.techtangents.filemangler.api.bits.WholeResourceReader;
import com.techtangents.filemangler.api.bits.WholeStreamReader;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

public class DefaultFileMangler implements FileMangler {
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();
    private final WholeFileWriter wholeFileWriter = new DefaultWholeFileWriter();
    private final WholeResourceReader resourceReader = new DefaultWholeResourceReader();
    private final WholeReaderReader readerReader = new DefaultWholeReaderReader();
    private final WholeStreamReader wholeStreamReader = new DefaultWholeStreamReader();

    public String read(File f) {
        return wholeFileReader.read(f);
    }

    public String read(Class clazz, String filename) {
        return resourceReader.read(clazz, filename);
    }

    public String read(Reader reader) {
        return readerReader.read(reader);
    }

    public void write(File f, String content) {
        wholeFileWriter.write(f, content);
    }

    public String read(InputStream stream) {
        return wholeStreamReader.read(stream);
    }
}
