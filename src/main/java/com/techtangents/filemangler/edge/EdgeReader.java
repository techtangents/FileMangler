package com.techtangents.filemangler.edge;

import com.techtangents.filemangler.edge.java.io.Reader;

public class EdgeReader implements Reader {

    private final java.io.Reader real;

    public EdgeReader(java.io.Reader real) {
        this.real = real;
    }

    public java.io.Reader unedge() {
        return real;
    }
}
