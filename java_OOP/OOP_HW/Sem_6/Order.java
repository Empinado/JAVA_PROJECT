package java_OOP.OOP_HW.Sem_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public abstract class Order implements SaveToFile, ConsoleInput{
    
    
    protected String clientName;
    protected String product;
    protected int qnt;
    protected double price;
    
    static int counter = 0;

    public static int id = 0;

    {
        id = ++counter;
    }


    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
        
    }

 
  
    public int getId() {
        return id;
    }
    
    @Override
    public void saveToJson() {
        
        String fileName = " Oreder #" + getId() + ".json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void saveToTxt() {
        
        String fileName = " Oreder #" + getId() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void saveToAllFormat() {
        
        String fileName = " Oreder #" + getId() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
       
        String fileName1 = fileName;
        fileName1 = " Oreder #" + getId() + ".json";
        try (FileWriter writer = new FileWriter(fileName1, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    Scanner scanner = new Scanner(System.in, "Cp866");

    @Override
     public void inputFromConsole(){
        
        double discount = 0.1;

        if(this instanceof IndividualOrder){
            this.clientName = prompt("Имя клиента: ");
            this.product = prompt("Продукт: ");
            this.qnt = Integer.parseInt(prompt("Кол-во: "));
            this.price = Integer.parseInt(prompt("Цена: "));
        
        }
        else{
            this.clientName = prompt("Название организации: ");
            this.product = prompt("Продукт: ");
            this.qnt = Integer.parseInt(prompt("Кол-во: "));
            this.price = Integer.parseInt(prompt("Цена: "));
            this.price = this.price - (this.price * discount);
            System.out.println("Ваша скидка составила: " + (this.price * discount));
            
        }    
    }
    
    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    
    
   

    
}
