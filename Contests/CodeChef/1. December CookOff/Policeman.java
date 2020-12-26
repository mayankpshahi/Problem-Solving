import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

class Policeman{
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
    public static void main(String[] args) {
        FastReader sc =  new FastReader();
        int t  = sc.nextInt();
        while(t!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k  = sc.nextInt();
            int n = sc.nextInt();
            if(x<y){
            while(x<y){
                x = x+k;
                y = y-k;

            }
        }
        if(x>y){
            while(x>y){
                x = x-k;
                y = y+k;
            }
        }

        if(x==y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO"); 
        }


            t--;

        }
    }
}