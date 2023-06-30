package java_OOP.OOP_HW.Sem_7.observer;


import java.util.Random;

public class Student implements Observer {

   

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private String desiredVacancy;

    public Student(String name, double minSalary, String desiredVacancy) {
        this.name = name;
        this.minSalary = minSalary;
        this.desiredVacancy = desiredVacancy;
    }

    public String getDesiredVacancy() {
        return desiredVacancy;
    }

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (minSalary <= salary){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Студент %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }

    @Override
    public void considerTheOffer(Vacancy vacancy) {
        if(equalsVacancy(vacancy) == true){
            System.out.printf("%s откликнулся на вакансию (%s).\n",this.name, vacancy.getVacancy());
            receiveOffer(name, minSalary);
        }
        else {System.out.printf("Предложенная вакансия(%s) для %s ,не соответствует желаемой(%s).\n",vacancy.getVacancy(), this.name, this.getDesiredVacancy());
        }
    }

    @Override
    public boolean equalsVacancy(Vacancy vacancy){
        
        return this.getDesiredVacancy() == vacancy.getVacancy();
    }
}
