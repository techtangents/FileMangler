package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.edge.java.io.BufferedReader;
import com.techtangents.filemangler.edge.java.io.EdgeBufferedReader;
import com.techtangents.filemangler.edge.java.io.EdgeFileReader;

import java.io.File;

public class DefaultWholeFileReader implements WholeFileReader {

    public String read(File f) {
        char[] buf = new char[1024];
        BufferedReader r = new EdgeBufferedReader(new EdgeFileReader(f));
        StringBuilder sb = new StringBuilder();
        int chars;
        while ((chars = r.read(buf)) != -1) {
            sb.append(buf, 0, chars);
        }
        return sb.toString();
    }
}