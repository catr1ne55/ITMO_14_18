package ru.ifmo.lang.kabanova.t09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by catherine on 18.04.15.
 */
public class LineProcessor {

    public LineProcessor(Path inputPath) throws IOException{
        this.lines = Files.readAllLines(inputPath);
    }

    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        String outputFile = args[1];
        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);
        LineProcessor lineProcessor = new LineProcessor(inputPath);

        for (int i = 2; i < args.length; i++) {

            if (args[i].equals("sort")) {
                lineProcessor.sort();
            }

            if (args[i].equals("skip")) {
                long n = Long.parseLong(args[i + 1]);
                lineProcessor.skip(n);
            }

            if (args[i].equals("limit")) {
                long n = Long.parseLong(args[i + 1]);
                lineProcessor.limit(n);
            }

            if (args[i].equals("shuffle")) {
                lineProcessor.shuffle();
            }

            if (args[i].equals("distinct")) {
                lineProcessor.distinct();
            }

            if (args[i].equals("filter")) {
                String regExp = args[i + 1];
                lineProcessor.filter(regExp);
            }
        }


            lineProcessor.writeLines(outputPath);

    }

    private List<String> lines;

    public void sort() {
       lines = lines.stream().sorted().collect(Collectors.toList());
    }

    public void skip(long n) {
        lines = lines.stream().skip(n).collect(Collectors.toList());
    }

    public void limit(long maxSize) {
        lines = lines.stream().limit(maxSize).collect(Collectors.toList());
    }

    public void shuffle() {
        Collections.shuffle(lines);
    }

    public void distinct() {
        lines = lines.stream().distinct().collect(Collectors.toList());
    }

    public void filter(String regExp) {
        lines = lines.stream().filter((s) -> s.equals(regExp)).collect(Collectors.toList());
    }

    public void writeLines(Path outputPath) {
        try {
            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
