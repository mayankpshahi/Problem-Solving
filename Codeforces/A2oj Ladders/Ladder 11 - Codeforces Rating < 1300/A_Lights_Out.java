

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_Lights_Out
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
        
        int [][] mat  =  new int [3][3];
        boolean [][] res  =  new boolean [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=sc.nextInt();
                res[i][j]=true;
            }
        }

        if(mat[0][0]%2 != 0)
    {
        res[0][0] = !res[0][0];
        res[1][0] = !res[1][0];
        //res[1][1] = !res[1][1];
        res[0][1] = !res[0][1];
    }
    if(mat[1][0]%2 != 0)
    {
        res[0][0] = !res[0][0];
        res[1][0] = !res[1][0];
        res[2][0] = !res[2][0];
        //res[0][1] = !res[0][1];
        res[1][1] = !res[1][1];
        //res[2][1] = !res[2][1];
    }
    if(mat[2][0]%2 != 0)
    {
        //res[1][1] = !res[1][1];
        res[2][0] = !res[2][0];
        res[2][1] = !res[2][1];
        res[1][0] = !res[1][0];
    }
    if(mat[0][1]%2 != 0)
    {
        res[0][0] = !res[0][0];
        //res[1][0] = !res[1][0];
        res[0][1] = !res[0][1];
        res[1][1] = !res[1][1];
        //res[1][2] = !res[1][2];
        res[0][2] = !res[0][2];
    }
    if(mat[1][1]%2 != 0)
    {
        res[1][1] = !res[1][1];
        res[0][1] = !res[0][1];
        res[2][1] = !res[2][1];
        res[1][0] = !res[1][0];
        res[1][2] = !res[1][2];
    }
    if(mat[2][1]%2 != 0)
    {
        //res[1][0] = !res[1][0];
        res[1][1] = !res[1][1];
        //res[1][2] = !res[1][2];
        res[2][0] = !res[2][0];
        res[2][1] = !res[2][1];
        res[2][2] = !res[2][2];
    }
    if(mat[0][2]%2 != 0)
    {
        //res[1][1] = !res[1][1];
        res[0][1] = !res[0][1];
        res[0][2] = !res[0][2];
        res[1][2] = !res[1][2];
    }
    if(mat[1][2]%2 != 0)
    {
        //res[0][1] = !res[0][1];
        res[0][2] = !res[0][2];
        res[1][1] = !res[1][1];
        res[1][2] = !res[1][2];
        //res[2][1] = !res[2][1];
        res[2][2] = !res[2][2];
    }
    if(mat[2][2]%2 != 0)
    {
        res[2][2] = !res[2][2];
        res[2][1] = !res[2][1];
        res[1][2] = !res[1][2];
        //res[1][1] = !res[1][1];
    }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(res[i][j]?1:0);
            }
            System.out.println();
        }


       


    }
}