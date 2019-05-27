package ru.ifmo.kabanova;

import javax.swing.filechooser.FileFilter;

/**
 * Created by catherine on 08.04.15.
 */
public class TextFileFilterClass extends FileFilter {
    private String extensionOfImage;

    public TextFileFilterClass(String extensionOfImage) {
        this.extensionOfImage = extensionOfImage;
    }

    public boolean accept(java.io.File file) {
        return file.isDirectory() || (file.getName().endsWith(extensionOfImage));
    }

    public String getDescription() {
        return "*" + extensionOfImage;
    }
}

