package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.DefaultWholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileReader;

import java.io.File;

public class DefaultFileMangler implements FileMangler {
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();

    public String read(File f) {
        return wholeFileReader.read(f);
    }
}
