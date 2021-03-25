
//Max-pre


/*
Given an integer array c[] of size n denoting coins you own. You can make some value x if you can choose some of your n coins such that their values sum up to x.

Print the maximum number of consecutive integer values that you can make with your coins starting from and including 0.

Note: You may have multiple coins of same value in the array.

Input Format

First line contains single integer n.
Second line contains n space seperated integers denoting array c[].
Constraints

1 <= n <= 1e5
1 <= c[i] <= 1e5
Output Format

Print the output: single integer denoting the maximum number of consecutive integer values that you can make with your coins starting from and including 0.
Sample Input 0

4
1 4 1 1
Sample Output 0

8
Explanation 0

can make the following values:

0: take []
1: take [1]
2: take [1,1]
3: take [1,1,1]
4: take [4]
5: take [4,1]
6: take [4,1,1]
7: take [4,1,1,1]
can make 8 consecutive integer values starting from 0.

Sample Input 1

2
1 3
Sample Output 1

2
Explanation 1

can make the following consecutive values:

0: take []
1: take [1]

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc =  new Scanner(System.in);
        int n  =  sc.nextInt();
        long arr [] =  new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        
        long count = 1;
        
        for (long a: arr) {
            if (a > count) break;
            count += a;
        }
        
        System.out.println(count);
    }
}