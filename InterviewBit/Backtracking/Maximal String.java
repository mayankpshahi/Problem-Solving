

//Maximal String



public class Solution {
    String res;
    public String solve(String A, int B) {
       char[] carr = A.toCharArray();
        res = A;
        backtrack(carr, 0, B);
        return res;
        
    }
    

    public void backtrack(char[] arr, int ind, int B){
        if(ind >= arr.length) return;
        if(B == 0){
            String str = String.valueOf(arr);
            if(str.compareTo(res) > 0){
                res = str;
            }
            return;
        }
        
        for(int i=ind+1; i<arr.length; i++){
            if(arr[i] > arr[ind]){
                swap(arr, ind, i);
                String str = String.valueOf(arr);
                if(str.compareTo(res) > 0){
                    res = str;
                }
                backtrack(arr, ind+1, B-1);
                swap(arr, ind, i);
            }
        }
        backtrack(arr, ind+1, B);
    }
public void swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
