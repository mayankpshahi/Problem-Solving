



//Implement Stack using Linked List

class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;
    public boolean isEmpty()
    {
        return top == null;
    }

    void push(int a) {
        // Add your code here
        StackNode t = new StackNode(a);
        t.data = a;
        t.next = top;
        top = t;
    }
    int pop() {
        // Add your code here
        if (!isEmpty()) {
            int p = top.data;
            top = top.next;
            return p;
        }
        else {
            return -1;
        }
    }
}
