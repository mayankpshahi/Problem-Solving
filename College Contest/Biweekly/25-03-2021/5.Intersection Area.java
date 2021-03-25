

//Intersection Area

/*
You are given the top right and bottom left corners of 2 rectangles, print the total area of overlap/intersection.

Input Format

First line contains T, number of test cases. For each test case:
First line contains x1 y1 x2 y2, top right and bottom left coordinates of 1st rectangle
Second line contains x3 y3 x4 y4, top right and bottom left coordinates of 2nd rectangle
Constraints

1 <= T <= 100
-10^4 <= x1, x2, x3, x4, y1, y2, y3, y4 <= 10^4
Output Format

For each testcase, print the area of the intersection.
Sample Input 0

1
4 3 -2 -2
2 2 -3 -3
Sample Output 0

16
Explanation 0

The rectangle formed by the intersection will have (2, 2) as its top-right corner and (-2, -2) as its bottom-left corner. The area will be (2-(-2)) * (2-(-2)) = 4 * 4 = 16


*/


import java.io.*;
import java.util.*;

public class Solution {
    static int FindPoints(int x1, int y1, 
                       int x2, int y2,
                       int x3, int y3, 
                       int x4, int y4)
{
    
    int x5 = Math.max(x1, x3);
    int y5 = Math.max(y1, y3);
  
    
    int x6 = Math.min(x2, x4);
    int y6 = Math.min(y2, y4);
  
  
    if (x5 > x6 || y5 > y6) 
    {
        
        return 0 ;
    }
  
  
  
    // gives top-left point
    // of intersection rectangle
    int x7 = x5;
    int y7 = y6;
  
   
  
    // gives bottom-right point
    // of intersection rectangle
    int x8 = x6;
    int y8 = y5;
  
   int area = Math.abs(x8-x7)*Math.abs(y8-y7);
       
       return area;
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            
            System.out.println(FindPoints( x2,  y2, 
                        x1, y1,
                        x4,  y4, 
                        x3,  y3));
            
        }
    }
}