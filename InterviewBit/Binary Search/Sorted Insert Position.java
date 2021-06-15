




//Sorted Insert Position


public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    int index = Collections.binarySearch(a,b);
      
      if(index<0){
          index = -index-1;
      }
      
      return index;
	}
}
