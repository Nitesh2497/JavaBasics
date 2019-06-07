package com.company;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Tokens {

    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
//        StringTokenizer st = new StringTokenizer(s);
//        System.out.println(st.countTokens());
//        System.out.println(s.split("").length);
            String delims = "[ .,?!']+";
            String[] tokens = s.trim().split(delims);
            System.out.println(tokens.length);
            for(String temp:tokens){
                System.out.println(temp);
            }
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
    }
}
