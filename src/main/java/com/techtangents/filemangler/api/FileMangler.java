package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileWriter;
import com.techtangents.filemangler.api.bits.WholeReaderReader;
import com.techtangents.filemangler.api.bits.WholeResourceReader;
import com.techtangents.filemangler.api.bits.WholeStreamReader;

public interface FileMangler
    extends
        WholeFileReader,
        WholeFileWriter,
        WholeResourceReader,
        WholeReaderReader,
        WholeStreamReader {
}
