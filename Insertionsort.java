import java.util.*;
import java.io.*;

public class Insertionsort{
    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();
        
        int arr[] = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = Sc.nextInt();
        }
        for(int i=1; i<m; i++){
            int j=i-1;
            while(j>=0 && arr[j]>=arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        sort(arr);
    }
}
