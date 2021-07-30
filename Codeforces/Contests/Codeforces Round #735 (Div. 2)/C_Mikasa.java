

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class C_Mikasa
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
            int n =  sc.nextInt();
            int m =  sc.nextInt();
            m++;

            int res =  0 ;
            int end = 31;

            while(end>0){
                for(int i=0;i<=31;i++){
                    int val = n|((1<<i)-1);
                    if(val>=m){
                        res|=(1<<i)/2;
                        n|=(1<<i)/2;
                        end =i;
                        break;
                    }

                }
            }


            //another way
            // int ans = 0;
            // for (int k = 30; k >= 0 && n < m; k--) {
            //   if ((n >> k & 1) == (m >> k & 1)) continue;
            //   if ((m >> k & 1)!=0){ ans |= 1 << k; n |= 1 << k;}
            // }

            System.out.println(res);


        }
       


    }
}