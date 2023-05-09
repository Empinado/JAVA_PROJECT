package java_hw.sem_1_java.sem_2_java;
//В файле содержится строка с исходными данными в такой форме:
//          {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//          Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//          SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) throws IOException {

        // Читаем из файла и запысываем в StringBuilder sb
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("sem_2_java/task_1_person.json"))) {
            String data;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> dictionary = new HashMap<>();
        //Парсим строку, убираем лишние символы и записываем данные в словарь
        String[] keys = sb.toString().replace("{", "").replace("\"", "").
                replace("}", "").replaceAll("\\s", "").split(",");
        for (String data : keys) {
            String[] keyValue = data.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            dictionary.put(key, value);
        }
        System.out.println(dictionary);
        // Вывод из словаря в вид согласно ТЗ
        String name = dictionary.get("name");
        String country = dictionary.get("country");
        String city = dictionary.get("city");
        System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name,
                country, city);
    }
}