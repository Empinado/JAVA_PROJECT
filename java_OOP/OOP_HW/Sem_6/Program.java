package java_OOP.OOP_HW.Sem_6;
//Сделаем класс Order
//Отдельный класс SaveToFile
public class Program {
    public static void main(String[] args) {
    
        IndividualOrder individualOrder1 = new IndividualOrder(null, null, 0, 0);
        individualOrder1.inputFromConsole();
        individualOrder1.saveToTxt();

        EntityOrder entityOrder1 = new EntityOrder(null, null, 0, 0);
        entityOrder1.inputFromConsole();
        entityOrder1.saveToJson();
        
        EntityOrder entityOrder2 = new EntityOrder(null, null, 0, 0);
        entityOrder2.inputFromConsole();
        entityOrder2.saveToAllFormat();
   
    }
}
