package com.company.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for(int i=0;i<q;i++){
            String temp = scanner.next();
            int x = scanner.nextInt();
            if(temp.equals("Insert")){
                int y = scanner.nextInt();
                arr.add(x,y);
            }else{
                arr.remove(x);
            }
        }
        for(int x:arr){
            System.out.printf(x +" ");
        }
    }
}
