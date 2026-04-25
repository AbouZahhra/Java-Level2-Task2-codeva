# Java-Level2-Task2-codeva
File Processing System (Java)


Project Description
This project is a Java-based file processing application that reads a text file and generates a statistical report. It calculates the number of lines, words, and characters in the input file and saves the results into an output report file.

Features
Reads text data from an input file
Counts number of lines, words, and characters
Processes data line by line
Generates a report file with results

How It Works
The program reads input.txt using Scanner
Each line is processed to:
Count lines
Count words using split("\\s+")
Count characters using length()
Results are stored in a FileMain object
A report is written to report.txt using FileWriter


Project Structure
FileProcessor.java → Handles file reading, processing, and writing output
FileMain.java → Data model that stores results (lines, words, characters)
