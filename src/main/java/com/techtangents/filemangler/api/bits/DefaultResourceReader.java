package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.exception.FileNotFoundRuntimeException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DefaultResourceReader implements ResourceReader {

    private final ReaderReader readerReader = new DefaultReaderReader();

    public String read(Class clazz, String filename) {
        InputStream stream = clazz.getResourceAsStream(filename);
        if (stream == null) throw new FileNotFoundRuntimeException(clazz.getPackage().getName() + ":" + filename);
        Reader reader = new InputStreamReader(stream);
        return readerReader.read(reader);
    }
}
