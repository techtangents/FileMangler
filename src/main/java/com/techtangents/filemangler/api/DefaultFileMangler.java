package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

public class DefaultFileMangler implements FileMangler {
    private final WholeFileReader wholeFileReader = new DefaultWholeFileReader();
    private final WholeFileWriter wholeFileWriter = new DefaultWholeFileWriter();
    private final WholeResourceReader resourceReader = new DefaultWholeResourceReader();
    private final WholeReaderReader readerReader = new DefaultWholeReaderReader();
    private final WholeStreamReader wholeStreamReader = new DefaultWholeStreamReader();

    public File copyToTempFile(Class<?> clazz, String name) {
        return tempFiler.copyToTempFile(clazz, name);
    }

    public File createTempFile() {
        return tempFiler.createTempFile();
    }

    public File createTempFolder() {
        return tempFiler.createTempFolder();
    }

    private final TempFiler tempFiler = new DefaultTempFiler();

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
