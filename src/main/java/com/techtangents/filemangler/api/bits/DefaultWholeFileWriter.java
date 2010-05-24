package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.edge.java.io.BufferedWriter;
import com.techtangents.filemangler.edge.java.io.EdgeBufferedWriter;
import com.techtangents.filemangler.edge.java.io.EdgeFileWriter;

import java.io.File;

public class DefaultWholeFileWriter implements WholeFileWriter {
    public void write(File f, String content) {
        BufferedWriter w = new EdgeBufferedWriter(new EdgeFileWriter(f));
        w.write(content);
        w.close();
    }
}
