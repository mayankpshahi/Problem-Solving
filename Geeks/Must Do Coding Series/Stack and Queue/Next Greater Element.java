
//Next Greater Element 

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        Stack<Long> st = new Stack<>();
        long next[] = new long[arr.length];
 
      
        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (!st.empty()){
             while (!st.empty() && st.peek() <= arr[i])
                 st.pop();
            }
            next[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        
        return next;
        
    } 
}