// Cyclically rotate an array by one

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
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
        FastReader s=new FastReader();
       int t = s.nextInt();
       while(t-->0){

            String str  = "";
            str = s.nextLine();
            str = s.nextLine();

            String a[] = str.split(" ");

            String p = a[a.length - 1];

            for(int i=a.length-1;i>0;i--){
            a[i] = a[i-1];

            }

            a[0] = p;

            for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

            System.out.println();



       }


    }
}
