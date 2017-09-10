stats
Success Rate: 97.43% Max Score: 1 Difficulty: Easy

/*
 * Review the code provided in the editor below, then complete the solveMeFirst function so that it returns the sum of two integers read from stdin. 
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
         // Hint: Type return a+b; below 
        return a + b; 
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
