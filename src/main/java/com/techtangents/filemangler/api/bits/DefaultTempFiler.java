package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.edge.java.io.EdgeFileStatic;
import com.techtangents.filemangler.edge.java.io.FileStatic;

import java.io.File;

public class DefaultTempFiler implements TempFiler {

    private final WholeStreamReader reader = new DefaultWholeStreamReader();
    private final WholeFileWriter writer = new DefaultWholeFileWriter();
    private final FileStatic file = new EdgeFileStatic();

    public File copyToTempFile(Class<?> clazz, String name) {
        String contents = reader.read(clazz.getResourceAsStream(name));
        File tempFile = createTempFile();
        writer.write(tempFile, contents);
        return tempFile;
    }

    public File createTempFile() {
        return file.createTempFile("tmp", "tmp");
    }

    public File createTempFolder() {
        File f = createTempFile();
        barfIfNot(f.delete());
        barfIfNot(f.mkdirs());
        return f;
    }

    private void barfIfNot(boolean b) {
        if (!b) throw new RuntimeException("Could not create temp folder");
    }
}
