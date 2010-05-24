package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.DefaultWholeFileReader;
import com.techtangents.filemangler.api.bits.DefaultWholeFileWriter;
import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileWriter;

import java.io.File;

public class DefaultFileMangler implements FileMangler {
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();
    private final WholeFileWriter wholeFileWriter = new DefaultWholeFileWriter();

    public String read(File f) {
        return wholeFileReader.read(f);
    }

    public void write(File f, String content) {
        wholeFileWriter.write(f, content);
    }
}
