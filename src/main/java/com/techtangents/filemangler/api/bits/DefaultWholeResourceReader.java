package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.exception.FileNotFoundRuntimeException;

import java.io.InputStream;

public class DefaultWholeResourceReader implements WholeResourceReader {

    private final WholeStreamReader wholeStreamReader = new DefaultWholeStreamReader();

    public String read(Class clazz, String filename) {
        InputStream stream = clazz.getResourceAsStream(filename);
        if (stream == null) return barf(clazz, filename);
        return wholeStreamReader.read(stream);
    }

    private String barf(Class clazz, String filename) {
        throw new FileNotFoundRuntimeException(clazz.getPackage().getName() + ":" + filename);
    }
}
