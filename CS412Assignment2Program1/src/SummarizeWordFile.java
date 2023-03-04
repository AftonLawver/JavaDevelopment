// Afton Lawver
// 851463587

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;

public class SummarizeWordFile {

    public static void main(String[] args) throws IOException {
        String outputFilename = "outputSequential.txt";
        String outputFilename2 = "outputParallel.txt";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a filename or filepath:");
        String inputFilename = myScanner.nextLine();


        final long startTime = System.currentTimeMillis();
        Stream<String> lines = Files.lines(Path.of(inputFilename));
        final long endTimeStream = System.currentTimeMillis();
        System.out.println("Execution time to create stream sequentially: " + (endTimeStream - startTime) + "ms");

        try {
            PrintWriter writer = new PrintWriter(outputFilename);
            lines.forEach(writer::println);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time for sequential: " + (endTime - startTime) + "ms");

        final long startTime2 = System.currentTimeMillis();
        Stream<String> linesParallel = Files.lines(Path.of(inputFilename)).toList().parallelStream();
        final long endTimeParallelStream = System.currentTimeMillis();
        System.out.println("Execution time to create stream in parallel: " + (endTimeParallelStream - startTime2) + "ms");

        try {
            PrintWriter writer = new PrintWriter(outputFilename2);
            linesParallel.parallel().forEachOrdered(writer::println);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        final long endTime2 = System.currentTimeMillis();
        System.out.println("Total execution time for parallel: " + (endTime2 - startTime2) + "ms");

    }

}
