package com.company.CodingNinjas;

import java.util.Scanner;

public class compressTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count =1;
        String output=input.charAt(0)+"";
        for(int i=1;i<input.length();i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
                if (i == input.length() - 1) {
                    output += count;
                }
            } else {
                if (count > 1) {
                    output += count + ""+input.charAt(i);
                } else {
                    output += input.charAt(i);
                }
                count=1;
            }
        }
        System.out.println(output);
    }
}
