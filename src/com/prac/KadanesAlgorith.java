package com.prac;

/**Given an array Arr[] of N integers.
 *  Find the contiguous sub-array(containing at least one number)
 *  which has the maximum sum and return its sum.
 *
 */

public class KadanesAlgorith {
    static void maxSubArraySum(int arr[],int size){
        int maxValue=Integer.MIN_VALUE;
        int maxEndinghere=0;
        int start=0;
        int end=0;
        int s=0;
        for (int i=0;i <size; i++){
            maxEndinghere += arr[i];
            if(maxValue < maxEndinghere){
                maxValue = maxEndinghere;
                start=s;
                end=i;
            }

            if(maxEndinghere < 0){
                maxEndinghere=0;
                s=s+1;
            }

        }
        System.out.println("Maximum contiguous sum is "
                + maxValue);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);

    }

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        maxSubArraySum(a, n);
    }
}