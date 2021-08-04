

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Gregor_and_the_Pawn_Game
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
        PrintWriter out = new PrintWriter(System.out);

        int t =  sc.nextInt();

        while(t-->0){
            int n =  sc.nextInt();
            char e [] = sc.next().toCharArray();
            char g [] = sc.next().toCharArray();
             int count  = 0;
            for(int i=0;i<n;i++){
                if(i==0){
                    if(g[i]=='1'){
                        if(e[i]=='0'){
                            count++;
                            e[i]='B';
                        }else if(e[i+1]=='1'){
                            count++;
                            e[i+1]='B';
                        }
                    }
                }
                else if(i==n-1){
                    if(g[i]=='1'){
                        if(e[i]=='0'){
                            count++;
                            e[i]='B';
                        }else if(e[i-1]=='1'){
                            count++;
                            e[i-1]='B';
                        }
                    }
                }else{
                    if(g[i]=='1'){
                        if(e[i]=='0'){
                            count++;
                            e[i]='B';
                        }else if(e[i-1]=='1'){
                            count++;
                            e[i-1]='B';
                        }else if(e[i+1]=='1'){
                            count++;
                            e[i+1]='B';
                        }
                    }

                    }

                
                
            }
            System.out.println(count);
        }
       


    }
}