

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Beautiful_Matrix
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
        int mat[][] =  new int[5][5];
        int  p=0,q=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat[i][j]= sc.nextInt();
                if(mat[i][j]==1 && p==0 && q==0){
                    p=i;
                    q=j;
                }
            }
        }

       System.out.println( Math.abs(2-p) +  Math.abs(2-q));





       


    }
}