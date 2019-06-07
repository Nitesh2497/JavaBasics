package com.company;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class pattern {
    public static void isPateernValid() {
        String pattern = "[AZ[a-z](a-z)";
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (
                PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
