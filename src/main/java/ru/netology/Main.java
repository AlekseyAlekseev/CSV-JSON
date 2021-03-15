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
        List<Employee> list = ParseCsv.parsingCSV(columnMapping, fileName);

        /**
         * Преобразуем объект в строчку формата JSON
         */
        String json = ParseJson.listToFormatJson(list, listType);

        /**
         * Сохраняем данные полученные из метода "listToFormatJson" в data.json
         */
        ParseJson.writeJson(json);




    }
}
