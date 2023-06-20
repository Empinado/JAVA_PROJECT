package java_OOP.OOP_HW.Sem_4;
/* 
a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можно использовать ArrayList;
d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
g. Не забываем про метод добавления фрукта в коробку.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
     
        Apple apple1 = new Apple(); //Создаем экземпляр класса яблоко

        Box<Fruit> box1 = new Box<>(10, apple1); //Создаем экземпляр класса корзина

        System.out.println(box1.toString()); //Вывод 

        System.out.println(box1.getAmountEl()); //Количество фруктов в корзине

        System.out.println(box1.getWeightBox()); //Вес фруктов в корзине
        

        System.out.println("------------");

        Orange orange1 = new Orange();

        Box<Fruit> box2 = new Box<>(10, orange1);

        System.out.println(box2.toString()); 

        System.out.println(box2.getAmountEl());

        System.out.println(box2.getWeightBox());

        System.out.println("------------"); //Перекладываем из яблок к яблокам

        Box<Fruit> box3 = new Box<>(10, apple1);

        Box<Fruit> box4 = new Box<>(10, apple1);

        ShiftFruit<Box<?>> transaction = new ShiftFruit<Box<?>>(box3, box4, 5); //Проверка метода перекладывания фруктов из корзины в корзину
        transaction.execute();
        transaction.execute();

        System.out.println(box2.getFruitType());
       
        System.out.println("------------"); //Из апельсинов к апельсинам

        Box<Fruit> box5 = new Box<>(10, orange1);

        Box<Fruit> box6 = new Box<>(10, orange1);

        ShiftFruit<Box<?>> transaction1 = new ShiftFruit<Box<?>>(box5, box6, 5);
        transaction1.execute();
        transaction1.execute();

        System.out.println("------------"); //Из яблок к апельсинам

        Box<Fruit> box7 = new Box<>(10, apple1);

        Box<Fruit> box8 = new Box<>(10, orange1);

        ShiftFruit<Box<?>> transaction2 = new ShiftFruit<Box<?>>(box7, box8, 5);
        transaction2.execute();
        transaction2.execute();

        System.out.println("------------");//Проверка метода compare. Равные по весу корзины

        Box<Fruit> box9 = new Box<>(10, orange1);
        Box<Fruit> box10 = new Box<>(10, orange1);

        System.out.println("Вес корзины номер 9: " + box9.getWeightBox());
        System.out.println("Вес корзины номер 10: " + box10.getWeightBox());

        System.out.println("Результат сравнения корзины 9 и 10: " + box9.compareBox(box10));
       
        System.out.println("------------");//Проверка метода compare. Неравные по весу корзины

        Box<Fruit> box11 = new Box<>(10, orange1);
        Box<Fruit> box12 = new Box<>(10, apple1);

        System.out.println("Вес корзины номер 9: " + box11.getWeightBox());
        System.out.println("Вес корзины номер 10: " + box12.getWeightBox());

        System.out.println("Результат сравнения корзины 11 и 12: " + box11.compareBox(box12));

        System.out.println("------------");//Проверка метода добавления фрукта

        Box<Fruit> box13 = new Box<>(10, orange1);
        System.out.println(box13.getAmountEl());

        box13.addFruit(1, orange1);
        System.out.println(box13.getAmountEl());
    
        
    }
}
