package main;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        TextMet text = new TextMet(file);
        text.count_word();
        text.count_vowels_consonants();
        text.most_repeated();
    }
}
