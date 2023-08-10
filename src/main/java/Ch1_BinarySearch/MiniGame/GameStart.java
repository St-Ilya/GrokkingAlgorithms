package Ch1_BinarySearch.MiniGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
Для себя, Бинарный поиск это все же поиск, нужно переделать всю ее логику и только тогда эта игра будет работать
 */

public class GameStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон чисел в котором будем угадывать");

        int start = scanner.nextInt();
        int finish = scanner.nextInt();
        int[] range = IntStream.range(start, finish + 1).toArray();
        System.out.println(Arrays.toString(range));

        System.out.println("Вам загадано число, угадайте его!");

        int hiddenNumber = rand(start, finish);
        System.out.println(hiddenNumber);

        System.out.println("Введите ваше число");

        int myValue = scanner.nextInt();
        while (myValue != hiddenNumber) {
            System.out.println(binarySearch(range, hiddenNumber));
            myValue = scanner.nextInt();
        }

    }

    public static String binarySearch(int[] arr, int hiddenNumber) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == hiddenNumber)
                return "Да, вы нашли число";
            if (guess > hiddenNumber)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return "Такого числа тут нет";
    }

    public static int rand(int min, int max) {
        return new Random().ints(1, min, max).findFirst().getAsInt();
    }
}
