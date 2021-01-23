
//884. Uncommon Words from Two Sentences


class Solution {
    public String[] uncommonFromSentences(String A, String B) { 
        
        String sarr[] = (A + " " + B).split(" ");
        
       Map <String, Integer> m =  new HashMap<String,Integer>();
       
        for(String s: sarr)
            m.put(s,m.getOrDefault(s,0)+1);
        
         ArrayList<String> res = new ArrayList<>();
        
        for (String s : m.keySet())
            if (m.get(s) == 1)
                res.add(s);
        
        return res.toArray(new String[0]);
        
    
    }
}