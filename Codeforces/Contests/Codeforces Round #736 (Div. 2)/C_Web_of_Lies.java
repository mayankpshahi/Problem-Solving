

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class Template
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
        PrintWriter out = new PrintWriter(System.out);
        int n =  sc.nextInt();
        int m =  sc.nextInt();

        ArrayList<ArrayList<Integer>> adj  = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int u =  sc.nextInt();
            int v =  sc.nextInt();

            adj.get(u-1).add(v-1);
            adj.get(v-1).add(u-1);
        }

        int q =  sc.nextInt();

        while(q-->0){
            int t[] =  new int[3];
            t[0] = sc.nextInt();
            if(t[0]==1){
                t[1] = sc.nextInt();
                t[2] = sc.nextInt();

                adj.get(t[1]-1).add(t[2]-1);
                adj.get(t[2]-1).add(t[1]-1);
            }
            if(t[0]==2){
                t[1] = sc.nextInt();
                t[2] = sc.nextInt();

                adj.get(t[1]-1).remove(new Integer(t[2]-1));
                adj.get(t[2]-1).remove(new Integer(t[1]-1));
            }
            if(t[0]==2){
                t[1] = sc.nextInt();
                t[2] = sc.nextInt();

                adj.get(t[1]-1).remove(new Integer(t[2]-1));
                adj.get(t[2]-1).remove(new Integer(t[1]-1));
            }
        }


       


    }
}