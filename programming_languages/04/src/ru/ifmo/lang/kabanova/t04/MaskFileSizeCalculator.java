package ru.ifmo.lang.kabanova.t04;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by catherine on 27.05.15.
 */
public class MaskFileSizeCalculator implements FileSizeCalculator {

    public static void main(String[] args) throws IOException {
        final String pathToDir = args[0];
        final String fileTemplate = args[1];
        MaskFileSizeCalculator maskFileSizeCalculator = new MaskFileSizeCalculator();
        System.out.println(maskFileSizeCalculator.getSize(pathToDir, fileTemplate));
    }

    long size;

    public long getSize(String pathToDir, final String fileTemplate) throws IOException {

        final Path inputPath = Paths.get(pathToDir);

        FileVisitor<Path> maskFileVisitor = new SimpleFileVisitor<Path>() {

            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                if (fileTemplate.startsWith("*") && fileTemplate.endsWith("*")) {
                    size += Files.size(file);
                }

                if ((fileTemplate.startsWith("*") && (!fileTemplate.endsWith("*"))) && (file.getFileName().toString().endsWith(fileTemplate.substring(1)))) {
                    size += Files.size(file);
                }

                if (!(fileTemplate.startsWith("*")) && (fileTemplate.endsWith("*")) && (file.getFileName().toString().startsWith(fileTemplate.substring(0, fileTemplate.length() - 2)))) {
                    size += Files.size(file);
                }

                if (file.getFileName().toString().equals(fileTemplate)) {
                    size += Files.size(file);
                }

                return FileVisitResult.CONTINUE;

            }
        };
        try {
            Files.walkFileTree(inputPath, maskFileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return size;
    }
}
