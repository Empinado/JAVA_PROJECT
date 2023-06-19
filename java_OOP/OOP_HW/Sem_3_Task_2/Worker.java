package java_OOP.OOP_HW.Sem_3_Task_2;

public class Worker extends Employee{

    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }
    
    @Override
    public double calculateSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s;%d лет;Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
