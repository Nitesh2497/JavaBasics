package com.company.DataStructures;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    private static final HashMap<Character,Character> brackets = new HashMap<>();
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }

    boolean checkParenthesesBalance(String str){
        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (brackets.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String input = sc.next();
            Stack<String> stack = new Stack<>();
            for(int i=0;i<input.length();i++){
                String input1 = String.valueOf(input.charAt(i));
                if(stack.empty()){
                    stack.push(input1);
                    continue;
                }
                String temp = stack.peek();
                if((temp.equals("{") && input1.equals("}")) ||(temp.equals("(") && input1.equals(")")) || (temp.equals("[") && input1.equals("]"))) {
                    stack.pop();
                }else{
                    stack.push(input1);
                }
            }
            if(stack.empty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
