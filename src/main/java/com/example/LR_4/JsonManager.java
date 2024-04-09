package com.example.LR_4;

import java.io.*;
import com.google.gson.*;
import com.example.LR_4.model.University;

public class JsonManager {
    Gson gson = new Gson();

    public JsonManager() {}

    public void showFile(String fileName) throws IOException {
        System.out.println(this.gson.toJson(this.readFile(fileName)));
    }

    public Object readFile(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        University jsonContent = this.gson.fromJson(fileReader, University.class);
        fileReader.close();
        return jsonContent;
    }

    public void writeFile(Object object, String fileName) throws IOException{
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(this.gson.toJson(object));
        fileWriter.close();
    }
}