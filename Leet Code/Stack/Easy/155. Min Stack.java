


//155. Min Stack




class MinStack {

    /** initialize your data structure here. */
    Stack<Long> s;
    long min = Long.MIN_VALUE;
    public MinStack() {
        s= new Stack<>();
    }
    
    public void push(int val) {
        if (s.isEmpty()){
            s.push(0L);
            min=val;
        }else{
            s.push(val-min);//Could be negative if min value needs to change
            if (val<min) min=val;
        }
        
    }
    
    public void pop() {
        if (s.isEmpty()) return;
        
        long pop=s.pop();
        
        if (pop<0)  min=min-pop;//If negative, increase the min value
    }
    
    public int top() {
     long top=s.peek();
        if (top>0){
            return (int)(top+min);
        }else{
           return (int)(min);
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */