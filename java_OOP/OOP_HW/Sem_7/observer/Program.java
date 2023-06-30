package java_OOP.OOP_HW.Sem_7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        // Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        // Company google = new Company("Google", 100000, jobAgency);
        // Company yandex = new Company("Yandex", 120000, jobAgency);

        // Master ivanov = new Master("Ivanov");
        // Master petrov = new Master("Petrov");
        // Student sidorov = new Student("Sidorov");

        // jobAgency.registerObserver(ivanov);
        // jobAgency.registerObserver(petrov);
        // jobAgency.registerObserver(sidorov);

        // for (int i = 0; i < 2; i++){
        //     geekBrains.needEmployee();
        //     google.needEmployee();
        //     yandex.needEmployee();
        // }

        Master master1 = new Master("Alex", 50000, "midle");
        Student student1 = new Student("Max", 120000, "intern");
        MegaMaster megaMaster1 = new MegaMaster("MasterOfMasters", 200000, "senjor");
        
        Vacancy vacancy1 = new Vacancy("midle", 100000.00);
        Vacancy vacancy2 = new Vacancy("intern", 40000.00);
        Vacancy vacancy3 = new Vacancy("senjor", 100000.00);

        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(megaMaster1);

        jobAgency.registerVacancy(vacancy1);
        jobAgency.registerVacancy(vacancy2);
        jobAgency.registerVacancy(vacancy3);    

        // jobAgency.sendAnOffer(vacancy1); //проверка

        Company geekgeek = new Company("Geekgeek", jobAgency, vacancy1);

        //geekgeek.sendOutVacancies(vacancy1); //финальная проверка

        jobAgency.mailing(geekgeek); //Еще более финальная проверка. 
        
    }

}
