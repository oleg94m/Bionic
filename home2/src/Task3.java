import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел: ");
        int n = scanner.nextInt();
        LinkedList<Integer> list = getIntegerList(n);
        int min = getMinimum(list);
        System.out.println("Мінімальне число: " + min);
    }

    public static LinkedList<Integer> getIntegerList(int n) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Введіть " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}