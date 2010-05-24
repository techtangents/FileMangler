package com.techtangents.filemangler.edge.java.io;

import com.techtangents.filemangler.edge.EdgeException;
import com.techtangents.filemangler.edge.Unedgeable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EdgeFileReader implements Reader, Unedgeable<java.io.Reader> {
    private FileReader real;

    public EdgeFileReader(File f) {
        try {
            this.real = new FileReader(f);
        } catch (FileNotFoundException e) {
            throw new EdgeException(e);
        }
    }

    public java.io.Reader unedge() {
        return real;
    }
}
