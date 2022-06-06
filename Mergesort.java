import java.io.*;
import java.util.*;

public class Mergesort {
    public static void sort(int arr[], int L, int mid, int R){
        // creating an merged array
        int merge[] = new int[R-L+1];
        // setting index 1 and 2;
        int index1 = L;
        int index2 = mid+1;
        int x =0; // for merged sort
        
        while(index1<=mid && index2<=R){
            if(arr[index1]<=arr[index2]){
                merge[x++] = arr[index1++];
            }
            else{
                merge[x++] = arr[index2++];
            }
        }
        // printing the remaning elements in merged[x]
        while(index1<=mid){
            merge[x++] = arr[index1++];
        }
        while(index2<=R){
            merge[x++] = arr[index2++];
        }
        // copying the merged elements in an original array
        for(int i=0, j=L; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
    public static void divide(int arr[], int L, int R){
        if(L>=R){
            return;
        }
        // finding the mid
        int mid = L+(R-L)/2;
        divide(arr, L, mid);
        divide(arr, mid+1, R);
        sort(arr, L, mid, R);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();
        
        int arr[] = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = Sc.nextInt();
        }
        divide(arr, 0, m-1);
        // printing an array
        for(int i=0; i<m; i++){
            System.out.print(arr[i]+" ");
            
            // time complexitu = O(nlogn)
        }
    }
}
