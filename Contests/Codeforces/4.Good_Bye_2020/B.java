

import java.util.*;

public final class B{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            Set<Integer> s =  new HashSet<>();
            int n = sc.nextInt();
        
            int a[] = new int[n];
            for (int i=0;i<n;i++){
                a[i] = sc.nextInt();
                
               
            }
            
                for(int i=0;i<n;i++){
                 if(!s.contains(a[i]))s.add(a[i]);
                 else s.add(a[i]+1);
                    

                }
           
           
            System.out.println(s.size());

        }

    }
}