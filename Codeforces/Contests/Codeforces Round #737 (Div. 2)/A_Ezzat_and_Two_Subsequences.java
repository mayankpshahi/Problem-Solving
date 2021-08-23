

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Ezzat_and_Two_Subsequences
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

    
    // public void solve(){
    //     FastReader sc1=new FastReader();
       


    // }
    


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        //PrintWriter out = new PrintWriter(System.out);
        int t =  sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
        long arr[] =  new long[n];
        for (int i=0;i<n;i++) arr[i]= sc.nextLong();

        Arrays.sort(arr);
       double sum = 0.00;
        for (int i=0;i<n-1;i++) sum+=(double)arr[i];
         
       // System.out.println(sum);
        double avg = (double)(sum/(n-1));
        
        avg+=(double)(arr[n-1]);

        System.out.println(avg);

        
        }
       


    }
}