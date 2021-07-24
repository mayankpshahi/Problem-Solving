



//127. Word Ladder


class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
         Set<String> set  =  new HashSet<>();
        for(String s:wordList){
            set.add(s);
        }
        
        if(!set.contains(endWord)) return 0;
        
        Queue<String> q =  new LinkedList<>();
        q.offer(beginWord);
        int level =1;
        
        while(!q.isEmpty()){
            int size  =  q.size();
            for(int i=0;i<size;i++){
                String curr =  q.poll();
                char [] word =  curr.toCharArray();
            for(int j=0;j<word.length;j++){
                char original = word[j];
                for(char c ='a';c<='z';c++){
                    if(word[j]==c)continue;
                    word[j]=c;
                    String newWord= String.valueOf(word);
                    if(newWord.equals(endWord))return level+1;
                    if(set.contains(newWord)){
                        q.offer(newWord);
                        set.remove(newWord);
                        
                    }
                }
                word[j]=original;
            }
                
            }
            
            
            level++;
        }
        return 0;
        
    }
}




//Using Forward and Backward BFS (Best Solution)




class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
          if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> dict = new HashSet<>(wordList);
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);

        int step = 1;
        Set<String> visited = new HashSet<>();
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }
            Set<String> temp = new HashSet<>();
            for (String word : beginSet) {
                char[] chs = word.toCharArray();
                for (int i = 0; i < chs.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String target = String.valueOf(chs);
                        if (endSet.contains(target)) {
                            return step + 1;
                        }
                        if (!visited.contains(target) && dict.contains(target)) {
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                }
            }
            beginSet = temp;
            step++;
        }
        return 0;
    }
}