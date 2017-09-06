Stats
Success Rate: 89.54% Max Score: 15 Difficulty: Easy

Given a 6x6 2D Array, 

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g


/*
 * Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 * There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //only index 0 - 3 are possible to form an hourglass
        int largSum = -100;
        for(int r = 0; r < 4; r++){
            for(int c = 0;c < 4;c++){
                int top, middle, bottom;
                top = arr[r][c] + arr[r][c+1] + arr[r][c+2];
                middle = arr[r+1][c+1];
                bottom = arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
                if(top + middle + bottom > largSum){
                    largSum = top + middle + bottom;
                }
            }
        }
        
        System.out.println(largSum);
    }
}
