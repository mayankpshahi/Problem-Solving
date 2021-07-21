

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Putting_Plates
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
         int n =  sc.nextInt();
         int m =  sc.nextInt();
          
         int res [][] =  new int[n][m];
         for(int i=0;i<n;i+=2){
               res[i][0]=1;
               res[i][m-1]=1;
         }
         for(int i=2;i<m-2;i+=2){
            res[0][i]=1;
            res[n-1][i]=1;
         }

         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 System.out.print(res[i][j]);
             }
             System.out.println();
         }
         System.out.println();
          
       
         }

       


    }
}