package com.company.DataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            HashMap<String,Integer> contact = new HashMap<>();
            for(int i=0;i<n;i++){
                String name = scanner.next();
                int phone = scanner.nextInt();
                contact.put(name,phone);
            }
            while (scanner.hasNext()){
                String name = scanner.next();
                if(contact.containsKey(name)){
                    System.out.println(name + "=" + contact.get(name));
                }else{
                    System.out.println("Not Found");
                }
            }
    }
}
