

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Great_Graphs
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
        //PrintWriter out = new PrintWriter(System.out);
        int t =  sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();

            long arr[] =  new long[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            // ArrayList<ArrayList<Integer>> adj  =  new ArrayList<>();

            // for(int i=0;i<n;i++){
            //     adj.add(new ArrayList<>());
            // }

            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n;j++){
            //         adj.get(i).add(arr[j]-arr[i]);
            //     }
            // }

            // // for(int i=0;i<n;i++){
            // //     for(int j=0;j<n;j++){
            // //         System.out.print(adj.get(i).get(j) + " ");
            // //     }
            // // }


            Arrays.sort(arr);

           long sum =arr[n-1];
            long neg[] =  new long[n];

            neg[0]=0;

            for(int i=1;i<n;i++){

                   neg[i]=neg[i-1] + i*(arr[i]-arr[i-1]);
                    sum-=neg[i];
                
            }

            //System.out.println();

             System.out.println(sum);


        }

       

       
       


    }

    // static int dfs(int i,int j,int cost){



    // }
}