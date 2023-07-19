package  SortingAlgorithms;
import java.util.*;

public class SelectionSort{
    public static void  SelectionSorting(int[]arr){
        
        //loop for the number of passes
        //loop (n-1)
        for(int i=0;i<arr.length-1;i++){
            int min_index = i; //taking i as minimum value
            for(int j=i+1;j<arr.length;j++) //loop for checking other elements for smaller value
            {
                if(arr[j]<arr[min_index]){
                    //swap function
                    int temp =arr[j];
                    arr[j]=arr[min_index];
                    arr[min_index]= temp;
                }

            }
        }
        
    }
    public static void main(String[]args){
         int []arr = {64,25,12,22,11};
          SelectionSorting(arr);
          System.out.println(Arrays.toString(arr));


    }
}
