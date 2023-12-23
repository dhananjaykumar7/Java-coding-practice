package com.prac;

public class MajorityElement1 {

    void printMajority(int a[], int size) {
        int cand = findCandidate(a, size);
        /* Print the candidate if it is Majority*/
        if (isMajorityIndex(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }

    /* Function to find the candidate for Majority */
    int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        for (int i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }

        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more
      than n/2 times */
    boolean isMajorityIndex(int a[], int size, int c) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == c) {
                count++;
            }
        }
            if (count > size / 2)
                return true;
            else
                return false;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 1, 3, 3, 1, 2 ,3};

        // Function call
        int size = a.length;
        MajorityElement1 m=new MajorityElement1();
        m.printMajority(a,size);

    }
}
