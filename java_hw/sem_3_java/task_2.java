//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package java_hw.sem_3_java;

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = rand.nextInt(10);
            list.add(randNum);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);
    }
}    

