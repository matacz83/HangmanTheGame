package pl.jnowacki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static List<String> words;

    public static void main(String[] args) throws FileNotFoundException {
        initWords();

        String word = getNextWord();

        printWord(word);
    }

    private static void initWords() throws FileNotFoundException {
        words = readFile();
    }

    private static void printWord(String word) {
        System.out.println(word);
        for(int i = 0; i < word.length(); i++) {
            System.out.print("_" + " ");
        }
    }

    private static List<String> readFile() throws FileNotFoundException {

        List<String> words = new ArrayList<>();

        File file = new File("words.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            words.add(in.nextLine());
        }

        return words;
    }

    private static int getRandom(int start, int end) {
        Random rand = new Random();

        return rand.nextInt((end - start) + 1) + start;
    }

    private static String getNextWord() {
        return words.get(getRandom(0, words.size() - 1));
    }
}
