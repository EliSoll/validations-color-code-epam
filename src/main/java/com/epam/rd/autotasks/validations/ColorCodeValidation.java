package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    private static final String HEX_WEBCOLOR_PATTERN
            = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";

    private static final Pattern pattern = Pattern.compile(HEX_WEBCOLOR_PATTERN);

    public static boolean validateColorCode(String color) {
        if (color != null && !color.isEmpty() && !color.equals(" ")) {
            Matcher matcher = pattern.matcher(color);
            return matcher.matches();
        }
        return false;
    }
}





