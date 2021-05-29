

//Backtracking Combination Sum


public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        if(A==null || B==0)
          return new ArrayList<ArrayList<Integer>>();
          
       Collections.sort(A);
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
            
            if(i==ind || A.get(i)!=A.get(i-1)){
                 subset.add(A.get(i));
            
            backtrack(A, subset,res,i,target-A.get(i));
           
             
            subset.remove(subset.size()-1);
                
           }
           
        }
        
        
    }
}
