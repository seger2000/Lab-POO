package main3;

import java.io.File;

/**
 * 
 * clasa main pentru laborator 3 la disciplina POO
 * 
 * @author Cristi
 *
 */
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
