//Maximum and minimum of an array using minimum number of comparisons

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxMin_Array_1{
    static class Pair{
        int min;
        int max;

    }
    static Pair findMinMax(int arr[]){
        Pair minmax = new Pair();
        if(arr.length == 1){
            minmax.max = arr[0];
            minmax.min  = arr[0];
            return minmax;
        }

        if(arr[0]>=arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
for(int i=2;i<arr.length;i++){
    if(arr[i]>minmax.max){
        minmax.max = arr[i];

    }else if(arr[i]<minmax.min){
        minmax.min = arr[i];
    }
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
            Pair minmax = findMinMax(a);
            System.out.println(minmax.min);
            System.out.println(minmax.max);
            t--;


        }

    }
}
