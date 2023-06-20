package java_OOP.OOP_HW.Sem_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> implements Comparable<Box<T>>{
    
  
    private int amountEl; //количество фруктов, которое мы хотим положить в box

    private ArrayList<T> fruits = new ArrayList<>();

    private T fruit;

    public Box(int amountEl, T fruit) {
        this.amountEl = amountEl;
        this.fruit = fruit;

        
        for (int i = 0; i < amountEl; i++) {
            this.fruits.add(fruit);
        }
    }


    public boolean getFruitType(){//Проверка на яблоко)
        if ( fruit instanceof Apple){
            return true;
        }
        else{
            return false;
        }
    }

    public void setAmountEl(int amountEl) {
        this.amountEl = amountEl;
    }

    public float getWeightBox(){
        float weight = amountEl * fruit.getWeight();
        return weight;
    }

    public int getAmountEl() { 
        return amountEl;
    }
    
    @Override
    public String toString() {
        if ( fruit instanceof Apple){
        return "Box: [В корзине:" + amountEl + " яблок.]";
        }
        else{ 
            return "Box: [В корзине:" + amountEl + " апельсинов.]";
        }
    }


    public boolean compareBox(Box<T> o){
        if(this.getWeightBox() == o.getWeightBox())
            return true;
        else
            return false;
    }

    public ArrayList<T> addFruit(int amountEL, T fruit){
        for (int i = 0; i < amountEl; i++) {
            this.fruits.add(fruit);
        }
        this.amountEl+=amountEL;
        return this.fruits;
    }

    @Override
    public int compareTo(Box<T> o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
   
  
}
