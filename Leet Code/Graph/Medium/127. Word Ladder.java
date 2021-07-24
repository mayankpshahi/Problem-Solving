



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