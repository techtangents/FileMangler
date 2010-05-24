package com.techtangents.filemangler.edge.java.io;

import com.techtangents.filemangler.edge.EdgeException;

import java.io.IOException;

public class EdgeBufferedWriter implements BufferedWriter {
    private java.io.BufferedWriter real;

    public EdgeBufferedWriter(Writer w) {
        this.real = new java.io.BufferedWriter(w.unedge());
    }

    public void write(String str) {
        try {
            real.write(str);
        } catch (IOException e) {
            throw new EdgeException(e);
        }
    }

    public void close() {
        try {
            real.close();
        } catch (IOException e) {
            throw new EdgeException(e);
        }
    }

    public java.io.BufferedWriter unedge() {
        return real;
    }
}
