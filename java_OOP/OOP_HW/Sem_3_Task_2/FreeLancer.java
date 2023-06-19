package java_OOP.OOP_HW.Sem_3_Task_2;

public class FreeLancer extends Employee {

    protected double salaryPerHour;
    protected int hoursWorked;

    public FreeLancer(String name, String surname, int age, int hoursWorked, double salaryPerHour) {
        super(name, surname, age);
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
        //TODO Auto-generated constructor stub
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }


    @Override
    public double calculateSalary() {
       return(this.hoursWorked * this.salaryPerHour);
    }

    @Override
    public String toString() {
        return String.format("%s %s;%d лет; Фрилансер; заработал: %.2f (руб.) за %d часа/часов труда.",
                surname, name, age, calculateSalary(), hoursWorked);
    }

    
    
}
