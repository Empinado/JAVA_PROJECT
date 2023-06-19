package java_OOP.OOP_HW.Sem_3_Task_2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        return Double.compare(o1.calculateSalary(), o2.calculateSalary()); //можем поменять местами, чтобы инвертировать сравнение 
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);

    }
}
