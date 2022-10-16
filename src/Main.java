import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void tack1() {
        int money = 0;
        int[] arr = generateRandomArray();
        for (int element : arr) {
            money += element;
        }
        System.out.println("Сумма трат за месяц составила " + money + " рублей");

    }

    public static void tack2() {
        int[] arr = generateRandomArray();
        int maxMoney = arr[0];
        int minMoney = arr[0];
        for (int elem : arr) {
            if (elem < minMoney) {
                minMoney = elem;
            } else if (elem > maxMoney) {
                maxMoney = elem;
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + minMoney + "рублей");
            System.out.println("Максимальная сумма трат за день составила " + maxMoney + "рублей");
        }
    public static void tack3 () {
        int money = 0;
        int[] arr = generateRandomArray();
        for (int i : arr) {
            money += i;
        }
        System.out.println(money/(float) arr.length);
    }
    public static void tack4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }
}


