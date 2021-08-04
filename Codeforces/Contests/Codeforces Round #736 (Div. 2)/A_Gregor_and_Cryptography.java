

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Gregor_and_Cryptography
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
       // PrintWriter out = new PrintWriter(System.out);
        int t =  sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();
            n--;
            //boolean flag =false;
            long first = 0l;
            long second = 0l;
            for(long i=2l;i<=n;i++){
                
                    if(n%i==0){
                        first = i;
                        if((n/i)!=first){
                            second = n/i;
                            break;
                        }else{
                               for(long j = 2l;i<=n;i++){
                                   long q= first*j;
                                if(n%q==0){
                                    second = q;
                                    break;
                                }
                               }
                               break;
                        }
                    }
               
            }

            System.out.println(first + " " + second);
        }
       


    }
}