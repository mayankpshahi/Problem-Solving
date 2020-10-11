My solution:

class Solution {
    public int[] processQueries(int[] queries, int m) {
        
        List<Integer> v = new LinkedList<>();
        for(int i=1;i<=m;i++){
            v.add(i);
        }
        int [] res = new int[queries.length];
        int k = 0;
        for(int query:queries){
            int p = v.indexOf(query);
            res[k++] = p;
            v.add(0,v.get(p));
            v.remove(p+1);
        }
        
        return res;
    }
   
    
}

Other solution:

class Solution {    
    public int[] processQueries(int[] queries, int m) {
        
        int[] ans = new int[queries.length];
        
		// Store the elements in array
        int[] nums = new int[m];
        for(int i=0; i<m; i++) {
            nums[i] = i+1;
        }
                
        for(int i=0; i<queries.length; i++) {
            int index = 0;
            int query = queries[i];
            
            for(int j=0; j<nums.length; j++) {
                
				// Find the position of the queries[i] element and store the index in ans array
                if(nums[j] == query) {
                    index = j;
                    ans[i] = index;
                    break;
                }
            }
            
			// To add the queries[i] element in beginning we have to shift the element from the index to i=1;
            int temp = nums[index];
            for(int k=index; k>0; k--) {
                nums[k] = nums[k-1];
            }
            
            nums[0] = temp;
        }
        
        return ans;
    }
}