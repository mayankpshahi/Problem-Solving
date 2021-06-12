







//N max pair combinations

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A, Collections.reverseOrder());
Collections.sort(B, Collections.reverseOrder());

    PriorityQueue<Integer> p= new PriorityQueue<>();

    for(int i=0;i<A.size();i++){
        for(int j=0;j<B.size();j++){
            int sum=A.get(i)+B.get(j);
            if(i==0) p.add(sum);
            else if(p.peek()<sum){
                
                p.poll();
                p.add(sum);
            }
            else
                break;
            }
        }
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<A.size();i++){
        a.add(p.poll());
    }
    Collections.sort(a, Collections.reverseOrder());
    return a;
    }
}
