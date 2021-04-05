

//Longest Palindrome in a String


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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

     static boolean checkPallindrome(String s, int start, int end){
	    String s1 = "";
	    String s2 = "";
	    
	    for(int i=start;i<=end;i++){
	        s1+=s.charAt(i);
	    }
	    for(int i=end;i>=start;i--){
	        s2+=s.charAt(i);
	    }
	    if(s1.equals(s2)){
	        return true;
	    }
	    return false;
	}
    
    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        int t =  sc.nextInt();
        
        while(t-->0){
            String s = sc.next();
            
           int max=0;
		    int start = 0;
		    int last = 0;
		    for(int i=0; i<s.length();i++){
		        for(int j=1;j<s.length();j++){
		            
		            if(checkPallindrome(s,i,j)){
		                if((j-i)>(last-start)){
		                    start = i;
		                    last = j;
		                }
		            }
		        }
		    }
		    for(int i=start;i<=last;i++){
		     System.out.print(s.charAt(i));   
		    }
		    System.out.println();
		    
            
            
        }
       
        

    }
}
