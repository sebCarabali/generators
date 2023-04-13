package com.zebsoft.sqlparammapgenerator.utils;

public final class Utils {
    private Utils() {

    }

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
