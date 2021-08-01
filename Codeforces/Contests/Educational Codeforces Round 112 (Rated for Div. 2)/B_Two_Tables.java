

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;

public class B_Two_Tables
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

       public int[] nextIntArr(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
    }

    

    


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        while (t-- > 0) {
            int W = sc.nextInt();
            int H = sc.nextInt();
            int[] s = sc.nextIntArr(2);
            int[] e = sc.nextIntArr(2);
            int[] need = sc.nextIntArr(2);
            int[] d2 = new int[]{e[0] - s[0], e[1] - s[1]};
            double ans = 1e18;
            if (d2[0] + need[0] <= W) {
                if (s[0] >= need[0])
                    ans = 0;
                else ans = Math.min(ans, need[0] - s[0]);
 
                if (W - e[0] >= need[0])
                    ans = 0;
                else ans = Math.min(ans, need[0] - (W - e[0]));
            }
            if (d2[1] + need[1] <= H) {
                if (s[1] >= need[1])
                    ans = 0;
                else ans = Math.min(ans, need[1] - s[1]);
 
                if (H - e[1] >= need[1])
                    ans = 0;
                else ans = Math.min(ans, need[1] - (H - e[1]));
            }
 
            pw.println(ans==1e18?-1:ans);
        }
        pw.flush();



       


    }
}