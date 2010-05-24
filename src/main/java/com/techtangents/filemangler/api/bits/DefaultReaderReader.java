package com.techtangents.filemangler.api.bits;

import com.techtangents.filemangler.alien.DefaultNewlineFixer;
import com.techtangents.filemangler.alien.NewlineFixer;
import com.techtangents.filemangler.edge.EdgeReader;
import com.techtangents.filemangler.edge.java.io.BufferedReader;
import com.techtangents.filemangler.edge.java.io.EdgeBufferedReader;
import com.techtangents.filemangler.edge.java.io.Reader;

public class DefaultReaderReader implements ReaderReader {

    private final NewlineFixer newlineFixer = new DefaultNewlineFixer();

    public String read(java.io.Reader reader) {
        return read(new EdgeReader(reader));
    }

    // uses edged classes - for internal use only, don't pull up to interface
    public String read(Reader edgeReader) {
        char[] buf = new char[1024];
        BufferedReader r = new EdgeBufferedReader(edgeReader);
        StringBuilder sb = new StringBuilder();
        int chars;
        while ((chars = r.read(buf)) != -1) {
            sb.append(buf, 0, chars);
        }
        r.close();
        String content = sb.toString();
        // the caller shouldn't have to deal with newline differences.
        return newlineFixer.fix(content);
    }
}