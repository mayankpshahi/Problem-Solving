


//LRU Cache


public class Solution {
    
     final Node head =  new Node();
    final Node tail = new Node();
    
    Map<Integer,Node> node_map;
    int cache_capacity;
    
    public Solution(int capacity) {
         node_map = new HashMap<>(capacity);
        this.cache_capacity = capacity;
        head.next = tail;
        tail.prev =  head;
        
    }
    
    public int get(int key) {
         int res = -1;
        Node node =  node_map.get(key);
        if(node!=null){
            res = node.val;
            remove(node);
            add(node);
        }
        
        return res;
        
        
    }
    
    public void set(int key, int value) {
        Node node = node_map.get(key);
        if(node!=null){
            remove(node);
            node.val = value;
            add(node);
        }else{
            if(node_map.size()==cache_capacity){
                node_map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node=  new Node();
            new_node.key =  key;
            new_node.val =  value;
            
            node_map.put(key,new_node);
            add(new_node);
        }
        
    }
    
     public void add(Node node){
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
        
        
        
    }
    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;
        
        prev_node.next = next_node;
        next_node.prev = prev_node;
    }
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
    
    
}
