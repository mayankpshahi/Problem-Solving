

import java.util.*;

public final class A{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            Set<Double> s =  new HashSet();
            int n = sc.nextInt();
            double area=0.0;
            int x[] = new int[n];
            
            for (int i=0;i<n;i++){
                x[i] = sc.nextInt();
               
            }
            for (int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){

                    area = 0.5*(x[j]-x[i]);
                    s.add(area);
                    
                    

                }
            }
            System.out.println(s.size());

        }

    }
}