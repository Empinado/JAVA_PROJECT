package java_OOP.OOP_HW.Sem_4;

public class ShiftFruit<T extends Box<? extends Fruit>> {

    private final T from;
    
    private final T to;

    private final int amount;

    public ShiftFruit(T from, T to, int amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if(from.getFruitType() == to.getFruitType())
        {
            if (from.getAmountEl() >= amount){
                System.out.printf("Мы переложили фрукты между корзинами в количестве %d .\n", amount);
                System.out.printf("В первой корзине было : %d фруктов.\n Во второй корзине : %d фруктов.\n",from.getAmountEl(), to.getAmountEl());
                from.setAmountEl(from.getAmountEl() - amount);
                to.setAmountEl(to.getAmountEl() + amount);

                System.out.println("Текущее наполнение корзин:");
                System.out.println(from);
                System.out.println(to);
            }
            else {
                System.out.println("Операция невозможна, недостаточно фруктов в корзине.");
            }
        }
        else{
            System.out.println("В корзинах разные фрукты.");
        }

    }


   
    
}
