



//1079. Letter Tile Possibilities

class Solution {
    private int count =0;
    public  int numTilePossibilities(String tiles) {
        int []freq =  new int[26];
        Arrays.fill(freq,0);
        
        for(int i=0;i<tiles.length();i++) freq[tiles.charAt(i) - 'A']++;
        
        countseq(freq);
        
        return count;
        
        
    }
    
    private void countseq(int [] freq){
    
    for(int i=0;i<26;i++){
      if(freq[i]>0){
           count++;
          freq[i]--;
         
          
          countseq(freq);
          freq[i]++;
      }  
    }
        
    }
}