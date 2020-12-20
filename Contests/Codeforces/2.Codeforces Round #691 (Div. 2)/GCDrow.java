import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public final class GCDrow {
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
    static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
    static long findGCD(long arr[], int n) 
    { 
        long result = 0; 
        for (long element: arr){ 
            result = gcd(result, element); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    } 
    public static void main(String[] args) {
        FastReader sc =  new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[]  = new long[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextLong();

        }
        long b[]  =  new long[m];
        for(int i = 0;i<m;i++){
            b[i] = sc.nextLong();

        }

        for(int i = 0;i<m;i++){
            long ac[]  = new long[n];
            for(int j=0;j<n;j++){
                ac[j] = a[j]+b[i];
            }
            if(i!=m)System.out.print(findGCD(ac, n)+" ");
            else System.out.print(findGCD(ac, n));
        }

    }
    
}
