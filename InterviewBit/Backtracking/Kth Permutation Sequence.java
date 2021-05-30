

//Kth Permutation Sequence

public class Solution {
    StringBuffer sb;
    ArrayList<Integer> numbers;
    public String getPermutation(int A, int B) {
       // ArrayList<Integer> l = new ArrayList<>();
     sb = new StringBuffer();
        numbers = new ArrayList<Integer>();
        int i=1;
        while(i<=A){
            numbers.add(i);
            i++;
        }
        //k-1 for using 0-based index
        permute(A, B-1, 1);
        return sb.toString();
        
    }
    public void permute(int n, int k, int i){
        int fac = factorial(n-i);
        int index;
        if(fac!=0){
        index = (k/fac);
            
        }else 
          index=0;
        int num = numbers.get(index);
        sb.append(num);
        numbers.remove(Integer.valueOf(num));
        if(numbers.size()==0)
            return;
		//removing the covered permutations
        k = k - (index * fac);
        if(k>=0)
            permute(n, k, i+1);
        return;
    }
public int factorial(int n){
        if(n<=0)
            return 1;
        int fac = 1;
        for(int i=1; i<=n; i++)
           fac *= i;
        return fac;
    }
    
}
