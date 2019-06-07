package com.company.DataStructures;

import java.util.Scanner;

public class NegativeSubArray {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int counter = 0;
        int noOfCombos = 1;
        while (noOfCombos<=n) {
            for (int i = 0; i <= n - noOfCombos; i++) {
                int temp = arr[i];
//                System.out.println(temp);
                for (int j = 1; j < noOfCombos; j++) {
                    temp += arr[i + j];
//                    System.out.println(temp);
                }
                if (temp < 0) {
                    counter++;
                }
//            noOfCombos++;
            }
            noOfCombos++;
        }
        System.out.println(counter);
    }
}
