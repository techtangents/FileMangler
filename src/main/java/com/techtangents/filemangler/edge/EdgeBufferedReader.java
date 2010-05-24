package com.techtangents.filemangler.edge;

import java.io.*;

public class EdgeBufferedReader implements BufferedReader {
    private java.io.BufferedReader real;

    public EdgeBufferedReader(Reader reader) {
        this.real = new java.io.BufferedReader(reader.unedge());
    }

    public int read(char[] buf) {
        try {
            return real.read(buf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public java.io.Reader unedge() {
        return real;
    }
}
