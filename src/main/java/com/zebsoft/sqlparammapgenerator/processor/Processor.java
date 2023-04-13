package com.zebsoft.sqlparammapgenerator.processor;

import java.util.List;

public interface Processor {
    String generate(List<String> fields);
}
