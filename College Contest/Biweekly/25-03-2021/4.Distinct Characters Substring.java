

//Distinct Characters Substring

/*
You are given a string A of lowercase English alphabets. Let Xi be the number of substrings of A consisting of at least 'i' distinct characters.


TASK: Determine the value of Xi mod 1e9 + 7 for all i ,where i can take the values in the range [1,26] (both inclusive).
Input Format

First integer is T denoting number of Testcases.
Now next T lines contains two lines :
1st line contains N denoting length of string.
2nd line contains character array of N length denoting string.

Constraints

1 <= T <= 10
1 <= |A| <= 5*1e5

Output Format

Print the array of 26 integers in which the ith integer representing the value of X i mod 1e9 + 7 in the same order.

Sample Input 0

2
4 
a a b c
3
a b c
Sample Output 0

10 5 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
6 3 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
Explanation 0

Explanation for TC-1:

 
The value of Xi can be calculated as follows:
For i=1 , every substring of S have at least 1 distinct characters hence Xi= 4*5/2= 10
For i=2 substring [aab,aabc,bc,abc,ab]
for i=3 substrings are [aabc,abc]
for i<=4 no substrings can have more than 3 distinct characters, hence Xi=0. 
Explanation for TC-2:

 
The value of Xi can be calculated as follows:
For i=1 , every substring of S have at least 1 distinct characters hence Xi= 6
For i=2 substring [ab,abc,bc], Xi=3
for i=3 substrings are [abc], Xi=1
for i <= 4 no substrings can have more than 3 distinct characters, hence Xi=0. 

*/

import java.io.*;
import java.util.*;

public class Solution {
     static int countDistinct(char[] arr, int k)
    {
        
       int output = 0;
  
       int n = arr.length;
       int count[] = new int[26];

        for (int i = 0; i < n; i++)
        {
            int distinct = 0;
            
            Arrays.fill(count, 0);
            for (int j=i; j<n; j++)
            {
                if (count[arr[j] - 'a'] == 0)
                    distinct++;
  
                count[arr[j] - 'a']++;
  
                
                if (distinct >= k)
                    output++;
            }
        }
  
        return output%1000000007;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
            
           char arr[] = new char[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.next().charAt(0);
            }
            
            //char arr []= s.toCharArray(); 
            
            for(int i=1;i<27;i++){
                if(i!=26){
                System.out.print(countDistinct(arr,i));
                System.out.print(" ");
                }
                else{
                    System.out.print(countDistinct(arr,i));
                }
                
            }
           System.out.println();
        }
    }
}