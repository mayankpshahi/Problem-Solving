

//Combinations


public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int B) {
        ArrayList<Integer> A =  new ArrayList<>();
        for(int i=1;i<=n;i++) A.add(i);
        ArrayList<ArrayList<Integer>> res  =  new ArrayList<>();
       
       backtrack(A,new ArrayList<>(),res,0,B);
       
       return res;
    }
     private void backtrack(ArrayList<Integer> A,ArrayList<Integer> subset,ArrayList<ArrayList<Integer>> res,int ind,int target){
        
     if (target<=0){
        if (target==0){
            res.add(new ArrayList<>(subset));
        }
        return;
    }
            
         
        
        for(int i=ind;i<A.size();i++){
            
            if(i<=ind || A.get(i)!=A.get(i-1)){
                 subset.add(A.get(i));
            
            backtrack(A, subset,res,i+1,target-1);
           
             
            subset.remove(subset.size()-1);
                
           }
           
        }
        
        
    }
}
