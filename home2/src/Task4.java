import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> family = new HashMap<>();
        family.put("Москва", "Іванови");
        family.put("Київ", "Петрови");
        family.put("Лондон", "Абрамовичі");
        for (int i = 0; i < 3; i++) {
            System.out.print("Введіть місто: ");
            String city = scanner.next();
            if (family.containsKey(city/*.toLowerCase()*/)) {
                System.out.println(family.get(city));
            } else {
                System.out.println("Сім'ю у місті не знайдено");
            }
        }
    }
}