

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_A_Variety_of_Operations
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
        //PrintWriter out = new PrintWriter(System.out);

        int t =  sc.nextInt();

        while(t-->0){
            int c =  sc.nextInt();
            int d =  sc.nextInt();

            if(Math.abs(c-d)%2!=0){
                System.out.println(-1);
            }else{
                if(c==0 && d==0) System.out.println(0);
                else if(c==d) System.out.println(1);
                else if(c==0 || d==0) System.out.println(2);
                else System.out.println(2);
                    
                    

            
            }
            
        }
       


    }
}