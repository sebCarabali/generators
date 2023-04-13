package com.zebsoft.sqlparammapgenerator.file.reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Reader {
    List<String> readFields(String fileName) throws IOException;
}
