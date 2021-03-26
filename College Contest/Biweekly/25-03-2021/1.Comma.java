
//Comma

/*
Problem Statement

Whenever Nikhiya writes an integer he uses comma after every third digit from right.

For example:

1234567 is written as 1,234,567
333333 is written as 333,333
123 is written as 123
Your task is find how many commas he will use in total when he writes numbers from 1 to N?

Input Format

First line will contain a single integer T denoting number of testcases.
Next T lines will contain an integer N.
Constraints

1 <= T <= 100
1 <= N <= 
Output Format

For each testcase print a single integer-total number of commas.
Sample Input 0

2
1010
27182818284590
Sample Output 0

11
107730272137364
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            long n =  sc.nextLong();
            long x =  1000;
            long count = 0;
            while(n>=x){
                count += (n-x)+1;
                x = x*1000;
            }
            
            System.out.println(count);
            
        }
    }
}