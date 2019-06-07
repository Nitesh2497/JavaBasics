package com.company.CodingNinjas;

import java.util.Scanner;

public class reverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] words = word.split(" ");
        String ans = "";
        for(String w : words){
            StringBuilder temp = new StringBuilder(w);
            ans+=temp.reverse() + " ";
        }
        System.out.println(ans);
    }

}
