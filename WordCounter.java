package string;
import java.util.*;
public class WordCounter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println("The word '" + word + "' is present " + count + " times in the sentence.");
    }

}
