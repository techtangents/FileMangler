package com.techtangents.filemangler.alien;

public class DefaultNewlineFixer implements NewlineFixer {
    /**
     * yep, it's \n, people... not \r\n, not \r
     */
    public String fix(String in) {
        return in.replaceAll("\r\n", "\n").replaceAll("[\r\n]", "\n");
    }
}