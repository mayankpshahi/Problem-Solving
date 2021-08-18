

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class C_Mocha_and_Hiking
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

    
    // static ArrayList<Integer> l;
    // static void dfs( ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,int i,int n){
    //       res.add(i);
    //       if(res.size()==n+1){
    //           l = res;
    //           return;
    //       }
    //       if(adj.get(i).size()!=0){
    //       for(int a:adj.get(i)){
    //           dfs(adj,res,a,n);
    //       }
    //     }

    // }


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        //PrintWriter out = new PrintWriter(System.out);

        int t  = sc.nextInt();
        while(t-->0){
            // l = new ArrayList<Integer>();
            int n =  sc.nextInt();
            int arr[] =  new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();

            int count = 0;
            for(int i=0;i<n;i++)count+=arr[i]==1?1:0;

            if(count==0){
                for(int i=0;i<=n;i++){
                    System.out.print((i+1)+" ");
                }
                System.out.println();
                continue;

            }
            if(arr[0]==1){
                System.out.print(n+1+" ");
                for(int i=0;i<n;i++){
                    System.out.print((i+1)+" ");
                }
                System.out.println();
                continue;
            }

            int pos = -1;
            for(int i=0;i<n-1;i++){
                if(arr[i]==0 && arr[i+1]==1){
                    pos =i;
                    break;
                } 
            }

            for(int i=0;i<n;i++){
                System.out.print((i+1)+" ");
                if(i==pos){
                    System.out.print((n+1)+" ");
                }
            }
            System.out.println();




            // ArrayList<ArrayList<Integer>> adj =  new ArrayList<>();
            // for(int i=0;i<=n;i++)adj.add(new ArrayList<Integer>());
            // for(int i=0;i<n-1;i++){
            //     adj.get(i).add(i+1);
            // }
            // for(int i=0;i<n;i++){
            //     if(arr[i]==0)
            //     adj.get(i).add(n);
            //     else if(arr[i]==1)
            //     adj.get(n).add(i);
            // }
            // ArrayList<Integer> res =  new ArrayList<Integer>();
            // for(int i=0;i<=n;i++){
            //     dfs(adj,res,i,n);
            //     if(l.size()==n+1)break;
            // }
            // for(int i=0;i<=n;i++){
            //     System.out.println(l.get(i));
            // }



           


        }
       


    }
}