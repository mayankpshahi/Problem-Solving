

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Borze
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

    
   private void printBorze(String s){
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();){
           if(s.charAt(i)=='.'){
               sb.append('0');
               i++;
           }
           else if(s.charAt(i)=='-'){
               if(s.charAt(i+1)=='.'){
                   sb.append('1');
                   i+=2;
               }else if(s.charAt(i+1)=='-'){
                sb.append('2');
                i+=2;
               }
           }
       }

       System.out.println(sb.toString());
   }
    


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        
        String s = sc.next();

      B_Borze obj =  new B_Borze();

      obj.printBorze(s);
       


    }
}