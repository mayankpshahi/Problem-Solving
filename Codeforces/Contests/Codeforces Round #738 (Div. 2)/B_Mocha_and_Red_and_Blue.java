

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class B_Mocha_and_Red_and_Blue
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

       int t= sc.nextInt();
       while(t-->0){
           int n =  sc.nextInt();
           String str = sc.next();

        char s[] =  str.toCharArray();
        boolean flag  = false;
        for(int i=n-1;i>=0;i--){
            if(s[i]=='B' || s[i]=='R'){
               flag =true;
               continue;
            }
            if(s[i]=='?' && flag){
                if(s[i+1]=='B') s[i]='R';
                else if(s[i+1]=='R')s[i]='B';
            }
        }
        
       
       
        flag  = false;
        for(int i=0;i<n;i++){
            if(s[i]=='B' || s[i]=='R'){
               flag =true;
               continue;
            }
            if(s[i]=='?' && flag){
                if(s[i-1]=='B') s[i]='R';
                else if(s[i-1]=='R')s[i]='B';
            }
        }

        if(s[0]=='?'){
            for(int i=0;i<n;i++){
                if(i%2==0)s[i]='B';
                else s[i]='R';
            }
        }
       

        System.out.println(String.valueOf(s));

        

        //    Stack<Character> st =  new Stack<>();

        //    for(int i=0;i<n;i++){
        //        st.push(s.charAt(i));

        //    }
           
        //    StringBuilder sb  = new StringBuilder();
        //     char prev = 'Q';
        //    while(!st.isEmpty()){
        //        char val =  st.pop();
        //        if(val=='R' || val=='B') {
        //            sb.append(val);
        //            prev = val;
        //        }
        //        else{
        //            if(!st.isEmpty() && st.peek()=='B' && prev =='B'){
        //                sb.append('R');
        //                prev = 'R';
        //            }
        //            else  if(!st.isEmpty() && st.peek()=='R' && prev=='R'){
        //                sb.append('B');
        //                prev = 'B';
        //            }
        //            else if(!st.isEmpty() && st.peek()=='R' && prev=='B'){
        //             sb.append('R');
        //             prev = 'R';
        //         }else if(!st.isEmpty() && st.peek()=='B' && prev=='R'){
        //             sb.append('B');
        //             prev = 'B';
        //         }else if(!st.isEmpty() && st.peek()=='B' && prev=='Q'){
        //             sb.append('R');
        //             prev = 'R';
        //         }
        //         else if(!st.isEmpty() && st.peek()=='R' && prev=='Q'){
        //             sb.append('B');
        //             prev = 'B';
        //         }
        //            else {
        //             if(prev=='B'){
        //                 sb.append('R');
        //                 prev = 'R';
        //             }
        //             else  if(prev=='R'){
        //                 sb.append('B');
        //                 prev = 'B';
        //             }else{
        //                 sb.append('B');
        //                 prev = 'B';
        //             }
        //            }
        //        }
        //    }
           

          // System.out.println(sb.reverse().toString());



       }
       


    }
}