package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.DefaultReaderReader;
import com.techtangents.filemangler.api.bits.DefaultResourceReader;
import com.techtangents.filemangler.api.bits.DefaultWholeFileReader;
import com.techtangents.filemangler.api.bits.DefaultWholeFileWriter;
import com.techtangents.filemangler.api.bits.ReaderReader;
import com.techtangents.filemangler.api.bits.ResourceReader;
import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileWriter;

import java.io.File;
import java.io.Reader;

public class DefaultFileMangler implements FileMangler {
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();
    private final WholeFileWriter wholeFileWriter = new DefaultWholeFileWriter();
    private final ResourceReader resourceReader = new DefaultResourceReader();
    private final ReaderReader readerReader = new DefaultReaderReader();

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
}
