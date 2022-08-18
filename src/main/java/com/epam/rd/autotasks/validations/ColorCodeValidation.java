package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        return color != null && !color.isEmpty() && !color.equals(" ") && color.matches("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
    }
}





