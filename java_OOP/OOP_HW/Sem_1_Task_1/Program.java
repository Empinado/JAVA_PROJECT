package java_OOP.OOP_HW.Sem_1_Task_1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

    
        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);

        System.out.println(bottleOfMilk.displayInfo());

        Product milk = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);

        System.out.println(bottleOfMilk.displayInfo());

        Product chocolate = new Chocolate("OOO Dove", "Шоколад Dove", 150, 100, "Молочный");

        System.out.println(chocolate.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate);

        VendingMachine vendingMachine = new VendingMachine(products);
        /**BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        } 
        */

        Chocolate ChocolateResult = vendingMachine.getChocolate(100);
        if (ChocolateResult != null){
            System.out.println("Вы купили:");
            System.out.println(ChocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }

}
