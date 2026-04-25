public class FileMain {

    private int lineCount;
    private int wordCount;
    private int charCount;

    public FileMain(int lineCount, int wordCount, int charCount) {
        this.lineCount = lineCount;
        this.wordCount = wordCount;
        this.charCount = charCount;
    }
// getter and setter methods
    public int getLineCount() { return lineCount; }
    public int getWordCount() { return wordCount; }
    public int getCharCount() { return charCount; }

    @Override
    public String toString() {
        return "Lines : " + lineCount + "\n" + "Words : " + wordCount + "\n" + 
                        "Chars : " + charCount;
    }
}