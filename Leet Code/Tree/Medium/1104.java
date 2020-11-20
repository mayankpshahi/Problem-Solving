//1104. Path In Zigzag Labelled Binary Tree


//Iterative O(Nlogn)
class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int level = 0;
        int tmp = label;
        
        while (tmp != 0){
            tmp /= 2;
            level ++;
        }
        List<Integer> res = new ArrayList<>();
        while (level > 0){
            res.add(label);
	
            label = (3 * (int)Math.pow(2, level - 1) - 1 -label);
            label /= 2;
            level --;
        }
        Collections.reverse(res);
        return res;
        
    }
}