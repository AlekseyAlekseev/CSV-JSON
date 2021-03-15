package ru.netology;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        /**
         * Маска названия колонок и их порядка в CSV-файле
         */
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        /**
         * Имя считываемого CSV-файла
         */
        String fileName = "data.csv";

        Type listType = new TypeToken<List<Employee>>() {}.getType();

        /**
         * Сохраняем данные из CSV-файла в объект
         */
        List<Employee> list = ParseCsv.parseCSV(columnMapping, fileName);

        /**
         * Преобразуем объект в строчку формата JSON
         */
        String json = ToJson.writeToJson(list, listType);

        /**
         * Сохраняем данные полученные из метода "writeToJson" в data.json
         */
        ToJson.writeString(json);




    }
}
