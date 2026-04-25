import java.io.*;
import java.util.Scanner;

public class FileProcessor {

    private String inputPath;
    private String outputPath;

    public FileProcessor(String inputPath, String outputPath) {
        this.inputPath  = inputPath;
        this.outputPath = outputPath;
    }

    // Read the input file and return a FileMain  object
    public FileMain readFile() throws FileNotFoundException {
        int lines = 0, words = 0, chars = 0;

        Scanner scanner = new Scanner(new File(inputPath));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines++;
            chars += line.length();

            if (!line.trim().isEmpty()) {
                words += line.trim().split("\\s+").length;
            }
        }

        scanner.close();
        return new FileMain(lines, words, chars);
    }

    public void writeReport(FileMain stats) throws IOException {
        FileWriter writer = new FileWriter(outputPath);

        writer.write("=== File Report ===\n");
        writer.write("Input : " + inputPath + "\n");
        writer.write(stats.toString() + "\n");

        writer.close();
        System.out.println("Report saved to: " + outputPath);
    }

    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor("input.txt", "report.txt");

        try {
            FileMain stats = fp.readFile();
            System.out.println(stats);
            fp.writeReport(stats);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Could not write report - " + e.getMessage());
        }
    }
}