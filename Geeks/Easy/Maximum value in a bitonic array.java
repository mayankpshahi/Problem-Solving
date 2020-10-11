//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {

    int binaryMax(int arr[],int l,int r){

        if(l==r){
            return arr[l];}

        if((r==l+1) && arr[l]>=arr[r]){
            return arr[l];}

        if((r==l+1) && arr[l]<arr[r]){
            return arr[r];}


        int mid = (l + r)/2;

        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            return arr[mid];}

        if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
            return binaryMax(arr,l,mid-1);}
        else{
        return binaryMax(arr,mid+1,r);

        }




    }
    int findMaximum(int[] arr, int n) {
        // code here
        int r = n-1;
        int l = 0;

        //Solution s = new Solution();
        int result=binaryMax(arr,l,r);


        return result;







    }
}
