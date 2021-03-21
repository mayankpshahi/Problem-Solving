


class Solution {
    String printLargest(String[] arr) {
        
        ArrayList<String> l = new ArrayList<String>();
        
         for(int i=0;i<arr.length;i++)
           l.add(arr[i]);
        
         Collections.sort(l, new Comparator<String>()
        {
        
            @Override public int compare(String X, String Y)
            {
 
               
                String X_Y = X + Y;
 
                String Y_X = Y + X;
 
                return X_Y.compareTo(Y_X) > 0 ? -1 : 1;
            }
        });
        
        String str = "";
        
        for(int i=0;i<l.size();i++)
          str+=l.get(i);
          
    return str;
    }
}