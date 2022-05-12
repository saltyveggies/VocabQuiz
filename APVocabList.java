import java.util.ArrayList;
public class APVocabList {
    private String name;
    private ArrayList<String> englishWords;
    private ArrayList<String> spanishWords;
    private int length;
    public APVocabList(String str, ArrayList<String> ew, ArrayList<String> sw) {
        //strange how we have to restate the data type for the array,
        //but that's just how Java works I guess
        
        name = str;
        englishWords = ew;
        spanishWords = sw;
        length = englishWords.size();
    }
    public String getName() {
        return name;
    }
    public ArrayList<String> getEnglishWords() {
        return englishWords;
    }
    public ArrayList<String> getSpanishWords() {
        return spanishWords;
    }
    public int getLength() {
        return length;
    }
    public void printEw() {
        for (String str : englishWords) {
            System.out.println(str);
        }
    }
    public void printSw() {
        for (String str : spanishWords) {
            System.out.println(str);
        }
    }
}