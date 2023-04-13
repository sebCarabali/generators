package com.zebsoft.sqlparammapgenerator.processor;

import com.zebsoft.sqlparammapgenerator.utils.Utils;

import java.util.List;

public class MapToBckGenerator implements Processor {
    @Override
    public String generate(List<String> fields) {
        StringBuilder sb = new StringBuilder();
        for (String field :
                fields) {
            String capitalizedField = Utils.capitalize(field);
            sb.append(String.format("datoEntradaBck.set%1$s(datosEntrada.get%1$s());", capitalizedField)).append("\n");
        }
        return sb.toString();
    }
}
