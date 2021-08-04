


//332. Reconstruct Itinerary

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>> adj =  new HashMap<>();
        
        for(List<String> t:tickets){
            adj.putIfAbsent(t.get(0), new PriorityQueue<String>());
            adj.putIfAbsent(t.get(1), new PriorityQueue<String>());
            adj.get(t.get(0)).add(t.get(1));
        }
        
        List<String> res =  new ArrayList<String>();
        
        Stack<String> stack =  new Stack<String>();
        
        stack.push("JFK");
        
        while(!stack.isEmpty()){
            String from =  stack.peek();
            if(adj.get(from).size()==0){
               // System.out.println(from);
                res.add(from);
                stack.pop();
            }else{
                String to = adj.get(from).poll();
                stack.push(to);
                
            }
        }
        
        //System.out.println(res);
        Collections.reverse(res);
        
        return res;
        
    }
}