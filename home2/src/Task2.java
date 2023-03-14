import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 5 слів:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        ArrayList<String> doubledWords = new ArrayList<String>();
        for (String word : words) {
            doubledWords.add(word);
            doubledWords.add(word);
        }

        for (String word : doubledWords) {
            System.out.println(word);
        }
    }
}