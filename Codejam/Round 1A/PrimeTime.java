










import java.util.*;

class Solution{
    

   
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int m = sc.nextInt();
           long p[] =  new long[m];
           long n[] = new long[m];

           
           for(int i=0;i<m;i++) {
               p[i] = sc.nextLong();
               n[i] = sc.nextLong();
           }
           
         List<Long> l = new ArrayList<Long>();
         for(int i=0;i<m;i++) {
             for(int j=0;j<n[i];j++) {
                 l.add(p[i]);
             }
         }
         List<Long> sum = new ArrayList<Long>();
         List<Long> prod = new ArrayList<Long>();


         sum.add(l.get(0));
         prod.add(l.get(0));
         for(int i=1;i<l.size();i++){
             sum.add(sum.get(i-1) + l.get(i));
             prod.add(prod.get(i-1) * l.get(i));
         }
         
         /*for(int i=0;i<l.size();i++)
          System.out.print(l.get(i) + " ");

        System.out.println();

        for(int i=0;i<l.size();i++)
          System.out.print(sum.get(i) + " ");

        System.out.println();

        for(int i=0;i<l.size();i++)
          System.out.print(prod.get(i) + " ");

        System.out.println();*/

         long res =0;
        
         if(l.size() == 2 && l.get(0)==l.get(1))
           res = l.get(0);
        else{

         for(int i=1;i<sum.size()-1;i++){
             for(int j=i+1;j<sum.size();j++){
              
                //System.out.print((prod.get(j)/ prod.get(i-1)) + " " + ((sum.get(sum.size()-1) - sum.get(j))+(sum.get(i)))+ " ");

                if((prod.get(j)/prod.get(i-1))==((sum.get(sum.size()-1) - sum.get(j))+(sum.get(i-1)))){
                    res = (prod.get(j)/prod.get(i-1));
                    break;
                }

             }
            
             //System.out.println();

         }
        }



          
            
         
            
        System.out.println("Case #"+(len-t)+": "+res);



       }

   }
}