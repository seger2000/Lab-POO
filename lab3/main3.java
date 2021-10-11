package main3;

import java.io.File;


public class main3 {

	public static void main(String[] args) {

		File file = new File("text.txt");

		methods_for_text text = new methods_for_text(file);

		text.display_text();
		text.nr_words_sentences();
		text.nr_letters_vowels_consonants();
		text.top5_longest();
	}
}
