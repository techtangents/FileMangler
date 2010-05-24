package com.techtangents.filemangler.api.bits;

import java.io.InputStream;

public interface WholeStreamReader {
    String read(InputStream stream);
}
