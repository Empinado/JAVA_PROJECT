package java_OOP.OOP_HW.Sem_7.observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, double salary);

    void sendAnOffer(Vacancy vacancy);

    void registerVacancy(Vacancy vacancy);
}
