//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package java_hw.sem_3_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        int amount_elem = 20;
        for (int i = 0; i < amount_elem; i++) {
            int randNum = rand.nextInt(100);
            list.add(randNum);
        }
        System.out.println(list);

        int min_num = Collections.min(list);
        System.out.printf("Минимальное число в списке: %d \n", min_num);

        int max_num = Collections.max(list);
        System.out.printf("Максимальное число в списке: %d \n", max_num);

        int sum_list = list.stream().mapToInt(Integer::intValue).sum();
        int average = sum_list / amount_elem;
        System.out.printf("Среднее арифметическое в списке: %d \n", average);
    }
}