

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Moamen_and_k_subarrays
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
       // PrintWriter out = new PrintWriter(System.out);

       int t =  sc.nextInt();
       while(t-->0){
           int n =  sc.nextInt();
           int k =  sc.nextInt();

           int arr [] =  new int[n];
           int sorted [] =  new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
               sorted[i] = arr[i];
           }

           Arrays.sort(sorted);
           Map<Integer,Integer> map =  new HashMap<>();
           for(int i=0;i<n;i++){
            map.put(sorted[i],i);
        }

        int count = 0;

        for(int i=0;i<n;i++){
           if(map.get(arr[i])>0 && i>0 && sorted[map.get(arr[i])-1]==arr[i-1])continue;
           else count++;
        }

        if(count>k)System.out.println("No");
        else System.out.println("Yes");


       }
       


    }
}