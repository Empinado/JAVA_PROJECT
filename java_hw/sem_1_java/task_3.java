// Реализовать простой калькулятор

package java_hw.sem_1_java;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866"); // (смена кодировки)если после in поставит запятую и в ковычки написать Cp866 кодировщик сможет выводить кириллицу, можно без cp
        System.out.printf("Введите вычеслительную операцию, разделяя символы пробелом: ");
        String oper = iScanner.nextLine(); // принимаем строку, инициализируем переменную oper, для того, чтобы мы могли воспользоваться методом contains и найти нужный нам по условию символ.
        String[] operArray = oper.split(" "); // создаем стринговый массив operArray для обращения к индексам
            
        if(oper.contains("+") == true){
            
                System.out.println(Integer.parseInt(operArray[0]) + Integer.parseInt(operArray[2])); 
            }
        if(oper.contains("-") == true){
            
                System.out.println(Integer.parseInt(operArray[0]) - Integer.parseInt(operArray[2])); 
            }
        if(oper.contains(":")==true || oper.contains("/")== true){
            
                System.out.println(Integer.parseInt(operArray[0]) / Integer.parseInt(operArray[2])); 
            }
        if(oper.contains("*")==true){
            
                System.out.println(Integer.parseInt(operArray[0]) * Integer.parseInt(operArray[2])); 
            }
    }
}
