

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Beautiful_Year
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

    static boolean distinct(int year){
        String s = String.valueOf(year);
        int freq[] =  new int[10];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>1) return false;
        }

        return true;
        
    }

    


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        int year =  sc.nextInt();
         int res = 0;
        for(int i=year+1;i<100000;i++){
            if(distinct(i)){
                res=i;
                break;
            }
        }

        System.out.println(res);
       


    }
}