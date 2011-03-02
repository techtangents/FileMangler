package com.techtangents.filemangler.edge.java.io;

import java.io.File;
import java.io.IOException;

public class EdgeFileStatic implements FileStatic {
    public File createTempFile(String prefix, String suffix) {
        try {
            return File.createTempFile(prefix, suffix);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
