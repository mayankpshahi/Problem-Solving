

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class C_Compressed_Bracket_Sequence
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

       int n  = sc.nextInt();
       //int arr[] =  new int[n];
       ArrayList<Character> l =  new ArrayList<>();
       Stack<Integer> st =  new Stack<>();

       for(int i=0;i<n;i++){
          int a =  sc.nextInt();
           if((i+1)%2==0){
            while(a-->0){
                l.add('(');
            }
        }else{
         while(a-->0){
            
            l.add(')');
            
         
        }
          
       }
    }

      // int count=0;
    //    for(int i=0;i<n;i++){
       
    //     if((i+1)%2==0){
    //         while(arr[i]-->0){
    //             st.push('(');
    //         }
    //     }else{
    //      while(arr[i]-->0){
    //          if(!st.isEmpty()){
    //             if(st.peek()=='('){
    //                 st.pop();
    //                 count++;
    //             }else
    //               st.push(')');
    //          }else
    //           st.push(')');
            
    //      }
    //     }
    // }

    for (char c : l) {
        if (c == '(') {
            st.push(-1);
        } else {
            int cur = 0;
            if(!st.isEmpty()){
            while (!st.isEmpty() && st.peek() != -1) {
                cur += st.pop();
            }
            st.pop();
        
            st.push(cur == 0 ? 1 : cur * 2);
        }
        }
    }
    int sum = 0;
    while (!st.isEmpty()) {
        sum += st.pop();
    }
    //return sum;


    System.out.println(sum);


       

      
       
       


    }
}