

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B1_Wonderful_Coloring_1
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
        int t = sc.nextInt();
        while(t-->0){
            String s =  sc.next();
            int [] freq =  new int[26];

            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;

            }

            //Arrays.sort(freq);
            int red =0;
            int green=0;
            int res = 0;

            for(int i=0;i<26;i++){

                if(freq[i]>=2){
                    red++;
                    green++;
                }else if(freq[i]==1){
                    if(red<=green)red++;
                    else green++;
                }

            }
           
            res = Math.min(red,green);
            System.out.println(res);
        }
       


    }
}