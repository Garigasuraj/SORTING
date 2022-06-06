import java.util.*;
import java.io.*;

public class Bubblesort{
    public static void sort(int arr[]){
        int n= arr.length-1;
        for(int j=0; j<n; j++){
          for(int i=0; i<n; i++){
              if(arr[i]>arr[i+1]){
              int temp = arr[i+1];
              arr[i+1] = arr[i];
              arr[i]= temp;
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
