import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        //Текс із заданним типом StringBuilder
        StringBuilder text = new StringBuilder("Ok! " +
                "Hello, my name is Vitaliy. " +
                "I am from Lviv. " +
                "I am student. " +
                "I love sport and music! " +
                "Do you love sport or music?");

        System.out.println("Input text:");
        System.out.println(text);
        System.out.println();

        text = replase(text);
        System.out.println("Result text");
        System.out.println(text);
        System.out.println();
    }

    public static StringBuilder replase(StringBuilder text) {
        text.append(' ');

        int temp_index = 0; //індекс який вказує на початок речення
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                if (text.charAt(i + 1) != ' ') {
                    text.insert(i + 1, ' ');
                }
                StringBuilder sentence = new StringBuilder(text.substring(temp_index, i).trim());

                if (sentence.length() < 3) {
                    temp_index = i + 2;
                    continue;
                }

                int first_word_index = sentence.indexOf(" ");
                if (sentence.charAt(first_word_index - 1) == ',' ||
                        sentence.charAt(first_word_index - 1) == ':' ||
                        sentence.charAt(first_word_index - 1) == ';') {
                    first_word_index -= 1;
                }

                int last_word_index = sentence.lastIndexOf(" ") + 1;
                int sentence_length = sentence.length();

                StringBuilder last_word = new StringBuilder(sentence.substring(last_word_index, sentence_length));
                StringBuilder first_word = new StringBuilder(sentence.substring(0, first_word_index));

                sentence = sentence.replace(last_word_index, sentence_length, first_word.toString());
                sentence = sentence.replace(0, first_word_index, last_word.toString());

                text.replace(temp_index, i, sentence.toString());

                temp_index = i + 2;
            }
        }
        text.deleteCharAt(text.length() - 1);
        return text;
    }
}