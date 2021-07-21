

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class C_Pursuit
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
        
        int t =  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
             int arr1 []  =  new int[n];
             int arr2 []  =  new int[n];
             int sum1 = 0;
             int sum2 =0;

            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
                sum1+=arr1[i];
            }
            for(int i=0;i<n;i++){
                arr2[i] = sc.nextInt();
                sum2+=arr2[i];
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int k = (n/4);

            

            for(int i=0;i<k;i++){
                sum1-=arr1[i];
                sum2-=arr2[i];
            }
            
            if(sum2<=sum1)System.out.println(0);
            else {
        int x=k;
        int y=k-1;
        int r =n;
        int ans=0;
 
        int zero = 0;
 
        
        while(true)
        {
            if(sum1>=sum2)
            {
                break;
            }
            sum1 += 100;
            zero++;
            if (y >= 0)
            {
                sum2 += arr2[y];
                y--;
            }
            r++;
            if(r/4 > k)
            {
                k++;
                sum1 -= arr1[x];
                x++;
 
                if(zero<k)
                {
                    sum2 -= arr2[y+1];
                    y++;
                }
            }
            ans++;
            
 
        }
        System.out.println(ans);

            }
        }
       


    }
}