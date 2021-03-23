
//Intersection Point in Y Shapped Linked Lists

class Intersect
{
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         if(head1 == null || head2 == null) return 0;
    
    Node atrav = head1;
    Node btrav = head2;
    
    while( atrav != btrav){
    	
        atrav = atrav == null? head2 : atrav.next;
        btrav = btrav == null? head1 : btrav.next;    
    }
    
    return atrav.data;
	}
}
