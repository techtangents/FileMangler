package com.techtangents.filemangler.exception;

public class FileNotFoundRuntimeException extends RuntimeException {
    public FileNotFoundRuntimeException(Exception inner) {
        super(inner);
    }
}
