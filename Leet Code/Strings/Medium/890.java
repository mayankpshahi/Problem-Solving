//890. Find and Replace Pattern

//O(mn)
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
         for(int i=0; i<words.length; i++){
             Map<Character, Character> m = new HashMap<>();
             String curr = words[i];
             boolean f = false;

             if(curr.length() != pattern.length())
                continue;
             for(int j=0; j<curr.length(); j++) {
    if(m.containsKey(pattern.charAt(j)) && m.get(pattern.charAt(j)) !=curr.charAt(j)) {
                	f = false;
                    break;
                }
    else if(!m.containsKey(pattern.charAt(j)) && m.containsValue(curr.charAt(j))) {
                	f = false;
                	break;
                }
    else {
        m.put(pattern.charAt(j), curr.charAt(j));
        f = true;
    }


             }
           if(f== true)l.add(curr);



         }


       return l;

    }
}

//O(n)


class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String current = words[i];
            if(current.length() == pattern.length()){
                boolean flag = helper(current,pattern);
                if(flag) list.add(current);
            }
        }
        return list;
    }
    public boolean helper(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length() == 0) return true;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for(int i = 0; i < n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(m1[c1] != m2[c2])
                return false;
            m1[c1] = i+1;
            m2[c2] =i+1;
        }
        return true;

    }
}
