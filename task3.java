// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task3 {
    // Генератор случайных чисел
    public static List<Integer> getRandom(int len, int min, int max) {
        Random rd = new Random(); // creating Random object
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            numbers.add(rd.nextInt(max - min) + min); // storing random integers in an array
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> randList = getRandom(10, 0, 100);
        double average = 0;
        if (randList.size() > 0) {
            double sum = 0;
            for (int j = 0; j < randList.size(); j++) {
                sum += randList.get(j);
            }
            average = sum / randList.size();
        }
        System.out.printf("Мой список: " + randList);
        System.out.printf("\nМаксимальное значение: " + Collections.max(randList));
        System.out.printf("\nМинимальное значение: " + Collections.min(randList));
        System.out.printf("\nСреднее значение: " + average);
    }

}