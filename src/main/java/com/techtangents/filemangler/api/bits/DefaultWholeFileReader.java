package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.edge.java.io.EdgeFileReader;
import com.techtangents.filemangler.edge.java.io.Reader;

import java.io.File;

public class DefaultWholeFileReader implements WholeFileReader {
    private final DefaultReaderReader readerReader = new DefaultReaderReader();

    public String read(File f) {
        Reader reader = new EdgeFileReader(f);
        return readerReader.read(reader);
    }
}