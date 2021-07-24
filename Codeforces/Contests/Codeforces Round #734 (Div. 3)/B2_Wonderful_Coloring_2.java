

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B2_Wonderful_Coloring_2
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
            int n = sc.nextInt();
            int k =  sc.nextInt();
            int arr [] =  new int[n];
            int [] freq =  new int[n+1];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                freq[arr[i]]++;
            }

           int color[] =  new int[k];

        

            for(int i=0;i<=n;i++){

                if(freq[i]>=k){
                   for(int j=0;j<k;j++){
                       color[j]++;
                   }
                }else if(freq[i]==k-1){
                    Arrays.sort(color);
                    for(int j=0;j<k-1;j++){
                        color[j]++;
                    }
                }


            }

            
           
            res = Math.min(red,green);
            System.out.println(res);
        }
       


    }
}