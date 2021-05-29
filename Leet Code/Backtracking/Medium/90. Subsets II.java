


//90. Subsets II

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    bactrack(res, subset, 0, nums);
    return res;
        
    }
    public void bactrack(List<List<Integer>> res, List<Integer> subset, int pos, int[] n) {
    if (pos <= n.length) {
        res.add(subset);
    }
    for (int i = pos; i < n.length; i++) {
         if(i<=pos || n[i]!=n[i-1]){
        subset.add(n[i]);
        bactrack(res, new ArrayList<>(subset), i+1, n);
        subset.remove(subset.size() - 1);
         }
    }
    return;
}
}