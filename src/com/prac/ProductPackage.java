package com.prac;

public class ProductPackage {
    public static void main(String[] args) {
        int arr[] = {10, 20, 9, 40};
        int x = 400;
        int n = arr.length;

        ProductPackage pp=new ProductPackage();
         if(pp.isProduct(arr,n,x))

             System.out.println("Yes");
        else
             System.out.println("No");
    }



    boolean isProduct(int arr[],int n,int x){

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]*arr[j] == x){
                    return true;
                }
            }

        }
        return false;
    }
}

