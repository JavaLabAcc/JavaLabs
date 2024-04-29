package com.example.LR_5;

import java.sql.SQLException;
import java.io.IOException;
import com.example.LR_5.DatabaseManager;

public class Run {
    public static void main(String[] args) throws SQLException, IOException {
        DatabaseManager databaseManager = new DatabaseManager("students");
        databaseManager.createConnection();
        databaseManager.createTable(
            "students",
            "id integer primary key, name string, surname string, fatherName string, birthDay integer, birthMonth integer, birthYear integer, recordBookNumber integer"
        );

        System.out.println("ID | Name | Surname | Father name | Birth day | Birth Month | Birth Year | Record book number\n");
        String[] filteredData = databaseManager.getFilteredRecords("students", "birthMonth", "=", 4);
        for (int i = 0; i < filteredData.length; i++) {
            System.out.println(filteredData[i].replaceAll(" ", " | "));
        }
    }
}
