//Rearrange an array with O(1) extra space

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        //testcases
        int t =Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];

            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);

           //calling arrange() function
           new rearrange().arrange(arr, n);

           //printing the elements
           for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class rearrange
{
    // Function to rearrange the elements
    // arr: input array
    // n: size of array
    static void arrange(long arr[], int n)
    {
        // your code here
        for (int i = 0; i < n; i++)
            arr[(int)i] += (arr[(int)arr[(int)i]] % n) * n;

        for (int i = 0; i < n; i++)
            arr[(int)i] /= n;

    }
}
