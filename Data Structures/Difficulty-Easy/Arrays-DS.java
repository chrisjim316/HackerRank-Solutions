Stats
Success Rate: 93.68% Max Score: 10 Difficulty: Easy

/*
 * Given an array of  integers, print each element in reverse order as a single line of space-separated integers.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = in.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
