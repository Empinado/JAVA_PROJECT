package java_OOP.OOP_HW.Sem_3_Task_2;

public abstract class Employee implements Comparable<Employee> {
    
    protected String name;

    protected String surname;

    protected double salary; // Ставка з/п

    protected int age;

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

     /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    //сортировка по фамилии и зп
   

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Double.compare(calculateSalary(), o.calculateSalary());
        else
            return res;
    }
        
}
