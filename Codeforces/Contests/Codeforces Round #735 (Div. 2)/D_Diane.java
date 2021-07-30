

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class D_Diane
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
            StringBuilder sb  =  new StringBuilder();

            if (n <= 3) {
                for (int i = 0; i < n; i++) {
                    sb.append((char) (i + 'a'));
                }
            } else{
                int mid =  n/2;
                for(int i=0;i<mid;i++) sb.append('a');
                if(n%2==0) sb.append('b');
                else{
                    sb.append('b');
                    sb.append('c');
                } 

                for(int i=0;i<mid-1;i++) sb.append('a');
            }

            System.out.println(sb.toString());
        }
       


    }
}