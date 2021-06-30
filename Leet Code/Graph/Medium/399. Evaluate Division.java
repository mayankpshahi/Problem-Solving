


//399. Evaluate Division


//DFS


class Solution {
    HashMap<String, HashMap<String, Double>> graph; 
    public double[] calcEquation(List<List<String>> e, double[] values, List<List<String>> queries){
        
        graph = new HashMap();
        
        for(int i = 0; i < e.size(); i++){
            List<String> equation = e.get(i);
            
            String dividend = equation.get(0);
            String divisor  = equation.get(1);
            double quotient = values[i];
            
            graph.putIfAbsent(dividend, new HashMap<String, Double>());
            graph.putIfAbsent(divisor, new HashMap<String, Double>());
            
            graph.get(dividend).put(divisor, quotient);
            graph.get(divisor).put(dividend, 1 / quotient);
        }
        
        double[] results = new double[queries.size()];
        
        for(int i = 0; i < queries.size(); i++){
            String dividend = queries.get(i).get(0);
            String divisor  = queries.get(i).get(1);
            
            if(!graph.containsKey(dividend) || !graph.containsKey(divisor)){
                results[i] = -1.0;
            }else if(dividend == divisor){
                results[i] = 1.0;
            }else{
                results[i] = queryUsingDfs(dividend, divisor, 1, new HashSet());
            }
        }
        
        
        return results;
        
    }
    private double queryUsingDfs(String currNode, String targetNode, double currProduct, Set<String> visited){
        visited.add(currNode);
        
        double result = -1.0;
        
        Map<String, Double> neighbors = graph.get(currNode);
            
        if(neighbors.containsKey(targetNode)){
            result = currProduct * neighbors.get(targetNode);
        } else {
            
            for(String nextNode : neighbors.keySet()){
                
                if(visited.contains(nextNode)) continue;
                
                double quotient = neighbors.get(nextNode);
                
                result = queryUsingDfs(nextNode, targetNode, currProduct * quotient, visited);
                
                //found
                if(result != -1.0) break; 
            }
            
        }
        //visited.remove(currNode);
        return result;
    }
}




//Union Find



class Solution {
    private Map<String, Pair<String, Double>> parents = new HashMap<>();
    
    public double[] calcEquation(List<List<String>> equations, double[] values,
                                 List<List<String>> queries) {
        // Step 1: build union groups
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            
            String u = equation.get(0), v = equation.get(1);
            double w = values[i];

            union(u, v, w);
        }

        // Step 2. try to make the query
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String u = query.get(0), v = query.get(1);

            // case 1:  u or v never appear before
            if (!parents.containsKey(u) || !parents.containsKey(v)) {
                res[i] = -1.0;
                continue;
            }
                
            
            Pair<String, Double> uPair = find(u);
            Pair<String, Double> vPair = find(v);

            String uParent = uPair.getKey();
            double uWeight = uPair.getValue();
            
            String vParent = vPair.getKey();
            double vWeight = vPair.getValue();

            if (!uParent.equals(vParent))
                // case 2:  u & v NOT belong to the same group
                res[i] = -1.0;
            else
                /* case 3:  u & v belong to the same group  <==>  uPar == vPar
                            Then we want to query u / v:
                
                Assuming we have:
                    1. u = uPar * uWei  
                    2. v = vPar * vWei = uPar * vWei
                
                Thus  u / v = uWei / vWei                    */
                res[i] = uWeight / vWeight;
            
        }
        return res;
    }
    
    private Pair<String, Double> find(String u) {
        if (!parents.containsKey(u)) {
            parents.put(u, new Pair(u, 1.0));
            return parents.get(u);
        }
        
        if (!parents.get(u).getKey().equals(u)) {
            Pair<String, Double> uParentPair = parents.get(u);
            Pair<String, Double> uGrandParentPair = find(uParentPair.getKey());
            
            parents.put(u, new Pair(uGrandParentPair.getKey(), 
                                    uParentPair.getValue() * uGrandParentPair.getValue()));
        }
        return parents.get(u);
    }
    
    
    private void union(String u, String v, Double w) {
        Pair<String, Double> uPair = find(u);
        Pair<String, Double> vPair = find(v);

        String uParent = uPair.getKey();
        double uWeight = uPair.getValue();

        String vParent = vPair.getKey();
        double vWeight = vPair.getValue();

        if (!uParent.equals(vParent)) {
            parents.put(uParent, new Pair(vParent, vWeight / uWeight * w));
        }
    }
}