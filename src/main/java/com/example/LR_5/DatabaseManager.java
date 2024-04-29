package com.example.LR_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private String name;
    private Connection connection;
    private Statement statement;

    public DatabaseManager(String name) {
        this.name = name;
    }

    public void createConnection() throws SQLException {
        this.connection = DriverManager.getConnection(String.format("jdbc:sqlite:%s.db", this.name));
        this.statement = this.connection.createStatement();
    }

    public void createTable(String tableName, String tableTemplate) throws SQLException {
        this.statement.executeUpdate(String.format("create table %s (%s)", tableName, tableTemplate));
    }

    public void createRecord(String tableName, String fields, String values) throws SQLException {
        this.statement.executeUpdate(String.format("insert into %s (%s) values (%s)", tableName, fields, values));
    }

    public String[] getFilteredRecords(String tableName, String filterField, String filterSign, int filterValue) throws SQLException {
        ResultSet filterResult = this.statement.executeQuery(String.format("select * from %s where %s %s %d", tableName, filterField, filterSign, filterValue));
        String[] data = new String[0];
        while (filterResult.next()) {
            String[] oldData = data;
            String[] newData = new String[data.length + 1];
            for (int i = 0; i < oldData.length; i++) {
                newData[i] = oldData[i];
            }
            newData[oldData.length] = String.join(
                " ",
                filterResult.getString(1),
                filterResult.getString(2),
                filterResult.getString(3),
                filterResult.getString(4),
                filterResult.getString(5),
                filterResult.getString(6),
                filterResult.getString(7),
                filterResult.getString(8)
            );
            data = newData;
        }
        return data;
    }
}
