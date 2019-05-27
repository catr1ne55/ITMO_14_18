package ru.ifmo.lang.kabanova.t04; /**
 * Created by catherine on 27.05.15.
 */

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSizeCalculatorImpl implements FileSizeCalculator {

    public static void main(String[] args) throws IOException {
        final String pathToDir = args[0];
        final String fileTemplate = args[1];
        FileSizeCalculator fileSizeCalculator = new FileSizeCalculatorImpl();
        System.out.println(fileSizeCalculator.getSize(pathToDir, fileTemplate));
    }

    long size;

    public long getSize(String pathToDir, final String fileTemplate) {

        final Path inputPath = Paths.get(pathToDir);

        FileVisitor<Path> maskFileVisitor = new SimpleFileVisitor<Path>() {

            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

                if (file.getFileName().toString().equals(fileTemplate)) {
                    try {
                        size += Files.size(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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