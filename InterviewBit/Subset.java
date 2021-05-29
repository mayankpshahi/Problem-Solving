

//Backtracking - Subset

public class Solution {
    //ArrayList<ArrayList<Integer>> res  =  new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        
        
        Collections.sort(A);
       ArrayList<ArrayList<Integer>> res  =  new ArrayList<>();
       
        
        
        
        findAllSubset(A,new ArrayList<>(),res,0);
        
        return res;
        
        
    }
    private void findAllSubset(ArrayList<Integer> A,ArrayList<Integer> subset,ArrayList<ArrayList<Integer>> res,int ind){
       
        
        
         
             res.add(new ArrayList<>(subset));
         
        
        for(int i=ind;i<A.size();i++){
            subset.add(A.get(i));
            
            findAllSubset(A, subset,res,i+1);
           
             
            subset.remove(subset.size()-1);
        }
        
        
    }
}
