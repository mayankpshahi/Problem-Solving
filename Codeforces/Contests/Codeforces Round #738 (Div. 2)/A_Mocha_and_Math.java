

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Mocha_and_Math
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

    

    

    static int checkBit(int pattern, int arr[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
        if ((pattern & arr[i]) == pattern)
            count++;
    return count;
}
    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
       // PrintWriter out = new PrintWriter(System.out);
       int t =  sc.nextInt();
       while(t-->0){
           int n =  sc.nextInt();
           int arr [] = new int[n];
           int max=Integer.MIN_VALUE;
           int val = 0;
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
               max = Math.max(max,arr[i]);
           }
           val=arr[0];
           for(int i=1;i<n;i++){
            val&=arr[i];
        }

    //        int res = 0, count;
  
  
    // for (int bit = 31; bit >= 0; bit--)
    // {
       
    //     count = checkBit(res | (1 << bit), arr, n);
  
   
    //     if ( count >= 2 )    
    //         res |= (1 << bit);    
    // }
  
    System.out.println(val);


       }
       


    }
}