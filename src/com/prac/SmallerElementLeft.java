package com.prac;
// Java implementation of simple algorithm to find smaller
// element on left side
public class SmallerElementLeft {

    static void printPreviousSmaller(int arr[],int n){
        // Always print empty or '_' for first element
        System.out.print("_, ");
        // Start from second element
        for(int i=1; i<n;i++){
            // look for smaller element on left of 'i'
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j] < arr[i]){
                    System.out.print(arr[j]+", ");
                    break;
                }
            }
            // If there is no smaller element on left of 'i'
            if(j == -1)
                System.out.print("_, ");
        }
    }
    public static void main(String[] ars){
        int[] arr={1,3,0,2,5};
        int n=arr.length;
        printPreviousSmaller(arr,n);
    }
}
