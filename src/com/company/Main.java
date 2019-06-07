package com.company;

import java.util.Date;
import java.util.HashMap;

public class Main {

    public static boolean isAnagram(String a,String b){
        HashMap<Character,Integer> freq1 = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(freq1.get(a.charAt(i))!=null){
//                Integer value = freq1.get(a.charAt(i));
//                freq1.replace(a.charAt(i),++value);
                freq1.compute(a.charAt(i),(key,val)->val+1);
            }else{
                freq1.put(a.charAt(i),1);
            }
        }

        HashMap<Character,Integer> freq2 = new HashMap<>();
        for(int i=0;i<b.length();i++){
            if(freq2.get(b.charAt(i))!=null){
                freq2.compute(b.charAt(i),(key,val)->val+1);
            }else{
                freq2.put(b.charAt(i),1);
            }
        }
        boolean result = true;
//        for(int i=0;i<a.length();i++){
//            if(freq1.get(a.charAt(i))!=freq2.get(a.charAt(i))){
//                result = false;
//                System.out.println("Not Anagrams");
//                break;
//            }
//        }
        for(Character key:freq1.keySet()){
            if(freq1.get(key)!=freq2.get(key)){
                System.out.println("Not Anagrams");
                return false;
            }
        }
        System.out.println("Anagrams");
        return true;
    }

    public static void isAnagrams(String a,String b){
        if(a.length()!=b.length()){
            System.out.println("Not Anagrams");
            return;
        }
        for(int i=0;i<a.length();i++){
            String temp = String.valueOf(a.charAt(i));
            if(b.contains(temp)){
                b=b.replaceFirst(temp,"");
            }else{
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }

    public static void main(String[] args) {
        String a = "aabb";
        String b = "aabba";
//        b=b.replaceFirst("k","");
        isAnagrams(a,b);
//        isAnagram(a,b);
    }
}
