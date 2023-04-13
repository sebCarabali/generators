package com.zebsoft.sqlparammapgenerator.file.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TXTReader implements Reader{
    @Override
    public List<String> readFields(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName), UTF_8);
    }
}
