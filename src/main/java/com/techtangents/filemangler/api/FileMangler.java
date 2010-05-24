package com.techtangents.filemangler.api;

import com.techtangents.filemangler.api.bits.ResourceReader;
import com.techtangents.filemangler.api.bits.WholeFileReader;
import com.techtangents.filemangler.api.bits.WholeFileWriter;

public interface FileMangler extends WholeFileReader, WholeFileWriter, ResourceReader {
}
