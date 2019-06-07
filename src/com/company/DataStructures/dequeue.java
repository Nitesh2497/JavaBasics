package com.company.DataStructures;

import java.util.*;

public class dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max=1,temp=0,j=0;
        for (int i = 0; i < n; i++) {
            if(i<m){
                int num = in.nextInt();
                if(!deque.contains(num)){
                    temp++;
                }
                deque.add(num);
                if(temp>max){
                    max =temp;
                }
                continue;
            }
            int num = in.nextInt();
            deque.remove();
            if(!deque.contains(num)){
                if(temp<m){
                    temp++;
                }
            }else{
                temp--;
            }
            deque.add(num);
//            System.out.println(temp + "dequeue:" + deque);
            if(temp>max){
                max =temp;
            }
        }
        System.out.println(max);
    }
}
