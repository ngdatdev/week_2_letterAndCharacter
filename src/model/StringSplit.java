package model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringSplit {

    private final Map<String, Integer> words;
    private final Map<Character, Integer> characters;

    public StringSplit(String str) {
        words = new LinkedHashMap<>();
        characters = new LinkedHashMap<>();
        countWords(str);
        countCharacters(str);
    }

    public final void countWords(String input) {
        StringTokenizer st = new StringTokenizer(input.replaceAll("[^a-zA-Z]", " "));
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            int n = words.getOrDefault(s, 0);

            words.put(s, n + 1);
        }
    }

    public final void countCharacters(String input) {
        char[] cs = input.replaceAll("[^a-zA-Z]", "").toCharArray();
        for (char c : cs) {
            int n = characters.getOrDefault(Character.toLowerCase(c), 0);
            characters.put(Character.toLowerCase(c), n + 1);
        }
    }

    public Map<String, Integer> getWords() {
        return words;
    }

    public Map<Character, Integer> getCharacters() {
        return characters;
    }

//    public static void main(String[] args) {
//        StringSplit s = new StringSplit("dat dat a");
//        System.out.println(s.words);
//    }
}
