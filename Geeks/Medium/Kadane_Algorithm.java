//Kadane's Algorithm

/*1) Divide the given array in two halves
2) Return the maximum of following three
….a) Maximum subarray sum in left half (Make a recursive call)
….b) Maximum subarray sum in right half (Make a recursive call)
….c) Maximum subarray sum such that the subarray crosses the midpoint*/
//O(nlogn) Solution


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Main
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int maxSum(String arr[],int left,int mid,int right){
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = mid; i >= left; i--)
        {
            sum = sum + Integer.parseInt(arr[i]);
            if (sum > left_sum)
            left_sum = sum;
        }

        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= right; i++)
        {
            sum = sum + Integer.parseInt(arr[i]);
            if (sum > right_sum)
            right_sum = sum;
        }

        return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));



    }

    static int maxSubArraySum(String arr[], int left,
                                      int right)
    {

    if (left == right)
        return Integer.parseInt(arr[left]);


    int mid = (left + right)/2;


    return Math.max(Math.max(maxSubArraySum(arr, left, mid),
                    maxSubArraySum(arr, mid+1, right)),
                    maxSum(arr, left, mid, right));
    }


    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int t = s.nextInt();
        while(t-->0){
            String str  = "";
            str = s.nextLine();
            str = s.nextLine();

            String a [] = str.split(" ");
            int max = maxSubArraySum(a,0,a.length-1);
            System.out.println(max);

        }



    }
}






//Second Approach Dynammic Programming
//O(n)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Main
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int maxSubArraySum(String a[], int size)
    {
    int max_so_far = Integer.parseInt(a[0]);
    int curr_max = Integer.parseInt(a[0]);

    for (int i = 1; i < size; i++)
    {
           curr_max = Math.max(Integer.parseInt(a[i]), curr_max+Integer.parseInt(a[i]));
        max_so_far = Math.max(max_so_far, curr_max);
    }
    return max_so_far;
    }


    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int t = s.nextInt();
        while(t-->0){
            String str  = "";
            str = s.nextLine();
            str = s.nextLine();

            String a [] = str.split(" ");
            int max = maxSubArraySum(a,a.length);
            System.out.println(max);

        }



    }
}
