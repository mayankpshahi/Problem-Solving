


//Valid BST from Preorder





public class Solution {
    public int solve(int[] A) {
        int a=0,b=1,c=2;

    if(A.length<=2)
    return 1;

    while(c<A.length)
    {
        if(A[a]<A[b]&&A[b]>A[c]&&A[c]<A[a])
        return 0;
        
        a++;
        b++;
        c++;
    }
return 1;
    }
}
