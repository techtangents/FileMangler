package com.techtangents.filemangler.api.bits;

import java.io.File;

public interface TempFiler {
    File copyToTempFile(Class<?> clazz, String name);

    File createTempFile();

    File createTempFolder();
}
