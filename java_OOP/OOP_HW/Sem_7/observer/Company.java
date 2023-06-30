package java_OOP.OOP_HW.Sem_7.observer;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public Company(String nameCompany, Publisher jobAgency, Vacancy vacancy) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        double salary = random.nextDouble(2500, 150000);
        jobAgency.sendOffer(nameCompany, salary);
    }

    public void sendOutVacancies(Vacancy vacancy){
        jobAgency.sendAnOffer(vacancy);
    }
}
