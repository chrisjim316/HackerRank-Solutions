stats
Success Rate: 96.19% Max Score: 10 Difficulty: Easy

Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing  space-separated integers describing the columns.

Constraints


Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.


import java.io.*;
import java.util.*;
import java.util.Scanner; 

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int d1 = 0;
        int d2 = 0;
        
        for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            int currentInput = input.nextInt();
            if(i == j)
                d1 += currentInput;
            if(i+j == (n-1))
                d2 += currentInput; 
        }
        }
        
        System.out.println(Math.abs(d1-d2));
     
        

    }
}
