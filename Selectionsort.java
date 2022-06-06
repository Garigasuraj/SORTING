import java.util.*;
import java.io.*;

public class Selectionsort{
    public static void sort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int fixed = i;
            // i+1 = comparing fixed with other elements
            for(int j=i+1; j<n; j++){
                if(arr[fixed]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[fixed];
                    arr[fixed]=temp;
                    
                }
                
            }
            
        }
    }
    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();
        
        int arr[] = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = Sc.nextInt();
        }
        sort(arr);
        
        // printing the Array
        for(int i=0; i<m; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
