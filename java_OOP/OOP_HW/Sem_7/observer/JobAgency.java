package java_OOP.OOP_HW.Sem_7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Vacancy> vacancies = new ArrayList<>(); //Список вакансий

    @Override
    public void registerVacancy(Vacancy vacancy) {  //Метод добавления вакансий в список 
        vacancies.add(vacancy);
    }

    public void mailing(Company company ){ //Метод рассылки зарегестрированных вакансий для зарегистрированных соискателей
        for (Vacancy vacancy : vacancies) {
            company.sendOutVacancies(vacancy);        
        }
    }   

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String nameCompany, double salary) {
        for (Observer observer: observers) {
            observer.receiveOffer(nameCompany, salary);
        }
    }

    @Override
    public void sendAnOffer(Vacancy vacancy) {
        for (Observer observer: observers) {
            observer.considerTheOffer(vacancy);
        } 
    }

}
