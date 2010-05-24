package com.techtangents.filemangler.exception;

public class FileNotFoundRuntimeException extends RuntimeException {
    public FileNotFoundRuntimeException(String message) {
        super("File not found: " + message);
    }
}
