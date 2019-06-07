package com.company.CodingNinjas;

import java.util.*;

public class MaximiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int i=0,j=0,maxSum = 0,s1 =0,s2=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                s1+=arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                s2+=arr2[j];
                j++;
            }else if(arr1[i]==arr2[j]){
                s1+=arr1[i];
                s2+=arr2[j];
                i++;
                j++;
                if(s1>=s2){
                    maxSum+=s1;
                    s1=0;
                    s2 = 0;
                }else{
                    maxSum+=s2;
                    s1=0;
                    s2 = 0;
                }
            }
        }
        while (i<arr1.length){
            s1+=arr1[i];
            i++;
        }
        while (j<arr2.length){
            s2+=arr2[j];
            j++;
        }
        if(s1>=s2){
            maxSum+=s1;
        }else{
            maxSum+=s2;

        }
        System.out.println("MaxSum is " + maxSum);
    }
}
