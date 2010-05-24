package com.techtangents.filemangler.api.bits;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DefaultWholeStreamReader implements WholeStreamReader {

    private final WholeReaderReader readerReader = new DefaultWholeReaderReader();

    public String read(InputStream stream) {
        Reader reader = new InputStreamReader(stream);
        return readerReader.read(reader);
    }
}
