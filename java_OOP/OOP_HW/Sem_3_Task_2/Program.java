package java_OOP.OOP_HW.Sem_3_Task_2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();
//генератор рандомных типов рабочего 
    static Employee generateEmployee(){
        int WorkerType = random.nextInt(1,3);
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(25,60);
        
        if(WorkerType == 1){
            int salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(9)], age,salary);
        }
        else{
            int hoursWorked = random.nextInt(10,45);
            int salaryPerHour = random.nextInt(1500,3000);
            return new FreeLancer(names[random.nextInt(names.length)], surnames[random.nextInt(9)], age,hoursWorked,salaryPerHour);
        }   
    }

    public static void main(String[] args) {
        //Worker worker1 = generateEmployee();
        //System.out.println(worker1);
        
        //Тест создания дочерних классов. Реализованы разные отображения через перегрузку ToString.   
        //Worker worker1 = new Worker("Саша", "Дегтярев", 25,40000); 
        //System.out.println(worker1.toString());
        //FreeLancer freeLancer1 = new FreeLancer("Александр", "Дегтярев", 25, 45, 1500);
        //System.out.println(freeLancer1.toString());
        
        Employee[] employees = new Employee[15];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);
        //Arrays.sort(employees, new SalaryComparator()); // Компаратор по з/п

        for(Employee employee : employees){
            System.out.println(employee);
        }


    }
}
    

    

    

