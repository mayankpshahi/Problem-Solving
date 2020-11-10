
//49. Group Anagrams

//O(nlogn)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String keyStr = String.valueOf(c);
            if (!m.containsKey(keyStr)) m.put(keyStr, new ArrayList<>());
            m.get(keyStr).add(s);
        }
        return new ArrayList<>(m.values());
        
    }
}

//More optimized Solution
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            char[] c = new char[26];
            for (char e : s.toCharArray()) c[e - 'a']++;
            String keyStr = String.valueOf(c);
            if (!m.containsKey(keyStr)) m.put(keyStr, new ArrayList<>());
            m.get(keyStr).add(s);
        }
        return new ArrayList<>(m.values());
        
    }
}