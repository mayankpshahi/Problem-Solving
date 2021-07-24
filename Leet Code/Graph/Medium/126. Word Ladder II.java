




//126. Word Ladder II



class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
         HashSet<String> words=new HashSet<>(wordList);
        if(!words.contains(endWord)) return new ArrayList<>();
        
        HashMap<String,ArrayList<String>> graph=new HashMap<>(); // to make adjacency list
        HashMap<String,Integer> vis=new HashMap<>();    // to keep count of level traversal of str
        LinkedList<String> que=new LinkedList<>();
        
        que.addLast(beginWord);
        int level=0; int depth=0;
        vis.put(beginWord,0); // level of intial word will be 0
        
        //create graph bfs
        while(!que.isEmpty()){
            int size=que.size();
            level++;
            while(size-->0){
                String s=que.removeFirst();
                if(s.equals(endWord)){
                    if(depth==0) depth=level;
                    continue;
                }
                ArrayList<String> arr=new ArrayList<>();
                char[] ch=new char[s.length()];
                
                for(int i=0;i<s.length();i++){
                    ch=s.toCharArray();
                    char c=ch[i];
                    for(int j=0;j<26;j++){
                        if(c==(char)(j+'a')) continue;
                        ch[i]=(char)(j+'a');
                        String str=String.valueOf(ch);
                        if(words.contains(str)){
                            if(vis.getOrDefault(str,10000)>=level){
                                vis.put(str,level);
                                arr.add(str);
                                que.addLast(str);
                            }
                        }
                    }
                }
                
                graph.put(s,arr);
            }
        }
    
        //dfs
        HashMap<String,Integer> v=new HashMap<>();
        ArrayList<String> ans=new ArrayList<>();
        ans.add(beginWord);
        List<List<String>> res=new ArrayList<>();
        dfs(beginWord,endWord,depth-1,graph,v,ans,res);
        
        return res;
        
    }
    
    public static void dfs(String beginWord, String endWord, int depth, HashMap<String,ArrayList<String>>graph,HashMap<String,Integer> v,ArrayList<String> ans ,                                        List<List<String>> res){
        
        if(depth==0){
            if(beginWord.equals(endWord)){
                ArrayList<String> base=new ArrayList<>(ans);
                res.add(base);
            }
            return;
        }
        //mark
        v.put(beginWord,1);
        for(String s: graph.get(beginWord)){
            if(v.getOrDefault(s,0)!=1){
                ans.add(s);
                dfs(s,endWord,depth-1,graph,v,ans,res);
               ans.remove(ans.size()-1);
            }
        }
        v.put(beginWord,0);
        return;
    }
}