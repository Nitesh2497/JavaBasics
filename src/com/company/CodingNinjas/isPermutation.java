package com.company.CodingNinjas;

import com.company.DataStructures.Array;

import java.util.*;

public class isPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        StringBuilder input11 = new StringBuilder(input1);
        StringBuilder input22 = new StringBuilder(input2);
        char[] arr1 = input1.toCharArray();
        char[] arr2 = input2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("False;");
            }
        }
        System.out.println("True");
//        return true;
    }
}
