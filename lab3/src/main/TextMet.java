package main;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class TextMet {
    private String txt="";
    public TextMet(File file) {
        try (FileReader f = new FileReader(file)) {
            int ch;
            while ((ch = f.read()) != -1)
                this.txt += (char) ch;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print_file(){
        System.out.println(this.txt);
    }

    public  void count_word(){
        String punct = ".,::?!";
        int wordCount = 0;
        int sentenceCount=0;
        boolean isWord = false;
        String line;
        int endOfLine = txt.length() - 1;
        char[] characters = txt.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        for(int i=0;i<txt .length()-1;i++){
            for(int j=0;j<punct.length();j++){
                if(txt.charAt(i)==punct.charAt(j)){
                    if(txt.charAt(i+1)==punct.charAt(j)){
                        sentenceCount--;}
                    sentenceCount++;  }
            }
        }

        System.out.println("Numar de cuvinte "+wordCount);
        System.out.println("Numar de propoziti "+sentenceCount);
    }


    public void count_vowels_consonants(){
        int count_vowels = 0 , count_consonants = 0;
        for (int i = 0; i < txt.length(); i++){
            char ch = txt.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count_vowels++;

            }else if ((ch >= 'a' && ch <= 'z')){
                count_consonants++;
            }
        }
        System.out.println("Vocale = "+count_vowels);
        System.out.println("Consoane = "+count_consonants);
        int litere = count_consonants + count_vowels;
        System.out.println("Litere = "+ litere);
    }


    public void most_repeated() {
        ConcurrentMap<String, Integer> freqMap = asList(txt.split("[\\s.]"))
                        .parallelStream()
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.toConcurrentMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
        //System.out.println(freqMap.toString());
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(freqMap::get));
        for(String key: freqMap.keySet()) {
            pq.add(key);
            if(pq.size() > 5) {
                pq.poll();
            }
        }
        System.out.println("Top 5 cuvinte care se repeta : " + pq);
    }




}
