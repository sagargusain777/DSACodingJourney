package SortingAlgorithms;
import java.util.*;
public class Insertionsort {
    public static void main(String[]args){
        int []arr ={3,2,5,4,1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Insertion(int []arr){
        //loop for the number of passes
        for(int i=0;i<arr.length-1;i++){
            //loop for arranging the elements
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]) //Comparing j is smaller than j-1(previous element)
                {
                    //swapfunction
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
    
}
