//Maximum and minimum of an array using minimum number of comparisons

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxMin_Array_2{
    static class Pair{
        int min;
        int max;

    }
    static Pair findMinMax(int arr[],int low,int high){
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;
        if(low == high){
            minmax.max = arr[low];
            minmax.min  = arr[low];
            return minmax;
        }
    if(high==low+1){
        if(arr[low]>=arr[high]){
            minmax.max = arr[low];
            minmax.min = arr[high];
        }else{
            minmax.max = arr[high];
            minmax.min = arr[low];
        }
    }
    mid = (high+low)/2;
    mml = findMinMax(arr,low,mid);
    mmr = findMinMax(arr,mid+1,high);
    if(mmr.min<mml.min){
        minmax.min = mmr.min;
    }else{
        minmax.min = mml.min;
    }
    if(mmr.max>mml.max){
        minmax.max = mmr.max;
    }else{
        minmax.max = mml.max;
    }


return minmax;


    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++ ){
                a[i] = sc.nextInt();
            }
            Pair minmax = findMinMax(a,0,n-1);
            System.out.println(minmax.min);
            System.out.println(minmax.max);
            t--;


        }

    }
}
