//Move all negative elements to end without changing order

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


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


            List<Integer> poslist = new LinkedList<>();
            List<Integer> neglist = new LinkedList<>();
            for(int i = 0;i<a.length;i++)
            {
                if(Integer.parseInt(a[i])<0)
                neglist.add(Integer.parseInt(a[i]));
                else
                poslist.add(Integer.parseInt(a[i]));

            }
            Iterator it;
            it=poslist.iterator();
            while(it.hasNext())
            System.out.print(it.next()+" ");
            it=neglist.iterator();
            while(it.hasNext())
            System.out.print(it.next()+" ");
            System.out.println();
        }

    }
}
