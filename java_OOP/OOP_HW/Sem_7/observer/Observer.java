package java_OOP.OOP_HW.Sem_7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, double salary);

    void considerTheOffer(Vacancy vacancy);

    public boolean equalsVacancy(Vacancy vacancy);
}
