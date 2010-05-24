package com.techtangents.filemangler.api.bits;

import java.io.File;

public interface WholeFileWriter {
    void write(File f, String content);
}
