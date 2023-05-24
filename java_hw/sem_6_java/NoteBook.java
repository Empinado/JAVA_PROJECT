package java_hw.sem_6_java;

import java.util.Objects;

public class NoteBook {
    private String brand;
    private String model;
    private String size;
    private String operativeMemory;
    private String hardDisk;
    private String mySystem;
    private String color;

    public NoteBook(String brand, String model, String size, String operativeMemory, String hardDisk, String system, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.operativeMemory = operativeMemory;
        this.hardDisk = hardDisk;
        this.mySystem = system;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getMySystem() {
        return mySystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Objects.equals(brand, noteBook.brand) && Objects.equals(model, noteBook.model) && Objects.equals(size, noteBook.size) && Objects.equals(operativeMemory, noteBook.operativeMemory) && Objects.equals(hardDisk, noteBook.hardDisk) && Objects.equals(mySystem, noteBook.mySystem) && Objects.equals(color, noteBook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, size, operativeMemory, hardDisk, mySystem, color);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", operativeMemory='" + operativeMemory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", mySystem='" + mySystem + '\'' +
                ", color='" + color + '\'' +
                '}' + '\n';
    }
}