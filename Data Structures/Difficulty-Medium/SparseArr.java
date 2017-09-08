Stats
Success Rate: 96.39% Max Score: 25 Difficulty: Medium

There is a collection of  strings ( There can be multiple occurences of a particular string ). Each string's length is no more than  characters. There are also  queries. 

Input Format

The first line contains , the number of strings.
The next  lines each contain a string.
The nd line contains , the number of queries.
The following  lines each contain a query string.

Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.

/*
 * For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of  strings.
 */
 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lenStr = sc.nextInt();
        
        Map<String, Integer> numInputs = new HashMap<String, Integer>(lenStr);
        
        for(int i = 0; i < lenStr; i++) {
            String str = sc.next();
            
            Integer count = numInputs.get(str);
            if (count == null) {
                count = 0;
            }
            
            count++;
            numInputs.put(str, count);
        }
        
        int numQueries = sc.nextInt();
        String[] queries = new String[numQueries];
        for(int j = 0; j < numQueries; j++){
            queries[j] = sc.next();
        }
        
        for(int i = 0; i < numQueries; i++){
            Integer count = numInputs.get(queries[i]);
            if(count == null){
                count = 0;
            }
            
            System.out.println(count);
        }

    }
}
