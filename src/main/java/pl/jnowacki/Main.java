package pl.jnowacki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<String> words = readFile();

        System.out.println(getRandom(0, words.size() - 1));
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
}
