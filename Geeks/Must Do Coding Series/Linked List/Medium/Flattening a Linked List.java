
//Flattening a Linked List

class GfG
{
    Node mergeTwoList(Node l1,Node l2){
        Node temp =  new Node(0);
        Node res = temp;
        
        while(l1!=null && l2!=null){
            if(l1.data < l2.data){
                temp.bottom  =  l1;
                temp = temp.bottom;
                l1 = l1.bottom;
            }else{
                temp.bottom  =  l2;
                temp = temp.bottom;
                l2 = l2.bottom;
            }
            
        }
        if(l1!=null) temp.bottom = l1;
        else temp.bottom = l2;
        
        return res.bottom;
    }
    Node flatten(Node root)
    {
	// Your code here
	if(root == null || root.next==null)
	   return root;
	
	root.next = flatten(root.next);
	
	root =  mergeTwoList(root,root.next);
	
	return root;
	 
    }
}