package java_OOP.OOP_HW.Sem_1_Task_1;

public class Chocolate extends Product{
    private double volume; // объем
    private String chocolateType; // Тип шоколада


    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    public Chocolate(String brand, String name, double price, double volume, String chocolateType) {
        super(brand, name, price);
        this.volume = volume;
        this.chocolateType = chocolateType;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %f [объем: %f; Тип: %s]", brand, name, price, volume, chocolateType);
    }
}
