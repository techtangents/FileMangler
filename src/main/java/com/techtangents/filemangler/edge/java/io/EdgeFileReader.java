package com.techtangents.filemangler.edge.java.io;

import com.techtangents.filemangler.exception.FileNotFoundRuntimeException;

import java.io.*;

public class EdgeFileReader implements Reader, Unedgeable<java.io.Reader> {
    private FileReader real;

    public EdgeFileReader(File f) {
        try {
            this.real = new FileReader(f);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundRuntimeException(e);
        }
    }

    public java.io.Reader unedge() {
        return real;
    }
}
