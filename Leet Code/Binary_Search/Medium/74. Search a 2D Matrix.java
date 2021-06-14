


//74. Search a 2D Matrix


class Solution {
    public boolean searchMatrix(int[][] A, int B) {
          int n=A.length;
            int m=-1;

    for(int i=0;i<n;i++){
        m=Math.max(m,A[i].length);
    }
    
    int r=(n*m)-1;
    int val=binarysearch(A,B,0,r,n,m);
    
    ///////////
    if(val!=-1){
        return true;
    }
    return false;
    }
    private int binarysearch(int [][]a,int b,int l,int r,int n,int m){
    if(l<=r){
        int mid=l+((r-l)/2);
       int y=mid/m;
        int x=mid%m;
        
        if(a[y][x]==b){
            return mid;
        }
        else if(a[y][x]>b){
            return binarysearch(a,b,l,mid-1,n,m);
        }
        else if(a[y][x]<b){
            return binarysearch(a,b,mid+1,r,n,m);
        }
        
        
    }
    return -1;
}
}