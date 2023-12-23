package com.prac;

public class BinarySearch {
    int binarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - 1) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            return binarySearch(arr, mid + 1, right, x);

        }
        return -1;
    }

    public static void main(String args[]){
        BinarySearch ob =new BinarySearch();
        int arr[]={2,3,5,7,9,10};
        int length = arr.length;
        int x=10;
        int result = ob.binarySearch(arr,0,length-1,x);
        if(result == -1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }
}


