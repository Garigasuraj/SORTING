import java.util.*;

public class sentence_sort {
    static String sort_sentence(String str){
        // split
        String arr[] = str.split(" ");
        // creating temp Array
        String temp_arr[] = new String[arr.length];
        String final_string ="";
        
        for(int i=0; i<arr.length; i++){
            // finding the index of number;
            int index = arr[i].charAt(arr[i].length()-1)-'0';
            // using substring
            temp_arr[index-1] = arr[i].substring(0,arr[i].length()-1);
        }
        // iterating an array
        for(String s : temp_arr){
            final_string += s;
            // printing space b/w them;
            final_string += " ";
        }
        // to elemenate extra spaces
        final_string = final_string.trim();
        return final_string;
    } 
	public static void main (String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    String str = Sc.nextLine();
	    
		System.out.println(sort_sentence(str));
	}
}
