package pl.jnowacki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Set<String> words = readFile();
    }

    private static Set<String> readFile() throws FileNotFoundException {

        Set<String> words = new HashSet<>();

        File file = new File("words.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            words.add(in.nextLine());
        }

        return words;
    }
}
