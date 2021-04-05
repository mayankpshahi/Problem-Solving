
//Recursively remove all adjacent duplicates

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

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
    static String fn(String str) 
      { 
            if(str.equals(""))
            return "";
            
            int i,j,k;
            int n=str.length();
            
            Stack<Character> s=new Stack<>();
	    boolean flag=false;
	    
        for(i=0;i<n;i++)
	    s.push(str.charAt(i));
	    str="";
	    char c=s.peek();
	    flag=false;
	    s.pop();
	    int key=0; //to check if we need to check the answer again
	    while(!s.isEmpty())    
	    {
	        //cout<<st.top()<<" ";
	        if(s.peek()==c)
	        {
	            flag=true;
	            key=1;
	        }
	        else if(s.peek()!=c  )
	        {
	            if(flag==false)
	            str+=c;
	            c=s.peek();
	            flag=false;
	        }
	        s.pop();
	    }
	    if(flag==false)
	    str+=c;
	    StringBuilder ss=new StringBuilder(str);
	    ss=ss.reverse();
	    str=ss.toString();
	    
	    if(key==1)
	    str=fn(str);
	    return str;
      }
    
    
 
  
    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        
        int t =  sc.nextInt();
        while(t-->0){
            String s = sc.next();
            
            
            
            System.out.println(fn(s));
            
        }
       
        

    }
}
