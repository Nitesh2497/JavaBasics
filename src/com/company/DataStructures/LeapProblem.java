package com.company.DataStructures;

import java.util.Scanner;

public class LeapProblem {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if(leap==0){
            return false;
        }
        boolean[] visited = new boolean[game.length];
        for (int i = 0; i < game.length; i++) {
            if(game[i]==0) {
                visited[i] = false;
            }
            else{
                visited[i] = true;
            }
        }
        int i = 0;
        int n = game.length;
        while (true) {
//            System.out.println("Index " + i);
            visited[i] = true;
            if (i + 1 >= n || i + leap >= n) {
                return true;
            }
            if (game[i + leap] == 1) {
                if (game[i + 1] == 1) {
                    if (i == 0) {
                        return false;
                    } else if (visited[i - 1]) {
                        return false;
                    } else {
                        i = i - 1;
                    }
                } else {
                    if(!visited[i+1]) {
                        i = i + 1;
                    }else if(game[i-1]==0 && !visited[i-1]){
//                        int x=findPreviousUnvisitedZero(i,visited,game);
                        i=i-1;
                    }
                   else{
                        return false;
                    }
                }
            } else {
                i = i+leap;
            }
        }
    }

    private static int findPreviousUnvisitedZero(int i, boolean[] visited, int[] game) {
        for(int j=i-1;j>=0;j--){
            if(game[j]==0 && !visited[j]){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
