package com.techtangents.filemangler.edge;

public class EdgeException extends RuntimeException {
    public EdgeException(Exception inner) {
        super(inner);
    }
}
