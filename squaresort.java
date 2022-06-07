import java.util.*;
import java.io.*;

public class squaresort {
    static void sort(int arr[], int n){
        int k;
        for(k=0; k<n; k++){
            if(arr[k]>=0){
                break; // k= 3,4,5;
            }
        }
        int i=k-1; int j=k; int x=0;
        // creating an new Array
        int arr1[] = new int[n];
        
        while(i>=0 && j<n){
            if(arr[i]*arr[i] < arr[j]*arr[j]){
                arr1[x++]=arr[i]*arr[i];
                i--;
            }
            else{
                arr1[x++] = arr[j]*arr[j];
                j++;
            }
        }
         // copying remaing elements
            while(i>=0){
                arr1[x++] = arr[i]*arr[i];
                i--;
            }
            while(j<n){
                arr1[x++] = arr[j]*arr[j];
                j++;
            }
        // copying temp(arr1) array into original array
        for(int c=0; c<n; c++){
            arr[c] = arr1[c];
        }
    }
    public static void main(String[] args) { // time complexity = O(n)
                                             // space complexity = O(n)
        int arr[] = {-6,-3,-1,2,4,5};
        int n = arr.length;
        int sum =0;
        
        sort(arr,n);
        
        //printing the array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
