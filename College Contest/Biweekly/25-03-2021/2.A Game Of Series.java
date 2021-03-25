
//A Game Of Series

/*
Question Description

Let us define a series whose nth term is defined by f(n) = f(n-1) + n*(n+7) .

Given that f(0) = 0, find the Ath term of the series modulo 1000000007.

Input Format

First line contains T number of testcases.
Now for each testcase there is an integer denoting 'A'

Constraints

1 <= A <= 300000
1 <= T <= 5

Output Format

Return an integer, the answer to the problem.

Sample Input 0

2
1
2
Sample Output 0

8
26

*/

import java.io.*;
import java.util.*;

public class Solution {
     static long find (int n){
        long f[] = new long[n+1];
        f[0] = 0 ;
        for(int i=1;i<=n;i++){
            f[i] = f[i-1] + (i*(i+7));
        }
        return f[n]%1000000007;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
          int n =  sc.nextInt();;
            
            long out = find(n);
            
            System.out.println(out);
            
        }
    }
}