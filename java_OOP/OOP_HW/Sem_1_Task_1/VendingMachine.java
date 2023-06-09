package java_OOP.OOP_HW.Sem_1_Task_1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }

    public  Chocolate getChocolate(double volume){

        for(Product product : products){
            if (product instanceof Chocolate){
               if ( ((Chocolate)product).getVolume()  == volume){
                   return (Chocolate)product;
               }
            }
        }
        return null;
    }

}
