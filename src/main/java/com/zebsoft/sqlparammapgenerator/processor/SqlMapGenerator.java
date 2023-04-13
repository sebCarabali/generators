package com.zebsoft.sqlparammapgenerator.processor;

import java.util.List;

public class SqlMapGenerator implements Processor{
    @Override
    public String generate(List<String> fields) {
        StringBuilder builder = new StringBuilder("new SqlMapParameterSource()");
        for(String field: fields) {
            builder.append(generateAddKey(field));
        }
        builder.append(";");
        return builder.toString();
    }

    private String generateAddKey(String field) {
        return String.format(".addValue(\"%s\", datosEntrada.get%s())", field, capitalize(field));
    }

    private String capitalize(String field) {
        return field.substring(0, 1).toUpperCase() + field.substring(1);
    }
}
