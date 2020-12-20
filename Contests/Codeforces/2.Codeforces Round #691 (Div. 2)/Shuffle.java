import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;


public final class Shuffle {
    static int count[] =  new int[2];
    private void permute(String str1,String str2, int l, int r) 
    {   
        if (l == r) 
            {
                if(Integer.parseInt(str1)>Integer.parseInt(str2))
                   count[0]++;
                else if(Integer.parseInt(str1)<Integer.parseInt(str2)) count[1]++;
             }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str1 = swap(str1,l,i); 
                permute(str1,str2, l+1, r); 
                str2 = swap(str2,l,i); 
            } 
        }
        
    } 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
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
    public static void main(String[] args) {
        FastReader sc =  new FastReader();
        int t= sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           String s1 = sc.next();
           String s2 = sc.next();

           if(s1.equals(s2)){
            System.out.println("EQUAL");
           }
           else{

           Shuffle sf =  new Shuffle();
           sf.permute(s1, s2, 0, n-1);

           if(count[0]>count[1]) System.out.println("RED");
           else if (count[0]<count[1]) System.out.println("BLUE");}
           

           count[0] =0;
           count[1] = 0;








        }

    }
    
}
