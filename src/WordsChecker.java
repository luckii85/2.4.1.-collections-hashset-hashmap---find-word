import java.util.*;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    List<String> words = new ArrayList<>();

    public boolean hasWord(String word) {
        words = List.of(text.split("\\P{IsAlphabetic}+"));
        return words.contains(word);
    }

    Set<String> words2 = new HashSet<>();

    public boolean hasWord2(String word) {
String[] parts = text.toLowerCase().split("\\P{IsAlphabetic}+");
// Collections.addAll(words2, parts);
// words2.addAll(List.of(parts));
// words2.addAll(Arrays.asList(parts));
        for (String part : parts){
            words2.add(part);
        }
return words2.contains(word.toLowerCase());
    }
}
