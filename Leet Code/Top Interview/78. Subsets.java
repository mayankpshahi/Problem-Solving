

//78. Subsets

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> each = new ArrayList<>();
    bactrack(res, each, 0, nums);
    return res;
}
public void bactrack(List<List<Integer>> res, List<Integer> each, int pos, int[] n) {
    if (pos <= n.length) {
        res.add(each);
    }
    for (int i = pos; i < n.length; i++) {
        each.add(n[i]);
        bactrack(res, new ArrayList<>(each), i + 1, n);
        each.remove(each.size() - 1);
    }
    return;
}
}