

//Equal Average Partition


public class Solution {
      int totalSize;
    ArrayList<Integer> res = new ArrayList<Integer>();
    ArrayList<Integer> original;
    boolean[][][] t;
    public ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> A) {
         ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        totalSize = A.size();
        if(A == null || A.size() == 0)
            return result;
        
        original = new ArrayList<Integer>(A);
        //System.out.println("original : " + original);
        
        //Collections.sort(original);
        
        int totalSum = 0;
        for(int i = 0; i < A.size(); i++)
            totalSum += A.get(i);
       // System.out.println("Total Sum : " + totalSum + "  Total Size: " + totalSize);
        
        t = new boolean[original.size()][totalSum + 1][totalSize];
        for(int i =0; i < original.size(); i++){
            for(int j = 0; j < totalSum + 1; j++){
                for(int k =0; k < totalSize; k++)
                    t[i][j][k] = true;
            }
        }
        
        
          // We need to minimize size_of_set1. So, lets search for the first size_of_set1 which is possible.
        for(int i = 1; i < totalSize; i++){
           
            if((totalSum * i) % totalSize != 0) continue;
            int sumOfSet1 = (totalSum * i) / totalSize;
            
            if(isPossible(0, sumOfSet1, i) == true){
                int ptr1 = 0;
                int ptr2 = 0;
                ArrayList<Integer> res1 = new ArrayList<Integer>(res);
                ArrayList<Integer> res2 = new ArrayList<Integer>();
                
                while(ptr1 < totalSize || ptr2 < res.size()){
                    if(ptr2 < res.size() && res.get(ptr2) == A.get(ptr1)){
                        ptr1++;
                        ptr2++;
                        continue;
                    }
                    res2.add(A.get(ptr1));
                    ptr1++;
                }
                
                Collections.sort(res1);
                 Collections.sort(res2);
               
                result.add(res1);
                result.add(res2);
              
                return result;
            }
        }
        
        
   
        return result;
        
        
        
    }
    private boolean isPossible(int index, int sum, int sz){
        if(sz == 0){
            return sum == 0;
        }
        if(index >= totalSize) {
            return false;
        }
        if(t[index][sum][sz] == false){
            return false;
        }
        if(sum >= original.get(index)){
            res.add(original.get(index));
            if(isPossible(index + 1, sum - original.get(index), sz - 1) == true)
                return true;
            res.remove(res.size() - 1);            
        }
      
        
        if(isPossible(index + 1, sum, sz))
            return true;
        t[index][sum][sz] = false;
        return t[index][sum][sz];
    }
    
    
}







public class Solution {
    byte [][][] mem;
    
    public ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> a) {
        int n = a.size();
        if (n <= 1) return new ArrayList<ArrayList<Integer>>();
        Collections.sort(a);
        int sum = 0;
        for (int v : a) sum += v;
        mem = new byte[n][n / 2 + 1][sum + 1];
        for (int i = 1; i * 2 <= a.size(); ++i) {
            if (sum * i % n != 0) continue;
            int needSum = sum * i / n;
            if (pos(a, 0, i, needSum)) {
                ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
                res.add(new ArrayList<Integer>());
                res.add(new ArrayList<Integer>());
                for (int j = 0; j < n; ++j) {
                    int v = a.get(j);
                    if (res.get(0).size() < i) {
                        if (v == needSum) {
                            res.get(0).add(v);
                            needSum -= v;
                        } else {
                            if (pos(a, j + 1, i - res.get(0).size() - 1, needSum - v)) {
                                res.get(0).add(v);
                                needSum -= v;
                            } else {
                                res.get(1).add(v);
                            }
                        }
                    } else {
                        res.get(1).add(a.get(j));
                    }
                }
                return res;
            }
        }
        return new ArrayList<ArrayList<Integer>>();
    }
    
    boolean pos(List<Integer> a, int from, int n, int sum) {
        if (sum == 0 && n == 0 && from <= a.size()) return true;
        if (sum <= 0 || from >= a.size() || n > a.size() - from || n <= 0) return false;
        if (mem[from][n][sum] != 0) {
            return mem[from][n][sum] == 1 ? true : false;
        }
        if (pos(a, from + 1, n, sum) || pos(a, from + 1, n - 1, sum - a.get(from))) {
            mem[from][n][sum] = 1;
            return true;
        }
        mem[from][n][sum] = 2;
        return false;
    }
}


