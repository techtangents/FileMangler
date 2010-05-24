package com.techtangents.filemangler.edge.java.io;

import java.io.*;

public class EdgeFileWriter implements Writer {
    private java.io.FileWriter real;

    public EdgeFileWriter(File f) {
        try {
            this.real = new java.io.FileWriter(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public java.io.Writer unedge() {
        return real;
    }
}
