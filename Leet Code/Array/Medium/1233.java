//1233. Remove Sub-Folders from the Filesystem

//O(nk)

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        HashSet<String> set = new HashSet<>();
        boolean x = false;
        for(String f : folder)
            set.add(f);

        List<String> ans = new ArrayList<>();

        for(String f : folder){
            x = false;
            StringBuilder sb = new StringBuilder();
            String[] strs = f.split("/");

            for(int i=1;i<strs.length-1;i++){
                sb.append("/").append(strs[i]);
                if(set.contains(sb.toString())){
                    x= true;
                    break;}

            }


            if(!x)ans.add(f);
        }

        return ans;
    }
}



//O(nk)

class Solution {
    public List<String> removeSubfolders(String[] folder) {
         Set<String> seen = new HashSet<>();
        Arrays.sort(folder, (s1, s2) -> s1.length() - s2.length());
        int max_len = 0;
        for(String s : folder) {
            boolean take = true;
            for(int i = 2; i < max_len + 1 && i < s.length(); i++) {
                if(s.charAt(i) == '/' && seen.contains(s.substring(0, i))) {
                    take = false;
                    break;
                }
            }
            if(take) {
                max_len = s.length();
                seen.add(s);
            }
        }
        return new ArrayList<>(seen);
    }
}
