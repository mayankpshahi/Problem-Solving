

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;


public class D1_Mocha_and_Diana_Easy_Version_
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

   
    private void solve(){
        FastReader sc=new FastReader();
        // PrintWriter out = new PrintWriter(System.out);
 
        int n =  sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int parent1[] =  new int[n+1];
        int rank1[] =  new int[n+1];
        int parent2[] =  new int[n+1];
        int rank2[] =  new int[n+1];

        Arrays.fill(parent1,-1);
        Arrays.fill(parent2,-1);

        while(m1-->0){
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            union(a,b,parent1,rank1);

        }
        while(m2-->0){
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            union(a,b,parent2,rank2);

        }

        ArrayList<int[]> res =  new ArrayList<>();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                if(find(i,parent1)!=find(j,parent1) && find(i,parent2)!=find(j,parent2) ){
                    res.add(new int[]{i,j});
                    union(i,j,parent1,rank1);
                    union(i,j,parent2,rank2);
                }

            }
        }

        System.out.println(res.size());

       for(int[] p:res){
           System.out.println(p[0]+" "+p[1]);
       }




 
    }
    public int find(int x,int parent[]){
        if( parent[x]==-1 )
            return x;
        return parent[x] = find(parent[x],parent);
    }
    public void union(int x, int y,int parent[],int rank[]){
        int xParent = find(x,parent);
        int yParent = find(y,parent);
        //If  parents are same it means x & y are already merged
        if(xParent == yParent) return;
        //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
        //distinctGroups--;
        if(rank[xParent] < rank[yParent]){
            parent[xParent] = yParent;
        }else if(rank[xParent] > rank[yParent]){
            parent[yParent] = xParent;
        }else{
            parent[xParent] = yParent;
            rank[yParent]++;
        }
    }


    public static void main(String[] args)
    {
    //     FastReader sc=new FastReader();
    //    // PrintWriter out = new PrintWriter(System.out);

    //    int n =  sc.nextInt();
    //    int m1 = sc.nextInt();
    //    int m2 = sc.nextInt();



D1_Mocha_and_Diana_Easy_Version_ obj =  new D1_Mocha_and_Diana_Easy_Version_();
      
  obj.solve();

       


    }
}