// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package java_hw.sem_1_java;

import java.util.Scanner;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in, "Cp866"); 
        System.out.printf("Введите число n: ");
        int n = numbers.nextInt();
        numbers.close();
        
        int Sum = 0;
        for (int i = 1; i < n+1; i++) {
            Sum = Sum +i;
            // System.out.println(Sum);
        }
        System.out.println(Sum);
    }
}