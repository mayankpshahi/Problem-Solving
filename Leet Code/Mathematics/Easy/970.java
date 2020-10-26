//970. Powerful Integers

//O(n) 1ms

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> a = new HashSet<Integer>();

        int i = 1;
        while(i < bound){
            int j = 1;
            while(j < bound){
                if(i + j <= bound) a.add(i + j);
                j *= y;
                if(y == 1) break;
            }
            i *= x;
            if(x == 1) break;
        }

       return new ArrayList(a);


    }
}

//0ms best Solution

class Solution {
   public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();
        dfs(x, y, 0, 0, bound, res);
        return res;
    }

    public void dfs(int x, int y, int a, int b, int bound, List<Integer> res) {
        int k = (int)(Math.pow(x, a) + Math.pow(y, b));
        if(k > bound || res.contains(k)) {
            return;
        }
        if(k == bound) {
            res.add(k);
            return;
        }
        res.add(k);

        dfs(x, y, a+1, b, bound, res);
        dfs(x, y, a, b+1, bound, res);
        dfs(x, y, a+1, b+1, bound, res);
    }
}
