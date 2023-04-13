package com.zebsoft.sqlparammapgenerator;

import com.zebsoft.sqlparammapgenerator.file.reader.Reader;
import com.zebsoft.sqlparammapgenerator.file.reader.TXTReader;
import com.zebsoft.sqlparammapgenerator.processor.MapToBckGenerator;
import com.zebsoft.sqlparammapgenerator.processor.Processor;
import com.zebsoft.sqlparammapgenerator.processor.SqlMapGenerator;

import java.beans.PropertyEditor;
import java.io.IOException;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new TXTReader();
        Processor processor = new SqlMapGenerator();
        List<String> fields = reader.readFields("C:\\Users\\Desktop\\IdeaProjects\\sql-param-map-generator\\src\\main\\resources\\fields.txt");
        String paramMapString = processor.generate(fields);
        processor = new MapToBckGenerator();
        String bckMap = processor.generate(fields);
        System.out.println(paramMapString);
        System.out.println(bckMap);
   }
}