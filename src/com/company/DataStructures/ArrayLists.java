package com.company.DataStructures;

import java.util.*;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            int d = scanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<>();
            for(int j=0;j<d;j++){
                    ar.add(scanner.nextInt());
                }
            arr.add(ar);
        }
        int q = scanner.nextInt();
        for(int i=0;i<q;i++){
            int x =scanner.nextInt();
            int y =scanner.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
