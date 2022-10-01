import java.util.ArrayList;
import java.util.List;

public class WordsChecker {

    private String text;
    List<String> words = new ArrayList<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        words = List.of(text.split("\\P{IsAlphabetic}+"));
        return words.contains(word);
    }
}
