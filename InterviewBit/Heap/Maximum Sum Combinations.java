



//Maximum Sum Combinations


class Triplet
{
    int x, y, sum;
    Triplet(int x, int y, int sum)
    {
        this.x = x;
        this.y = y;
        this.sum = sum;
    }
}
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        Collections.sort(A, (a, b) -> b - a);
        Collections.sort(B, (a, b) -> b - a);
        
        Queue<Triplet> maxHeap = new PriorityQueue<>((a,b) -> b.sum - a.sum);
        
        for(int i = 0; i < A.size(); i++)
            maxHeap.add(new Triplet(i, 0, A.get(i) + B.get(0)));
            
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < C; i++)
        {
            Triplet t = maxHeap.poll();
            
            ans.add(t.sum);
            
            if(t.y == B.size() - 1)
                continue;
                
            maxHeap.add(new Triplet(t.x, t.y + 1, A.get(t.x) + B.get(t.y + 1)));
        }
        return ans;
    }
}