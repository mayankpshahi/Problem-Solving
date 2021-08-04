

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Ice_Skating
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

    

    static int n;
    static int adj [][];
    static int vis[];
    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        //PrintWriter out = new PrintWriter(System.out);

        n =  sc.nextInt();

        adj =  new int[n][2];

        vis =  new int[n];
        Arrays.fill(vis,-1);

        for(int i=0;i<n;i++){
            adj[i][0] = sc.nextInt();
            adj[i][1] = sc.nextInt();
        }

        int res = 0;

        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                dfs(i);
                res++;
            }
        }

        System.out.println(res-1);



       


    }
    static void dfs(int coordinate){

        vis[coordinate]++;
        for(int i=0;i<n;i++){
            if((adj[i][0]==adj[coordinate][0] || adj[i][1]==adj[coordinate][1]) && vis[i]==-1)
              dfs(i);
        }

    }
}