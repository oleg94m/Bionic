import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("Введіть рядки:");
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            stringList.add(input);
            input = scanner.nextLine();
        }

        System.out.println("Рядки, які ви ввели:");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}