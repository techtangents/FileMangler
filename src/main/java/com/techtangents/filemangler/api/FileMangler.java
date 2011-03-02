package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.*;

public interface FileMangler
    extends
        WholeFileReader,
        WholeFileWriter,
        WholeResourceReader,
        WholeReaderReader,
        WholeStreamReader,
        TempFiler
{}
