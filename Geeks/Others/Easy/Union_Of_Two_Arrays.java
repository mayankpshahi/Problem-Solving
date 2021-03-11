//Union of two arrays

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main
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
        FastReader s=new FastReader();
        int t = s.nextInt();
        while(t-->0){

            String str  = "";
            str = s.nextLine();
            str = s.nextLine();

            String a[] = str.split(" ");

            str = s.nextLine();

            String b[] = str.split(" ");

            Set<String> hash_Set = new HashSet<String>();

            for(int i=0;i<a.length;i++)
            hash_Set.add(a[i]);
            for(int i=0;i<b.length;i++)
            hash_Set.add(b[i]);


            System.out.println(hash_Set.size());





}





    }
}
