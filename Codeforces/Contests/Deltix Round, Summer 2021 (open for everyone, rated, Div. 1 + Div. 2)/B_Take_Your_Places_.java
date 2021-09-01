

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Take_Your_Places_
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

    
    static int check(String g,String h){   
    char[] s = g.toCharArray();
    char[] t = h.toCharArray(); 
    int cnt=0,n=s.length;
    ArrayList<Integer>  a =  new ArrayList<>();
    ArrayList<Integer>  b =  new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        if(t[i]!=s[i]){
            if((s[i]&1)==1){
               a.add(i);
            }else{
               b.add(i);
            }
        }
    }
    Collections.sort(a);
    Collections.sort(b);
    int p=a.size(),q=b.size();
    //cout<<p<<" "<<q<<endl;
    for(int i=0;i<Math.min(p,q);i++){
        cnt+=Math.abs(a.get(i)-b.get(i)); //corresponding pos
    }
    return cnt;
}
    


    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        //PrintWriter out = new PrintWriter(System.out);
        int t =  sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
            int arr[] =  new int[n];
            int even = 0,odd=0;

            for(int i=0;i<n;i++){arr[i] =  sc.nextInt();
                if((arr[i]&1)==1) odd++;
                else even++;
            }

            
            if(n==1){
                System.out.println(0);
                continue;
            }
            int diff=Math.abs(odd-even);
            if(diff>1){
                System.out.println(-1);
                continue;
             }
           StringBuilder sb1=new StringBuilder();
           for(int x:arr){
              if((x&1)==1) sb1.append('1');
              else sb1.append('0');
            }
            StringBuilder sb2=new StringBuilder();
            boolean f=true;
            int res=Integer.MAX_VALUE;
            if(odd>even){
             for(int i=0;i<n;i++){
               if(f) {
                sb2.append('1');
                   f=false;
               }
               else {
                sb2.append('0');
                f=true;
               }
            }
              res=Math.min(res,check(sb1.toString(),sb2.toString()));
            }
            else if(even>odd){
                f=true;sb2=new StringBuilder();;
                for(int i=0;i<n;i++){
                    if(f) {
                        sb2.append('0');
                           f=false;
                       }
                       else {
                        sb2.append('1');
                        f=true;
                       }
                }
                res=Math.min(res,check(sb1.toString(),sb2.toString()));
            }
            else{
                f=true;sb2=new StringBuilder();;
                for(int i=0;i<n;i++){
                    if(f) {
                        sb2.append('0');
                           f=false;
                       }
                       else {
                        sb2.append('1');
                        f=true;
                       }
                }
                res=Math.min(res,check(sb1.toString(),sb2.toString()));
                //reverse(t.begin(),t.end());
                res=Math.min(res,check(sb1.toString(),sb2.reverse().toString()));
            }
         System.out.println(res);



        }
       


    }
}