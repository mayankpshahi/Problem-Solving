

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class C_Infinity_Table
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
       int  k =  sc.nextInt();
    //    int cell[][] =  new int[100001][100001];
    //    cell[0][0]=1;
    //    int count = 1;
    //    int num=1;
    //    int r=-1,c=-1;
    //    boolean flag = false;
    //    for(int i=1;i<100001;i++){
    //        cell[0][i] = num+1;
    //        if(k==cell[0][i]){
    //            r=0;
    //            c=i;
    //            flag=true;
    //            break;
    //        }
    //        if(flag)break;
           
    //        for(int j=1;j<1+count;j++){
    //         cell[j][i] = num+1;
    //         if(k==cell[j][i]){
    //             r=j;
    //             c=i;
    //             flag = true;
    //             break;
    //         }
    //        }
    //        if(flag)break;
    //        for(int j=i;j>=0;j--){
    //         cell[count][j] = num+1;
    //         if(k==cell[count][i]){
    //             r=count;
    //             c=i;
    //             flag = true;
    //             break;
    //         }

    //        }
    //        if(flag)break;

    //    }


    int count=1,i=0;
    while(count <= k){
        i++;
        count = i*i;
        if(count==k) {
            i--;
            break;
        }else if(count>k){
            i--;
            break;
        }
    }
    count = i*i;
    int r=1,c=i+1;
    for(int j=count+1; j<=(i+1)*(i+1); j++){
        if(j==k){
            System.out.println(r+ " "+c);
            break;
        }else{
            if(r>=i+1) c--;
            if(r<i+1) r++;
        }
    }

       

    }


    }
}