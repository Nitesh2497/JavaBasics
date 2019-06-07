package com.company.DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class bitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int m =  scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        while(m>0){
            String operation = scanner.next();
            int temp1 = scanner.nextInt();
            int temp2 = scanner.nextInt();
            if(operation.equals("AND")){
                if(temp1==1){
                    b1.and(b2);
                }else{
                    b2.and(b1);
                }
            }else if(operation.equals("OR")){
                if(temp1==1){
                    b1.or(b2);
                }else{
                    b2.or(b1);
                }
            }else if(operation.equals("XOR")){
                if(temp1==1){
                    b1.xor(b2);
                }else{
                    b2.xor(b1);
                }
            }else if(operation.equals("FLIP")){
                if(temp1==1){
                    b1.flip(temp2);
                }else{
                    b2.flip(temp2);
                }
            }else if(operation.equals("SET")){
                if(temp1==1){
                    b1.set(temp2);
                }else{
                    b2.set(temp2);
                }
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
            m--;
        }
    }
}
