

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Cobb
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

    

    


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        
        int t =  sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k =  sc.nextInt();

            int arr[] =  new int[n];

            for(int i=0;i<n;i++) arr[i] =  sc.nextInt();

            long max = Long.MIN_VALUE;

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n && j-i<=200;j++){
                    long val = (1l*(i+1)*(j+1)) -  (k*(arr[i]|arr[j]));

                    max =  Math.max(max,val);
                }
            }

            System.out.println(max);
        }


    }
}