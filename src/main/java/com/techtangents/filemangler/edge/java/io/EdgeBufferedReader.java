package com.techtangents.filemangler.edge.java.io;

import com.techtangents.filemangler.edge.EdgeException;

import java.io.IOException;

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

    public void close() {
        try {
            real.close();
        } catch (IOException e) {
            throw new EdgeException(e);
        }
    }

    public java.io.Reader unedge() {
        return real;
    }
}
