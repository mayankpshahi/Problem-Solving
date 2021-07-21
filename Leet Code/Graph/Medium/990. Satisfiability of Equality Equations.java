



//990. Satisfiability of Equality Equations


class Solution {
    int parent[];
    int rank[];
    public boolean equationsPossible(String[] equations) {
        parent = new int[26];
        rank = new int [26];
        
         for (int i = 0; i < 26; i++) {
		 parent[i] = i;
		 rank[i] = 1;
	  }
      for(int i=0;i<equations.length;i++){
          String s =  equations[i];
          int n1 = s.charAt(0) - 'a';
           int n2 = s.charAt(3) - 'a';
          if(s.substring(1,3).equals("==")){
              union(n1,n2);
          }
      }
      
       for(int i=0;i<equations.length;i++){
          String s =  equations[i];
          int n1 = s.charAt(0) - 'a';
           int n2 = s.charAt(3) - 'a';
          if(s.substring(1,3).equals("!=")){
              int parent1  = find(n1);
              int parent2  = find(n2);
              
              if(parent1==parent2) return false;
          }
      }
        
      return true;
        
    }
     public int find(int x){
        if( parent[x]==x )
            return x;
        return parent[x] = find(parent[x]);
    }
    public void union(int x, int y){
        int xParent = find(x);
        int yParent = find(y);
        //If  parents are same it means x & y are already merged
        if(xParent == yParent) return;
        //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
        //distinctGroups--;
        if(rank[xParent] < rank[yParent]){
            parent[xParent] = yParent;
        }else if(rank[xParent] > rank[yParent]){
            parent[yParent] = xParent;
        }else{
            parent[xParent] = yParent;
            rank[yParent]++;
        }
    }
}